package io.confluent.developer.spring.avro;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.stereotype.Service;

import io.confluent.developer.Claim_avro;
import lombok.extern.apachecommons.CommonsLog;

import java.io.IOException;

@Service
@CommonsLog(topic = "Consumer Logger")
public class Consumer {

  @Autowired
  private SimpMessagingTemplate webSocket;

  @KafkaListener(topics = "test-ux", groupId = "test")
  public void consume(ConsumerRecord<String, GenericRecord> cr, @Payload Claim message) throws InterruptedException, IOException {
    System.out.println(String.format("Consumed message -> %s", message));

    //ObjectMapper mapper = new ObjectMapper();
    //Claim claim = mapper.readValue(record.value().toString(), Claim.class);
    this.webSocket.convertAndSend(Constants.WEBSOCKET_DESTINATION, message);
    Thread.sleep(3000);
  }
}
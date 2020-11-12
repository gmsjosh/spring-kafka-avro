package io.confluent.developer.spring.avro;

public class Claim {

    private int CL_ClaimID;
    private double CL_FeeSubmitted;
    private double CL_TotalOwed;
    private boolean CL_Paid;
    private String CS_Description;
    private int CL_ProcessDate;
    private String CB_Description;

    public Claim() {

    }

    public Claim(int CL_ClaimID, double CL_FeeSubmitted, double CL_TotalOwed, boolean CL_Paid, String CS_Description, int CL_ProcessDate, String CB_Description) {
        this.CL_ClaimID = CL_ClaimID;
        this.CL_FeeSubmitted = CL_FeeSubmitted;
        this.CL_TotalOwed = CL_TotalOwed;
        this.CL_Paid = CL_Paid;
        this.CS_Description = CS_Description;
        this.CL_ProcessDate = CL_ProcessDate;
        this.CB_Description = CB_Description;
    }

    public int getCL_ClaimID() {
        return CL_ClaimID;
    }

    public void setCL_ClaimID(int CL_ClaimID) {
        this.CL_ClaimID = CL_ClaimID;
    }

    public double getCL_FeeSubmitted() {
        return CL_FeeSubmitted;
    }

    public void setCL_FeeSubmitted(double CL_FeeSubmitted) {
        this.CL_FeeSubmitted = CL_FeeSubmitted;
    }

    public double getCL_TotalOwed() {
        return CL_TotalOwed;
    }

    public void setCL_TotalOwed(double CL_TotalOwed) {
        this.CL_TotalOwed = CL_TotalOwed;
    }

    public boolean isCL_Paid() {
        return CL_Paid;
    }

    public void setCL_Paid(boolean CL_Paid) {
        this.CL_Paid = CL_Paid;
    }

    public String getCS_Description() {
        return CS_Description;
    }

    public void setCS_Description(String CS_Description) {
        this.CS_Description = CS_Description;
    }

    public int getCL_ProcessDate() {
        return CL_ProcessDate;
    }

    public void setCL_ProcessDate(int CL_ProcessDate) {
        this.CL_ProcessDate = CL_ProcessDate;
    }

    public String getCB_Description() {
        return CB_Description;
    }

    public void setCB_Description(String CB_Description) {
        this.CB_Description = CB_Description;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "CL_ClaimID=" + CL_ClaimID +
                ", CL_FeeSubmitted=" + CL_FeeSubmitted +
                ", CL_TotalOwed=" + CL_TotalOwed +
                ", CL_Paid=" + CL_Paid +
                ", CS_Description='" + CS_Description + '\'' +
                ", CL_ProcessDate=" + CL_ProcessDate +
                ", CB_Description='" + CB_Description + '\'' +
                '}';
    }
}


package com.chixing.day14_file;

import java.util.Date;

public class TransRecord {
    private String customerNumber;
    private String customerName;
    private String orgNo;
    private int customerGendedr;
    private String transAccountNo;
    private Date transDate;
    private float transMoney;

    public TransRecord(){}
    public TransRecord(String customerNumber, String customerName, String orgNo, int customerGendedr, String transAccountNo, Date transDate, float transMoney) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.orgNo = orgNo;
        this.customerGendedr = customerGendedr;
        this.transAccountNo = transAccountNo;
        this.transDate = transDate;
        this.transMoney = transMoney;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public int getCustomerGendedr() {
        return customerGendedr;
    }

    public void setCustomerGendedr(int customerGendedr) {
        this.customerGendedr = customerGendedr;
    }

    public String getTransAccountNo() {
        return transAccountNo;
    }

    public void setTransAccountNo(String transAccountNo) {
        this.transAccountNo = transAccountNo;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public float getTransMoney() {
        return transMoney;
    }

    public void setTransMoney(float transMoney) {
        this.transMoney = transMoney;
    }

    @Override
    public String toString() {
        return "TransRecord{" +
                "customerNumber='" + customerNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orgNo='" + orgNo + '\'' +
                ", customerGendedr=" + customerGendedr +
                ", transAccountNo='" + transAccountNo + '\'' +
                ", transDate=" + transDate +
                ", transMoney=" + transMoney +
                '}';
    }
}

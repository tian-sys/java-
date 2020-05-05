package com.chixing.day14_file;

import java.util.Date;


/*
    订单中封装了 所属的用户
 */
public class MyOrder {

     private long orderId;
     private Date orderTime;
     private float ordedrMoney;
     private int payType;
     private String ordedStatus;
     private Customer customer;

    public MyOrder(){}
    public MyOrder(long orderId, Date orderTime, float ordedrMoney, int payType, String ordedStatus, Customer customer) {
        this.orderId = orderId;
        this.orderTime = orderTime;
        this.ordedrMoney = ordedrMoney;
        this.payType = payType;
        this.ordedStatus = ordedStatus;
        this.customer = customer;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public float getOrdedrMoney() {
        return ordedrMoney;
    }

    public void setOrdedrMoney(float ordedrMoney) {
        this.ordedrMoney = ordedrMoney;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getOrdedStatus() {
        return ordedStatus;
    }

    public void setOrdedStatus(String ordedStatus) {
        this.ordedStatus = ordedStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "orderId=" + orderId +
                ", orderTime=" + orderTime +
                ", ordedrMoney=" + ordedrMoney +
                ", payType=" + payType +
                ", ordedStatus='" + ordedStatus + '\'' +
                ", customer=" + customer +
                '}';
    }
}

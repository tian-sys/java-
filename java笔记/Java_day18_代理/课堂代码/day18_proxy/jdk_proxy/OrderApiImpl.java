package com.chixing.day18_proxy.jdk_proxy;

public class OrderApiImpl implements  OrderApi {
    @Override
    public int saveOrder() {
        System.out.println("创建新订单");
        return 1;

    }

    @Override
    public void getOrder() {
        System.out.println("获得订单");

    }

    @Override
    public void deleteOrder() {
        System.out.println("删除订单");

    }
}

package com.chixing.day18_proxy.jdk_proxy;

public class TestJDKProxy {

    public static void main(String[] args) {

        OrderApi api = (OrderApi) (  new OrderProxy( new OrderApiImpl()  ).newProxy() );
        api.getOrder();




    }
}

package com.chixing.day09_interface;

import java.util.Calendar;

public class TestApi {


    int a = 10;
    static  int b = 10;

    public static void main(String[] args) {
        MockServiceApi api1 = new MockServiceImplA();

        String name = MockServiceApi.plat_name;

        api1.getPhoneCode(18938439433L);



        MockServiceApi api2 = new MockServiceImplB();





    }
}

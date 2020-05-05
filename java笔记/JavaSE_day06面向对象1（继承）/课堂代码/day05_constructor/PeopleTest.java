package com.chixing.day05_constructor;

import com.chixing.day04_oop.Person;

public class PeopleTest {
    public static void main(String[] args) {

        People p1 = new People();

        People p2 = new People();

        People p3 = new People();

       boolean result  =  p1.canMarry(p2);

        p2.canMarry(p3);


        p1.canMarry(null);
        p1.canMarry(p1);




    }
}

package com.chixing.day10_string;

import java.util.UUID;

public class StringDemo {
    public static void main(String[] args) {

        int a = 10;
        final int b = 20;

        String s1 = "hello";   // final char[] values =  {'h','e','l','l','o'}  值不能改变

        String s2 = "hello";

        System.out.println("s1 == s2 : " + (s1 == s2));

        String s3 =  new String("good");

        System.out.println("s1 == s3 : " + (s1 == s3));

        String s4 =  "good";
        System.out.println("s4 == s3 : " + (s4 == s3));

        String s5 =  new String("good");
        System.out.println("s5 == s3 : " + (s5 == s3));

        String s6 =  "good";
        System.out.println("s4 == s6 : " + (s4 == s6));



        /* ================================================== */
        String str1 = "clone-finalize-getClass-notify-notifyAll-wait";
        str1.length();  //长度
        str1.contains("a");
        str1.startsWith("cl");
        str1.endsWith(".txt");
        String newStr = str1.replace("a","AA");
        System.out.println("newStr = " + newStr);

        str1.charAt(4);
        int index = str1.indexOf('Z');

        str1 = "abcde"; // {'a','b','c','d','e'} , {97,98,99,100,101}
        byte[] bytes = str1.getBytes();
        for(int i = 0;i<str1.length();i++){
            System.out.println(bytes[i] + ", ");
        }

        str1 = "clone-finalize-getClass-notify-notifyAll-wait";
        String[] strArr = str1.split("-"); //{ "clone","finalize","getClass" ,....}


       String uuid1 =  UUID.randomUUID().toString();  //c0346beb-73c8-43df-be0e-1f54a04abf34
        System.out.println("old uuid1 :" + uuid1);  //处理结果为： c0346beb73c843dfbe0e1f54a04abf34
        uuid1 = uuid1.replace("-","");
        System.out.println("new uuid1 :" + uuid1);

        str1.toCharArray();

        String str2 = " hel lo ";
        String str3 = "file";
        String str4 =  str2 + str3;
        String srt5 = str2.concat(str3);//"hellofile"

        str1.trim();

        str1 = "clonefinalizegetClass";
        str1.substring(1,3); //lo


    }
}

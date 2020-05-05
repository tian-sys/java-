package com.chixing.day14_file;

import java.io.UnsupportedEncodingException;

public class CharacterEncodingDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {

        /* =============IDEA 默认的编码方式=================== */
        System.out.println("============1. IDEA 默认的编码方式 ================== " );
        String s1 = "你";
        byte[] bytes1 = s1.getBytes();   // String -- byte[]
        System.out.println("IDEA 默认的编码方式 ,你 所占字节数 " + bytes1.length); //所占字节数  3
        for(byte b:bytes1){
            System.out.println(b + ",");  // 字节数值 -28，-67，-96
        }


        //byte[] ---> String
       String s2 =  new String(bytes1);
        System.out.println(s2);

        System.out.println("============2. ISO-8859-1编码方式 ================== " );

         String s3 = new String("你".getBytes(),"ISO-8859-1");
        byte[] bytes2 =s3.getBytes();
        System.out.println("ISO-8859-1编码方式,你 所占字节数 " + bytes2.length); //所占字节数  6
        for(byte b:bytes2){
            System.out.println(b + ",");
        }

        // 创建该字符串是 ISO-8859-1， 转换成byte[]
        //将该byte[] 转换成字符串，使用另一种编码方式UTF-8
        String s4 =  new String(bytes2,"UTF-8");
        System.out.println(s4);

    }

}

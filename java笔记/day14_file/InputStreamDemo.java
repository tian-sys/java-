package com.chixing.day14_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {

    public static void main(String[] args) {

        // 1. 创建字节读取流 InputStream
        InputStream is = null;
        try {
           is =  new FileInputStream("d://hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int tmp ;
        int count =0 ;
        // 数组用于接收每次读取的字节
        byte[] bytes = null;
        try {
            bytes =  new byte[is.available()];
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 2. 文件读取
        try {

            while(( tmp = is.read()  )!=-1){
                bytes[count++] = (byte) tmp;
            }



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is !=null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    // 读取完之后，将byte[] 转换成String
        String content = new String(bytes);
     System.out.println("content:"+content);

    }


}

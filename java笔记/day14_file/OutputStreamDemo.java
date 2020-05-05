package com.chixing.day14_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*

    字节流： 写入流 （OutputStream） , 读取流（InputStream）

    OutputStream 是抽象类，是所有字节写入流的父类
    示例：
        写数据到d://hello.txt文件中
        步骤：
            （1）创建一个字节写入流
            （2）写入数据  write
            （3）关闭流

    InputStream 是抽象类，是所有字节读取流的父类
        read



 */
public class OutputStreamDemo {

    public static void main(String[] args) {
        OutputStream os = null;

        try {
            os = new FileOutputStream("d://helloByte.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String content = "hello byte";  // ===> byte[]  {45,76,23,...}


        try {
            os.write(content.getBytes());  // write 内部还是挨个字节写入
        } catch (IOException e) {
            e.printStackTrace();
        }/*finally {  *//* 释放资源，节省内存  ： 流 *//*
            if(os!=null) {  // 防止空指针异常
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/


    }


}

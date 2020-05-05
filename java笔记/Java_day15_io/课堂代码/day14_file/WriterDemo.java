package com.chixing.day14_file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        Writer w = null;
        try {
           w = new FileWriter("d:\\helloChar.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            w.write("hello char");
            w.flush();// 刷新缓冲池中的数据到 文件中

        } catch (IOException e) {
            e.printStackTrace();
        }/*finally {
            if(w!=null) {
                try {
                    w.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }
}

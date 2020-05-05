package com.chixing.day14_file;

import java.io.*;

/**
 * buffer作用是什么？
 * 提高读写效率
 * 原本是挨个字符读，写，  先将数据写道缓冲中，缓冲如果数据满了，就将缓冲的数据写入到文件中
 *
 *
 * 程序（字符串） -----  硬盘 （ d://hello.txt ）
 *
 * 本身 对硬盘的IO操作单次的消耗就是重量级
 *
 * 所以希望减少与硬盘的交互次数====> 减少与硬盘的IO 次数
 *
 * 提出了缓冲，提高读写效率
 *
 */
public class BufferedDemo {


    /**
     * 写数据到文件中
     * @param file  指定文件
     * @param content   写入的内容
     * @return  返回写好的文件
     */
    public static File write(File file,String content ){

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(  new FileOutputStream(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            bw.write(content);
            bw.flush();  // 刷新缓冲
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bw!=null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return file;
    }

    /**
     * 读取文件中的数据
      * @param file 指定的文件
     * @return  返回文件中读取的数据
     */
    public static String read(File file){

        String result = "";

        BufferedReader br = null;
        try {
           br  = new BufferedReader( new InputStreamReader(  new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String temp = null;
        try{
            while((temp = br.readLine()) !=null){  // 读取每行数据

                System.out.println(temp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(br!=null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return result;
    }



    public static void main(String[] args) {
       String result =  read(new File("d://hello.txt"));
       System.out.println(result);

    }
}

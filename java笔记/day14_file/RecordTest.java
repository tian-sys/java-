package com.chixing.day14_file;

import com.chixing.day14_file.exception.InvalidRecordException;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
   涉及知识点：
    对象，IO,异常，数组，字符串，集合，包装类，类型转换，泛型
 */
public class RecordTest {
    public static void main(String[] args) {

        // 有效的交易记录集合
        List<TransRecord> recordList = new ArrayList<>();
        //无效的交易记录集合
        List<TransRecord> invalidrecordList = new ArrayList<>();

        //F:\W01\workspace\JavaSE_course
        System.out.println(System.getProperty("user.dir"));



        //1. 读取文件
        String pathname = System.getProperty("user.dir") + "\\src\\com\\chixing\\day14_file\\record.txt" ;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(pathname)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //2. 获得每一行   000201|晓龙|0002|1|4155990199999999|20060720200005|500.00
        String line ="";
        try {
            while ((line = br.readLine()) != null) {

                //3. String[] arr = String.split("...")  {"000201","晓龙","0002",....}
                String[] arr  = line.split("\\|");


                //4. 获得 arr[0],arr[1] ,....
                //5.  对应数据类型转换
                String customerNumber = arr[0];
                String customerName = arr[1];
                String orgNo = arr[2];
                int customerGender = Integer.valueOf(arr[3]);  // 1, 0
                String transAccountNo = arr[4];

                float transMoney = Float.valueOf(arr[6]);



                 //6. 判断交易时间这列的值 .equals null
                if( !arr[5].equals("null")){  //6.1 若为false,转换成日期,封装成Record对象

                    Date transDate = DateUtil.string2Date(arr[5],DateUtil.DATE_PATTERN_YMDHMS);
                    recordList.add(new TransRecord(customerNumber,customerName,orgNo,customerGender,transAccountNo,transDate,transMoney) );

                }else{ //6.2 若为true,则为异常数据，自定义InvalidRecordException, catch 添加到异常集合中
                    try {
                        throw new InvalidRecordException( "交易记录异常");
                    } catch (InvalidRecordException e) {
                       invalidrecordList.add(new TransRecord(customerNumber,customerName,orgNo,customerGender,transAccountNo,null,transMoney));
                    }
                }

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




        //遍历两个集合
        System.out.println("=============有效的交易记录====================");
        for(TransRecord record:recordList){
            System.out.println(record);
        }

        System.out.println("=============无效的交易记录====================");
        for(TransRecord record:invalidrecordList){
            System.out.println(record);
        }



        ExcelUtil.import2Excel(recordList,"d://record.xls");

    }




}

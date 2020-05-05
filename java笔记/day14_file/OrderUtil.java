package com.chixing.day14_file;

import java.io.*;
import java.util.*;

public class OrderUtil {

    private static List<Customer> customerList = new ArrayList<>();
    private static List<MyOrder> orderList = new ArrayList<>();

    //读取文件中的数据，读取所有的customer，所有的order
    public static void readData(String pathname){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(pathname)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            br.readLine();  // 第一行 的标题行
        } catch (IOException e) {
            e.printStackTrace();
        }


        String line =""; //7788	3278328@qq.com	1323892292	38349384934893	2019-11-11 10:10	899.9	支付宝	已支付
        try {
            while ((line = br.readLine()) != null) {

                String[] arr = line.split("\t");

                int customerId = Integer.valueOf(arr[0]);
                String customerEmail = arr[1];
                long customerTelno = Long.valueOf(arr[2]);

                Customer customer = new Customer(customerId,customerEmail,customerTelno);

                long ordedrId = Long.valueOf(arr[3]);
                Date orderTime = DateUtil.string2Date(arr[4],DateUtil.DATE_PATTERN_YMDHMS3);
                float orderMoney = Float.valueOf(arr[5]);
                int payType = arr[6].equals("支付宝")?1:0;
                String orderStatus = arr[7];

                MyOrder order = new MyOrder(ordedrId,orderTime,orderMoney,payType,orderStatus,customer);


                customerList.add(customer);
                orderList.add(order);

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
        }

    //用户对应的交易数据集合
    public static Map<Customer,List<MyOrder>> custOrder(){

        Map<Customer,List<MyOrder>> map = new HashMap<>();
        for(MyOrder order:orderList){
            if(!map.containsKey(order.getCustomer())){
                List<MyOrder> customerOrderList = new ArrayList<>();
                customerOrderList.add(order);
                map.put(order.getCustomer(),customerOrderList);
            }else{
                map.get(order.getCustomer()).add(order);
            }
        }

        return map;
    }


    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\com\\chixing\\day14_file\\orders.txt" ;
        readData(pathname);


        //遍历两个集合
        System.out.println("=============用户记录====================");
        for(Customer c:customerList){
            System.out.println(c);
        }

        System.out.println("=============订单记录====================");
        for(MyOrder order:orderList){
            System.out.println(order);
        }
        System.out.println("=============用户对应的订单记录====================");

        Map<Customer,List<MyOrder>>  map = custOrder();
        System.out.println(map);

    }


}

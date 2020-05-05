package com.chixing.day02;

/**
 * 数组
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //变量
        int a =10;
        a = 30;


        //定义数组
        int[] arr1 = new int[10];
        arr1[0] = 30;
        arr1[1] = 45;
        arr1[2] = 76;
        arr1[3] = 83;
        arr1[4] = 91;
        arr1[5] = 18;
        arr1[6] = 10;
        arr1[7] = 8;



        int[] arr2 = {30,45,76,83,91};

//        int arr3[] = new int[10];

        //1. 获得数组的长度
       int len =   arr1.length;

        //2. 获得第三个元素
       int data1 =  arr1[2];

        //3. 获得最后一个元素
        int data2 = arr1[arr1.length-1];

        //for 输出arr1中每个元素的值

        for(int i =0;i<=arr1.length-1;i++){
            System.out.print(arr1[i] + ",");
        }

        //两个变量互换值
         a =10;
        int b = 20;

      int x =88;
      int y = 54;

      int c = x;
      x = y;
      y = c;


      // 数组中第6个元素与第4个元素的值 互换
        int temp = arr1[5];
        arr1[5] = arr1[3];
        arr1[3] = temp;


    //    System.out.println("a[10]:"+ arr1[10]);

    //1. 找出数组中的最大值 {30,45,76,83,91,45,26,15,56,19,20}

    //2. 创建新数组，将数组 {30,45,76,83,91,45,26,15,56,19,20}逆序 复制到新数组中


    }




















}

package com.chixing.day03;

public class LoopDemo2 {
    public static void main(String[] args) {
        int[] a = {30, 45, 76, 83, 91, 45, 26, 15, 56, 19}; //共10个元素
        int max = a[0];
        int min = a[0];

        for(int i = 1; i<a.length;i++){
            if(a[i] > max)
                max = a[i];

            if(a[i] < min)
                min = a[i];
        }
        System.out.println("max :"+max);
        System.out.println("min :"+min);



        //将a数组中的第4个元素 - 第8个元素 复制到新数组中
        int[] b = new int[8-4+1];
        for(int i =0;i<5;i++){  // b[0]=a[3], b[1]=a[4], b[2]=a[5], b[3]=a[6],...
            b[i] = a[i+3];
        }



    }
}

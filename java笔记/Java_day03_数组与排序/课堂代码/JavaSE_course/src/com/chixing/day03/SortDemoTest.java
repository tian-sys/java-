package com.chixing.day03;

public class SortDemoTest {

    public static void main(String[] args) {

        int[] a={30, 45, 76, 83, 0, 45, 0, 15, 56, 19};

//         a = SortDemo.selectSort(a);


        a = SortDemo.bubbleSort(a);

        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + ",");
        }

    }



}

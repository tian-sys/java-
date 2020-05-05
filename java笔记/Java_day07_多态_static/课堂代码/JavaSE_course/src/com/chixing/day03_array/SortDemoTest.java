package com.chixing.day03_array;

public class SortDemoTest {

    public static void main(String[] args) {

        int[] a={30, 45, 76, 83, 0, 45, 0, 15, 56, 19};

//         a = SortDemo.selectSort(a);


//        a = SortDemo.bubbleSort(a);

        a = SortDemo.quickSort(a);

        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + ",");
        }

    }



}

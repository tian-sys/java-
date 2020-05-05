package com.chixing.day04_oop;

public class HomeworkArray {
    public static void main(String[] args) {
        int[] a = {1, 5, 9, 7, 6, 59, 98, 89}; //10
        int[] b = {5, 8, 6, 8, 7, 5, 6, 45};  //5
        int[] c = new int[a.length + b.length];
        for(int i=0;i<c.length;i++){
            if(i<=a.length-1)
                c[i] = a[i];
            else
                c[i] = b[i-a.length];
        }

        int result ;
    int[] a1 = {78, 56, 67, 94, 73, 80, 62, 90, 88, 63}; //11 -1/2 = 5  , len/2 = x1, x1-1
        if(a1.length % 2 !=0  )
           result =  a1[(a1.length-1)/2];
        else
            result = (a1[a1.length/2] + a1[a1.length/2 -1] )/2;


    }
}

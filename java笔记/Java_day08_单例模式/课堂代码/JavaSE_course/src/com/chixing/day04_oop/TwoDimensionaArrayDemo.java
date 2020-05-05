package com.chixing.day04_oop;

public class TwoDimensionaArrayDemo {

    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int rows = a.length;        //行数
        int columns = a[0].length; //列数
        System.out.println(a.length);

        a[0][0] = 18;
        a[0][1] = 17;
        a[0][2] = 33;
        a[0][3] = 6;
        a[1][0] = 99;
        a[1][1] = 23;
        a[1][2] = 56;
        a[1][3] = 91;
        a[2][0] = 76;
        a[2][1] = 10;
        a[2][2] = 4;
        a[2][3] = 7;

        int[] b1 = {6,34};
        int[] b2 = {34,12,65,1,56};
        int[] b3 = {90,80,70};

        int[][] b = { {6,34} , {34,12,65,1,56}, {90,80,70}};
         System.out.println("b[1][1] = " + b[1][1]);
        System.out.println("b[2][1] = " + b[2][1]);
        System.out.println("第三行共有列数： " + b[2].length);

        //

    }
}

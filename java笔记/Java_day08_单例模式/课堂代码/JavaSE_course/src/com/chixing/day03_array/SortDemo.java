package com.chixing.day03_array;

/**
 * 数组排序工具类：该类提供了一些列的排序功能，如选择排序，冒泡排序，插入排序，快速排序等
 */
public class SortDemo {

    /**
     * 选择排序
     * @param a 源数组
     * @return 返回选择排序好的数组
     */
    public static int[] selectSort(int[] a) {  // int[] a = a = {30, 45, 76, 83, 7, 45, 10, 15, 56, 19};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }


    /**
     * 冒泡排序
     *
     * @param a 源数组
     * @return 返回冒泡排序后的数组
     */
    public static int[] bubbleSort(int[] a) { // int[] a = {30, 45, 76, 83, 7, 45, 10, 15, 56, 19}
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {  // a[0] a[1]....a[8] a[9]  a[j] a[j+1]
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }

            }
        }
        return a;
    }

    /**
     * 插入排序
     *
     * @param a 源数组
     * @return 插入排序好的数组
     */
    public static int[] insertSort(int[] a) {
        int length = a.length; //数组长度
        int j;               //当前值的位置
        int i;               //指向j前的位置
        int key;             //当前要进行插入排序的值
        //61,19,56,37,20     ,66,50,34,37,3
        // 19 37 56 61 20


        //从数组的第二个位置开始遍历值     19 37 56 61 20
        for (j = 1; j < length; j++) {
            key = a[j];
            i = j - 1;
            //a[i]比当前值大时，a[i]后移一位,空出i的位置，好让下一次循环的值后移
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i]; //将a[i]值后移
                i--;         //i前移
            }//跳出循环(找到要插入的中间位置或已遍历到0下标)
            a[i + 1] = key;    //将当前值插入
        }

        return a;
    }


    /**
     * 快速排序
     * @param a 源数组
     * @return 快速排序好的数组
     */
    public static int[] quickSort(int[] a){
        if(a.length >= 2)
            return  quick(a,0,a.length-1);
        return a;
    }


    public static int[] quick(int[] a, int low,int high){
        if(low < high){
           int middle =  getMiddle(a,low,high); //   15, 12, 22, 【30】, 67, 45, 50, 43, 56, 79


            quick(a,low,middle-1);
            quick(a,middle+1,high);
        }
        return  a;
    }

    /**
     * 在一趟排序中获得基数的下标（左边的比基数小， 右边的比基数大）
     * @param a 源数组
     * @param low   要排序的数组低位下标
     * @param high 要排序的数组高位下标
     * @return  返回基数的下标
     */
    public static int getMiddle(int[] a,int low,int high){  //{15, 12, 22, 83, 67, 45, 10,83, 56, 79};
        int key = a[low];  //30

        while(low<high){
            //从高位比较
            while(low < high && key < a[high]){
                high--;   //h = 7
            }
            a[low]  = a[high];
            //从低位比较
            while(low < high && key >= a[low]){
                low++;  //l = 3
            }
            a[high] = a[low];


        } //low = high

        a[low] = key;

        return low ;
    }


}

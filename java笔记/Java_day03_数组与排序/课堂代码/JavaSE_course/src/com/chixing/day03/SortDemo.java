package com.chixing.day03;

/**
 * 工具类：该类提供了一些列的排序功能，如选择排序，冒泡排序，插入排序，快速排序等
 */
public class SortDemo {

    /**
     * 选择排序
     * @param a 源数组
     * @return  返回选择排序好的数组
     */
    public static int[] selectSort(int[] a){  // int[] a = a = {30, 45, 76, 83, 7, 45, 10, 15, 56, 19};
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j< a.length;j++){
                if(a[i] > a[j]){
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
     * @param a 源数组
     * @return  返回冒泡排序后的数组
     */
    public static int[] bubbleSort(int[] a){ // int[] a = {30, 45, 76, 83, 7, 45, 10, 15, 56, 19}
        for(int i = 0;i<a.length;i++){
            for (int j = 0;j<a.length-i-1;j++){  // a[0] a[1]....a[8] a[9]  a[j] a[j+1]
                     if(a[j] > a[j+1]) {
                        int tmp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = tmp;
                     }

            }
        }
        return a;
    }

    /**
     * 插入排序
     * @param a 源数组
     * @return  插入排序好的数组
     */
    public static int[] insertSort(int[] a){
        return null;
    }

    /**
     * 快速排序
     * @param a 源数组
     * @return 快速排序好的数组
     */
    public static int[] quickSort(int[] a){
        return null;
    }

}

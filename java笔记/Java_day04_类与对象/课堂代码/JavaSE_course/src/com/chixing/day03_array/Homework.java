package com.chixing.day03_array;

public class Homework {
    public static void main(String[] args) {
        char upperLetter = 'C';
        char lowerLetter =  (char) (upperLetter + 32);
        System.out.println(lowerLetter);

//查找一个数组的第K小的数，注意同样大小算一样大。 如  2 1 3 4 5 2 第三小数为3
        int[] a={23,32,25,20,21,11,11,20,20};
        // {11,23,32,25,20,21,11,33,45}
        //{11,11,23,32,25,20,21,33,45}
        //{11,11,20,32,25,23,21,33,45}
        //{11,11,20,23,32,25,21,33,45}
        int count = 0;
        int k = 2;


        for(int i = 0;i<a.length;i++){
            int min = i;
            for(int j = i+1;j<a.length;j++){ //  i = 5
                if( a[min]  > a[j]){
                    int temp = a[j];
                    a[j] = a[min];
                    a[min] = temp;
                }
            }
            // 与前面已经比较的最小的几个数进行比较是否有重复
            boolean flag = false;  // 没有重复的值
            for(int m = 0;m<i;m++){
                if(a[m] ==a[i] ) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                count++;
            System.out.print("count=" +count);

            if(count == k){
                System.out.print("第3小的数是" + a[i]); // 11,11, 20,23
                break;
            }
        }

    //整数倒置

        int result  = 0;
        int num = 3848200;
        while (true){
            result = result *10 +num%10;
            num /= 10;
            if(num==0){
                break;
            }
        }
        System.out.println(result);


   //     5. 设计一个程序,打印出(2~200)之间的所有质数(素数).
//    要求:每行只输出 10个素数, 不能把所有数都写到一行中.

        //外部for循环从2~200之间拿数
        //定义count2记录打印的次数
        int count2 = 1;
        for (int z = 2; z <= 200; z++) {
            //定义count1用于计算z因数的个数，
            // 定义在内循环体外。每次跳出内循环后外循环重新拿数进来count自动归零
            int count1 = 0;
            for (int y = 1; y <= z; y++) {
                //如果z%1==0,z%2==0,z%5==0....则说明1,2,5等都是z的因数
                if (z % y == 0) {
                    count1++;
                }
            }
            //如果z的因数只有两个 则打印z

            if (count1 == 2) {
                System.out.print(z + "\t");
                //每打印一次count就记录一次
                count2++;
                if  (count2%10==0){
                    System.out.println();
                    count2=1;
                }
            }

        }


// 数组元素去重

        System.out.println("============= 数组元素去重============================");
        int[] x ={30, 45, 76, 83, 0, 45, 0, 15, 56, 19};
        //新数组
        int[] y = new int[x.length];

        y[0] = x[0];
        int count3 = 1;// count3 新数组中已有元素的个数

        for(int i =0;i<x.length;i++){ // 获得x数组中的一个元素x[i]

            boolean isExist = false;

            for(int j = 0;j<count3;j++){ // 获得y 数组中已有的元素
                if(x[i] == y[j] ) {
                    isExist = true;
                    break;// 若元素已在新数组中存在，则不添加到新数组中
                }

            }

            if(!isExist) {
                y[count3++] = x[i];
            }


        }

        //遍历输出新数组中元素
        for(int i =0;i<count3;i++){
            System.out.print(y[i] + ",");
        }

















    }
}

package com.chixing.day02;

/**
 * while
 * do-while
 * for
 */
public class LoopDemo {
    public static void main(String[] args) {

     /********************************while***********************************/
      // 从1累加到100 ，求和
      int i = 1;
      int sum =0;
      while(i <= 100){
          sum += i; //等价于 sum = sum + i;
          i++;
      }

   /*   while(true){ //死循环

      }*/

 /********************************do-while***********************************/
     // 从1累加到100 ，求和
      i = 1;
      sum = 0;

      do{
        sum += i;
        i++;
      }while(i<=100);
/********************************for**********************************/
        // 从1累加到100 ，求和
        sum = 0;
        for(int a = 1;a<= 100; a++){
            sum+=a;
        }


        int k = 10;
        for(k = 10;i<=100;k++){

        }

        k = 100;


        // 从1累加到100  while,do-while, for
       //  1~ 100 , 找能被3整出的整数，累计求和 ， while, for
        sum = 0;
        for(i = 1;i<=100;i++){
            if(i % 3 ==0)
                sum+=i;
        }



        //break, continue
        //continue : 结束本次循环，继续执行下一次循环
        //break :结束当前循环 while , do-while,for
        i = 1;
        while(i<=10){

            if(i == 5) {
                i++;
                break;
            }else
                System.out.println("while i = " + i);

            i+=2;
        }



        for(i =1;i<=10;i++){
            if(i == 5) {
                i++;
                break;
            }else
                System.out.println("for i = " + i);
        }


        /**************************************1. 九九乘法表*********************************************/
        for( i = 1;i<10;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }

        /**************************************2. 星号输出（1）*********************************************/
        /*
                *
                ***
                ******
                ********
                **********
         */
        int n = 7;
        for( i =1;i<=n;i++){
            for(int j = 1;j<= 2*i-1 ;j++){
                System.out.print("*");

            }
            System.out.println();
        }

        /**************************************3. 星号输出（2）*********************************************/
        /*
                    *
                   ***
                  ******
                 ********
                **********

         */

        for(i =1;i<=n;i++){//表示 行数
            for(int j = 1;j<=n-i;j++) { //表示空格输出
                System.out.print(" ");
            }
            for( k = 1;k<=2*i-1;k++){ //表示* 输出
                System.out.print("*");
            }
            System.out.println();
        }


    }


}

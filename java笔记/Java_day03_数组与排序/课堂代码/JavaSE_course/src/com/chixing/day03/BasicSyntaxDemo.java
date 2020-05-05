package com.chixing.day03;

public class BasicSyntaxDemo {
    public static void main(String[] args) {



        char personGender = 'F'; // male , female
        char word = '你'; // char 2字节，
        char letter1 = 'A';
        int i1 = 'A'; //65
        int i2 = 'B'; //66
        int i3 = 'C'; //67
        int i4 = 'Z'; //90

        System.out.println("字母A 对应的int :" + i1);
        System.out.println("字母B 对应的int :" + i2);
        System.out.println("字母C 对应的int :" + i3);
        System.out.println("字母Z 对应的int :" + i4);

        int i11 = 'a'; //97
        int i12 = 'b'; //98
        int i13 = 'c'; //99
        int i14 = 'z'; //122
        System.out.println("字母a 对应的int :" + i11);
        System.out.println("字母b 对应的int :" + i12);
        System.out.println("字母c 对应的int :" + i13);
        System.out.println("字母z 对应的int :" + i14);

        //输出26个大写字母A-Z
        for(char i ='A';i<='Z';i++){
            System.out.println(i);
        }

        //输出26个小写字母


        int a = 10;
        int b = 20;
        if(a < b)
            System.out.println("a < b");

        System.out.println("OKOK");

        int year = 2010;
        int month = 4;
        int day;

        switch (month){// byte,short,int,char,String,enum,Byte,Short,Integer,Character
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            default:
                if(year % 4 == 0 && year % 100  !=0  || year % 400 ==0)
                    day = 29;
                else
                    day = 30;
                break;

        }

        int[]  arr = new int[5];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        //长度
      int len =  arr.length;

      //访问元素
      int data1 =  arr[3];

        int[]  arr2 = {10,34,7,52,89,4,17};
        int[] newArr = new int[arr2.length];
        for(int i =0;i<=arr2.length -1;i++){
            newArr[i] = arr2[i];
        }

        int[] x = new int[arr2.length];
        for(int i =0;i<arr2.length;i++){
            x[arr2.length -1-i]  = arr2[i];
        }









    }
}

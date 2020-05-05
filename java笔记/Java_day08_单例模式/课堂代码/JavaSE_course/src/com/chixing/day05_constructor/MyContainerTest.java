package com.chixing.day05_constructor;

import java.util.ArrayList;

public class MyContainerTest {
    public static void main(String[] args) {

        //创建一个容器
        MyContainer container1 =   new MyContainer();

        //添加数据，默认添加在尾部
        for(int i = 1;i<=10;i++){
            container1.add(i);
        }



        //添加数据在指定位置上
        container1.add(56,9);
        container1.add(66,8);
        container1.add(44,3);
        container1.add(99,4);
        container1.add(77,0);

      /*  //查看容器中元素值
        for(int i =0;i<container1.size;i++){
            System.out.print(container1.defaultArray[i] + ", ");
        }*/
        System.out.println();
        //移除指定位置上的元素
       container1.remove(4);
       container1.remove(2);
        container1.remove(0);
        container1.remove(11);

      /*  for(int i =0;i<container1.size;i++){
            System.out.print(container1.defaultArray[i] + ", ");
        }
*/
        int ele1 = container1.get(1);







    }
}

package com.chixing.day12_boxing_generic_list;

public class Location {

    int a;
    // 通配符 ?: 任意类型
    public void test1(MyContainer<?> container){

    }

    // 通配符 ?有上限: 必须是Account 的子类或 Account本身
    public void test2(MyContainer<? extends Account > container){

    }

    // 通配符 ?有下限: 必须是SavingAccount 的父类或  SavingAccount本身
    public void test3(MyContainer<? super SavingAccount > container){

    }


    // 该T泛型的作用域就在该方法
   public <T> void test4(T a,int b){
        int x;
   }



}

package com.chixing.day12_boxing_generic_list;

public class X<T>    {
    public static void main(String[] args) {
        Student<String> stu1 = new Student<>();
       System.out.println( stu1.getClass());   //com.chixing.day12_boxing_generic_list.Student



    }


    //通配符
    public  void test1(  MyContainer<?>  container){

    }





}



class  Y extends X<String>{

}

class  Z extends X<Integer>{

}


class  Student<T>{

}
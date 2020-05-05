package com.chixing.day07_polymorphism;

public class Father {
    private String name = "father";

    public void tellName(){
        System.out.println("father tell name:" + this.name );
    }


    public void fun1(Father f){
        f.tellName();
    }


    //主函数
    public static void main(String[] args) {
        Son son1 = new Son();
        son1.tellName();

        Father f =  new Son();
        f.tellName();   // 子类的tellName

        f.fun1(f);
    }

}

class Son extends  Father{
    private String name = "son";

    //方法重写
    public void tellName(){
        System.out.println("son tell name:" + this.name);
    }
}

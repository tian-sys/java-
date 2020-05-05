package com.chixing.day07_polymorphism;

/**
 * 初始化父类的属性
 * 执行父类构造函数
 *
 * 初始化子类属性
 * 执行子类构造函数
 *
 * 继承，构造函数，方法重写，初始化
 */
public class Dervied extends Base {

    private String name = "dervied";

    public Dervied(){
        super();
        tellName();
        printName();
    }

    public void tellName(){
        System.out.println("Dervied tell name:"+ this.name);
    }

    public void printName(){
        System.out.println("Dervied print name:"+name);
    }

    public static void main(String[] args) {
        new Dervied();
    }

}


class Base{
    private String name = "base";

    public Base(){
        tellName();  // this.tellName() this 是子类对象，访问的是子类方法
        printName(); //this.printName() this 是子类对象，访问的是子类方法
    }

    public void tellName(){
        System.out.println("Base tell name:"+name);
    }

    public void printName(){
        System.out.println("Base print name:"+name);
    }


}

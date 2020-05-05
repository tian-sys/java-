# 内部类(Inner class)
## 1.内部类的作用 : 一般用于服务于外部类
​	(1)，内部类提供了更好的封装，可以把内部类隐藏在外部类之内，不允许同一个包中的其他类访问该类。
​	(2)，内部类成员可以直接访问外部类的私有数据；但外部类不能访问内部类的实现细节，如内部类的成员变量；
​	(3)，匿名内部类适合用于创建仅需使用一次的类。

## 2.概念
​	内部类也就是定义在类内部的类。
​	内部类是一个编译时的概念。
​    编译成功：外部类$内部类名.class  (Outer$Inner.class)



## 3. 内部类的分类：

* (1) 成员内部类（Member inner class）、	

* (2) 局部内部类(Local inner class）、

* (3) 静态内部类(Static  inner class）、

* (4) 匿名内部类（Anonymous inner class） 

  

  1. **成员内部类** 

    ```java
    class A{
    	int a =10;
    	class B{}
    }
    ```

    

  2. **静态内部类**

    ```java
    class A{
    	static int a =10;
    	static class B{}
    }
    ```

    

  3. 局部内部类
  

    ```java
    class A{
        public void fun(){
            int a =10;
            class B{}
        }
    }
    ```
  

  4. 匿名内部类
  
    ```java
    new A(new B(){		
    	public void fun(){//重写B接口(抽象类)的方法
    	}
    });
    ```

    

    

  ​    

### （1）成员内部类（Member Inner Classes）
​    特征：
​          (a)、相当于外部类中的一个普通成员方法；
​          (b)、相当于外部类中的一个普通成员属性；
​    成员定义：
​          不能在成员内部类中定义静态属性和静态方法。
​	 特征：为什么成员内部类中不能定义静态成员？
		 *      因为外部类被加载时，成员内部类还没有被加载。
            从外到内：
                  (a)、非静态方法：
                         必须创建内部类的对象，然后通过对象方法，则可以访问内部类中的所有属性和方法
                  (b)、静态方法 和 其他的类：
                         必须先创建外部类的对象，然后通过外部类对象再创建内部对象。
                         Inner inner = new Outer().new Inner();
            从内到外：
                  (a)、成员内部类可以访问外部类中所有的属性和方法；
                  (b)、外部类、内部类、内部类的方法中出现同名
                         temp
                         this.temp
                         Outer.this.temp

示例：

```java
//成员变量、成员方法、成员内部类  === 为外部类服务
public class Outer {

    //成员变量
    public int a = 10;
    //成员方法
    public void fun1(){}
    //成员内部类
    class Inner{
        //内部类的 成员变量
        //内部类的成员方法
    }
}


//测试
public class TestInnerClass {
    public static void main(String[] args) {        
        Outer outer = new Outer();
        
        outer.a =20;  //成员变量： 对象名.变量名
        outer.fun1(); //成员方法： 对象名.方法名
        outer.new Inner(); //内部类对象 new Inner();   //成员内部类： 外部类对象.内部类对象
    }
}
```







### （2）静态成员内部类（Static Inner Class）
​    特征：
​          (a)、相当于外部类中的一个静态成员方法；
​          (b)、相当于外部类中的一个静态成员属性；
​    成员定义：
​          可以在成员内部类中定义静态属性和静态方法。
​    从外到内：
​      (a)、非静态方法 和 静态方法：
​              必须创建静态内部类的对象，然后通过对象方法，则可以访问静态内部类中的所有属性和方法;
​      (b)、other其他的类：
​         

```java
     Inner inner = new Inner();
    Inner inner = new Outer.Inner();
```

​        从内到外：
​              (a)、非静态方法：
​                      只能访问外部类中的静态属性和静态方法;
​              (b)、静态方法：
​                      只能访问外部类中的静态属性和静态方法;



```java
public class Outer {
    static  int x = 10;

    static class Inner{}

}

public class TestStaticInnerClass {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.x  = 50;
        //创建静态内部类对象
        Outer.Inner inner = new Outer.Inner();

    }
}

```

### （3）局部内部类（Local Inner Classes）：
​     定义在某个方法中类， 把局部内部类看作为某个方法中一个普通变量。

     特征：
     *     1、不能被4种访问控制符所修饰，也不能被static修饰，
     *        但是可以被final、abstract所修饰。
     *     2、局部内部类中不能定义静态成员（方法和属性）。


         非静态方法
               特征：
                     相当于一个普通的方法。
           //    成员定义：
            //         可以在成员内部类中定义静态属性和静态方法。
               从内到外：
                     (a)、可以作为一个普通的方法，访问外部类中的所有的成员属性和成员方法;
                     (b)、如果局部内部类要访问所在方法中的定义的变量，则该变量必须为常量;
               从外到内：
                     必须通过外部类的方法(作为入口)，并且一定要在方法结束之前将局部内部类的对象创建完成，然后局部内部类中的方法;
         静态方法
               特征：
                     相当于一个静态的方法；
               成员定义：
                     可以在成员内部类中定义静态属性和静态方法。
               从内到外：
                     (a)、可以作为一个静态的方法，访问外部类中的所有的静态属性和静态方法；
                     (b)、如果局部内部类要访问所在方法中的定义的变量，则该变量必须为常量；
               从外到内：
                     必须通过外部类的方法(作为入口)，并且一定要在方法结束之前将局部内部类的对象创建完成，然后局部内部类中的方法；


### （4）匿名内部类（Anonymous Inner Classes）：
​     是一个特殊的局部内部类。
​     分析：
​            怎么使用匿名内部类继承一个父类？
​            怎么使用匿名内部类实现一个接口？
​            答：直接new 父类或者接口。

    在使用匿名内部类时，要记住以下几个原则：
    　·匿名内部类不能有构造方法。  
    　·匿名内部类不能定义任何静态成员、方法和类。  
    　·匿名内部类不能是public,protected,private,static。  
    　·只能创建匿名内部类的一个实例。
      ·一个匿名内部类一定是在new的后面，用其隐含实现一个接口或实现一个类。  
    　·因匿名内部类为局部内部类，所以局部内部类的所有限制都对其生效。			  


​		
​		匿名类和内部类中的中的this :
​		有时候，我们会用到一些内部类和匿名类。当在匿名类中用this时，这个this则指的是匿名类或内部类本身。这时如果我们要使用外部类的方法和变量的话，则应该加上外部类的类名。

```java
public class MainBoard {

    public MainBoard(Cpu cpu){

    }
}

public interface Cpu {
    public void cpuRun();
}

public class DellCpu implements Cpu {
    @Override
    public void cpuRun() {

    }
}

public class TestCpu {
    public static void main(String[] args) {


        Cpu cpu = new DellCpu();
        MainBoard mainBoard1 =   new MainBoard(cpu);

        //匿名内部类
       new MainBoard(new Cpu(){

           @Override
           public void cpuRun() {

           }
       });
    }
}

```
## 接口存在的意义：	

	1、安全、严密性(封装)：接口是实现软件松耦合的重要手段，它描叙了系统对外的所有服务，而不涉及任何具体的实现细节。这样就比较安全、严密一些(一般软件服务商考虑的比较多)。
	
	2、维护、拓展性：比如你要做一个画板程序，其中里面有一个面板类，主要负责绘画功能，
	       然后你就这样定义了这个类，可是在不久将来，你突然发现这个类满足不了你了，然后你又要重新设计这个类，更糟糕是你可能要放弃这个类，那么其他地方可能有引用他，这样修改起来很麻烦，如果你一开始定义一个接口，把绘制功能放在接口里，然后定义类时实现这个接口，然后你只要用这个接口去引用实现它的类就行了，以后要换的话只不过是引用另一个类而已，这样就达到维护、拓展的方便性。
	
	3、简单、规范性：如果一个项目比较庞大，
	       那么就需要一个能理清所有业务的架构师来定义一些主要的接口，
	       这些接口不仅告诉开发人员你需要实现那些业务，
	       而且也将命名规范限制住了（防止一些开发人员随便命名导致别的程序员无法看明白）。
	
	4、重要性：在Java语言中， abstract class 和interface 是支持抽象类定义的两种机制。正是由于这两种机制的存在，才赋予了Java强大的 面向对象能力。

## 接口定义：就是两个组件相互通信的约束或规则
### 接口：
```java
纯抽象类，是类能够做什么的合约，方法只有声明，没有实现。
	是一种特殊类，里面全部是由全局常量和公共的抽象方法组成。
```



### 如何定义接口？
```java
	 interface 接口名称{
		 // 全局常量;
		 // 抽象方法;
	 }
```



```java
 Ps:接口中定义的成员变量 ，成员方法
 	public interface A{
      public static final int AGE= 18;
      public abstract void fly();
    }

 等价于：（完全一样）
 public interface A{
        int i= 1;
        void fly();
  }
  
// 注意：  
 	final、private、static、protected void fly();//非法定义接口的方法

```



示例：

#### 接口：

```java
public interface Cpu {
    //全局常量
    public static final int PRODUCT_YEAR = 2019;

    //抽象方法
    public abstract void cpuRun();
    public abstract void cpuStop();
}
```

#### 实现子类 HpCpu

```java
public class HpCpu implements Cpu {
    @Override
    public void cpuRun() {

    }

    @Override
    public void cpuStop() {

    }
}
```

#### 实现子类 HuaWeiCpu

```java
//实现CPU 必须具备的功能
public class HuaWeiCpu implements Cpu{
    @Override
    public void cpuRun() {

    }

    @Override
    public void cpuStop() {

    }
}
```

### 接口使用注意：

```java
1. 接口的使用也必须有子类，子类必须覆盖全部抽象方法，implements关键字实现， 一个子类可以实现多个接口，则子类如果不是抽象类的话，
	   一定要覆写接口中的全部方法。
2. 继承抽象类实现接口: 
一个子类可以同时继承抽象类和实现接口
    	语法：
 			class 子类 extends 抽象类 implements 接口A，接口B...{}
 3.接口的继承：
  一个接口不能继承抽象类，但是能通过extends关键字同时继承多个接口，实现
  接口的多继承。

 语法：
 	interface 子接口 extends 父接口A,父接口B,...{}
 	接口中的抽象方法可以不加入abstract,而抽象类中的抽象方法必须有abstract关键字声明；

4.一个类只能继承一个父类，但是可以同时实现多个接口；
  一个接口可以同时继承多个接口，以实现接口的多继承；
  接口和抽象类一样，都必须依靠子类；
  一个抽象类可以实现多个接口，但是一个接口不能继承一个抽象类。
  5、如果某个类实现了某个接口，那么我们就说，这个类具备这个接口所定义的功能。从语法角度来说，和继承类似

6、接口不能被实例化，只能引用子类的对象（接口作为参数或者返回值类型）

7、什么时候使用抽象类和接口？
```

##   什么时候使用抽象类和接口？

```java
应用：
	一个类中一部分功能需要依赖于其他类实现，则把这些方法定义为抽象方法，该类 为 抽象类
	组件与组件之间（模块与模块之间）的通讯，使用接口 (保证业务内部实现不被暴露，降低模块之间的耦合性)
语法：
	public abstract class A{
        public void fun1(){}
        public abstract void fun2();        
	}
	
public interface B{
    //全局常量
    public static final int X = 10;
    //抽象方法
    public abstract void fun3();     
    
}
```









## 	

```java
public interface A {
    public void fun1();
}

 interface  B{
    public void fun2();
}

//接口 可以多继承
interface  C extends A,B{
    public  void fun3();

}


class D{

}
// 继承 + 实现多接口
class E extends  D implements A,B,C{

    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }

    @Override
    public void fun3() {

    }
}
```

 

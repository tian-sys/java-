# static

## 1. Java的内存

​	java把内存分为栈内存和堆内存,数据区，代码区，
​	栈内存用来存放一些基本类型的变量和数组及对象的引用变量，而堆内存主要是来放置对象的。
​	用static的修饰的变量和方法，实际上是指定了这些变量和方法在内存中的“固定位置”－data storage。

## 2. 类加载 时候

#### （1） 执行static{} 代码块

####   （2）执行static 变量（类变量）

#### a. 类变量 ： 该变量归 类 所有 ， 在内存中仅有一份，在类加载的时候，初始化

#### b. 实例变量 ： 该变量归 对象所有，在内存中 ，创建每一个对象的时候，就初始化每一份

#### c. 

#### static{

#### }

#### 用于在类加载的时候，需要执行的代码，就放在static{ }中



```java
public class Product {

    public static String salePlat = "京东"; //销售平台名称 （该项目所有的商品都 在京东）=== 类变量 (类名.变量名)

    public String productName ="水杯"; //实例变量       （对象名.变量名）
    public float productPrice; //实例变量        （对象名.变量名）


    static {
        System.out.println("static 代码块3");
        System.out.println(salePlat);  // "京东"   null
//        System.out.println(productName); 错误，在类加载的时候，没有实例化对象，所以不能访问实例级别的变量
    }
    static {
        System.out.println("static 代码块1");
    }


}
```

```
一种是被static修饰的变量，叫静态变量或类变量；
另一种是没有被static修饰的变量，叫非静态变量(实例变量)。
```



### 类成员

```
类名.类变量

类名.类方法
```

### 实例成员

```
对象名.属性

对象名.方法
```



```java

public class Car {
    public static String salePlat = "滴滴";
    public String carName ="宝马";


    static{
        System.out.println("static 代码块2");
        System.out.println("static类变量salePlat：" + salePlat);
    }


    {
        System.out.println("普通代码块1");
    }

    {
        System.out.println("普通代码块2");
        System.out.println("实例变量 carName :" + carName);
    }
    public  Car(){
        System.out.println("car 无参构造函数...");
    }

    public Car(String carName) {
        this.carName = carName;
        System.out.println("car 有参构造函数》》》》"+carName);
    }

    static{
        System.out.println("static 代码块1");
    }


}


public class CarTest {
    //异常 alt + enter
    public static void main(String[] args) throws ClassNotFoundException {

        //1. 类加载
        Class.forName("com.chixing.day07.staticdemo.Car");

        //2. 创建对象
        new Car("沃尔沃");

    }
}

/**
	1. 类加载的时候，加载类相关的成员 static 
		static 变量
		static {} 代码块
		
	2. 创建对象
		初始化 实例变量
		普通代码块 {} 
		构造函数
*/

```

## static 代码块

	　static代码块也叫静态代码块，是在类中独立于类成员的static语句块，可以有多个，位置可以随便放，它不在任何的方法体内，JVM加载类时会执行这些静态的代码块，如果static代码块有多个，JVM将按照它们在类中出现的
	先后顺序依次执行它们，每个代码块只会被执行一次。
```

在static 代码块 或static 方法中，能不能访问static 变量？？？（OK）
在static 代码块 或static 方法中，能不能访问实例变量？？？（NO）
在static 代码块 或static 方法中，能不能访问this？？？（NO)

在非static 方法中，能不能访问static 变量？？？（OK）
在非static 方法中，能不能访问非static 变量（实例变量）？？？（OK）
在非static 方法中，能不能访问this（当前对象）？？？（OK）
```

## 继承关系中的static 

```java
new Son() : 
	1 类加载：
		a. static 变量 ， b.static 代码块   
    2.实例化对象 new Son()
	   a.初始化对象的属性， b.执行实例代码块 c.构造函数

class Son  {// 
	static int age = 20;
	float height = 175;
	
 	static{ // Son类加载的时候 执行static 代码块
        System.out.println("Son static");
        System.out.println("Son static age = " + age);// 20 
    }
 	
 	//代码块 对象  ：实例代码块
 	{
 		System.out.println("son的代码块");
 		System.out.println("son的代码块  height = " + height);//175
 	}
 	
 	public Son(){
 		System.out.println("son的构造函数 " + height);
 		System.out.println("Son的构造函数");
 	}

}
```

```
继承关系中： 先加载父类、后加载子类
	加载Son.class
// new Son()
```

```java
class GrandFather{
	    static{
			System.out.println("GrandFather static");
	    }
    
}

class Father extends GrandFather{
	    static{
	        System.out.println("Father static");
	    }
}

class Son   extends Father{

	static{
	        System.out.println("Son static");
	 }
}
```

## 	

```
继承关系中： 先加载父类、后加载子类
1. 父类 static 类变量、static {} 

2. 子类 static 类变量、static {} 
3. 父类初始化实例变量、普通代码块、构造函数
4. 子类初始化实例变量、普通代码块、构造函数
```

```java
class Father  {
    static int age = 40;
    String name ="Tony";
    static{
        System.out.println("Father static");        
    }
    
    {
        System.out.println("Father 普通代码块");
    }
    
    public Father(){
        System.out.println("Father无参构造函数");
    }
}

class Son   extends Father{
    static int age = 20;
     String name ="Tommy";
    static{
        System.out.println("Son static");       
    }
     {
          System.out.println("Son 普通代码块");
    }
    
    public Son(){
        //super();
        System.out.println("Son无参构造函数");
    }
}


public class Test{
    
    public static void main(String[] args){
        
        new Son();
    }
    
}
```

# 在应用，哪些场合会用到static

### 1.  static 变量	

```
变量 属于类级别，在内存中仅有一份
类名.类变量
```

### 2. static 代码块

```
static 代码块只执行一次
所以，在重量级对象初始化的时候，会将代码放在static中
```

### 3. static  方法

```
1. 工具类  Math、SortUtil
2. 要求语法上实现： 类名访问方法
```



#### 示例：

```java
//排序工具类： 提供了一系列排序
public class SortUtil(){
    //冒泡排序
    public static void bubbleSort(int[] a){}
     //选择排序
    public static void selectSort(int[] a){}
     //快速排序
    public static void quickSort(int[] a){}
    
    
}

//数学工具类： 提供了一系列数学中的所用的算法等方法
public final class Math{
   public static int max(int a, int b) {}
   public static long abs(long a) {}
    
}

public static void main(String[] args){
    SortUtil.bubbleSort(..);
    Math.abc(-35);
    
}




//以下方法存款 是必须要有对象意义
public class Account{
    //存款
    public  double depoist(double money){
        return 0;
    }
}

Account account1 = new Account();
account1.depoist(1000000);

```

## static + final  变量  = 全局常量

```java
 //全局常量
public  static final  String SALE_PLAT = "京东"; //销售平台名称
```
static 里面不能有this

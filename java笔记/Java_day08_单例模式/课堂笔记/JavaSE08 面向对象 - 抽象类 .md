## 抽象类    abstract class
### 场景

​	

```java
    public abstract class MockBusiness {
	    public void fun1(){}
     
    	public abstract void fun2();// 依赖于第三方实现

        public void fun3(){
        }
}
```

### 1.抽象类的使用场景：  

	在业务实现中，有一个或多个功能需要依赖于第三方实现，则把该些功能设计为抽象方法，则该类就为抽象类。

### 2.定义：
​	含有抽象方法的类，就是抽象类

  	方法只有声明，没有实现（没有方法体）。

```java
abstract void grow();
abstract void grow(){}  // 有实现，空实现  error 
```

### 3. 抽象类的定义以及使用规则：
	抽象类不一定含有抽象方法。
	包含一个抽象方法的类必须是抽象类；
	抽象类和抽象方法都要使用 abstract 关键字声明；
	抽象方法只需声明不要实现；
	抽象类必须被子类继承，子类(如果不是抽象类)必须覆写抽象类中的全部抽象方法；
	
	抽象类不能被实例化，只能引用子类的对象。 向上转换
	抽象类作为参数，传的是子类的对象  
	抽象类作为返回值，返回的是子类的对象。

#### 示例：

```java
public abstract class MockBusiness {

    public MockBusiness(){}

    public void fun1(){

    }
    public void fun2(){

    }
    public abstract void fun3() ;//fun3() 依赖于其他类【子类】实现

    public void fun4(){

    }


}
```



#### 子类

```java
/**
 *
 * alt + enter implements 父类的抽象方法
 */
public class A extends  MockBusiness {

    @Override
    public void fun3() {
        //子类实现父类方法（语法上是重写）
    }

}
```



```java
public abstract class B extends MockBusiness {
    //abstract fun3();
    abstract void fun7();
}
```

```java
//实现子类C  要实现 所有父类 的所有抽象方法
public class C extends B {


    @Override
    void fun7() {

    }

    @Override
    public void fun3() {

    }
}
```



### 4. 注意：final abstract 不能结合使用

​	final类不能有子类；
​	抽象类必须有子类；
​	

	抽象类中能定义构造方法么？
	答：能的；因为抽象类依然使用的是类的继承关系，且抽象类中
	也存在各个属性，所以子类在实例化之前肯定是对父类进行的实例化的。

### 补充：
​	1.什么时候覆盖toString()方法？
​	 Person p = new Person();
​	 System.out.println(p);
​	java会自动调用toString()方法；
​	但是结果不是我们想要的，因为Object类的toString()方法总是返回对象的
​	实现类类名 + @ + hashCode值。
​	

	我们希望的是能够打印出p的全名来，这时就希望能覆盖toString()方法，
	因为重写toString方法之后，会优先调用自己的toString()方法。
## 应用中的抽象类：

```
若子类的方法实现都不一样，父类就没必要具体实现这些方法，父类把这些方法定义为抽象方法，子类根据自己的需求各自实现
```

```java
**
 * 银行账户
 * 业务中：new Account() 错误
 * new SavingAccount()
 * new CreditAccount()
 *
 */
public abstract class Account {
    //取款 储蓄账户、信用账户 取款方式都不一样，
   public abstract double withdrwa(double money);

}
```

```java
public class SavingAccount extends Account {
    @Override
    public double withdrwa(double money) {
        return 0;
    }
}
```

```java
public class CreditAccount extends Account {
    @Override
    public double withdrwa(double money) {
        return 0;
    }
}
```
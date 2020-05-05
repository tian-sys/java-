# Java是面向对象的编程语言

## OOP ( Object Oriented Programming) 面向对象编程

购物车中的商品 ：  手机1( 品牌名称，价格，颜色，容量，.... , 打电话,导航，....)

 				手机2( 品牌名称，价格，颜色，容量，.... , 打电话,导航，....)



我的领导，我的部门（名称，编号，位置）

## 1. 类与对象

### 类 class：一个群体性概念，用于描述一类事物共有的属性与功能

```java
class  Phone{
 	//品牌名称
    //价格
    //颜色
    //容量
    
    //打电话
    //导航

}

对象：是类在现实生活中一个个实实在在的个体
王佳辉的华为P30手机 ： 个体性概念
张中浩的iphone 6s手机 ： 个体性概念

class MyOrder{
    //订单编号
    //消费者
    //下单时间
    //总金额
    //商家
    //收件信息  
    
}
订单类在现实生活中一个个实实在在的个体
今天早上刘畅 买的早饭，订单1：
 
 
 class Person{
 
 	// 姓名，性别，身高，年龄，籍贯。。。
 	// 买买买，睡觉，打游戏
 
 }
 你的对象： 
    
    
```

引用数据类型： 数组 array , 类 class

默认值 null

### 类与对象的关系：对象是类在现实生活中一个个实实在在的个体



## 2. 创建对象的语法：

#### 语法：

```java
//创建对象
类名 对象名 = new 类名();
对象名.属性名 = 值;
对象名.方法名(...)
```

#### 示例：

```java
//创建Person对象
Person p1 = new Person();
//访问对象的属性: 对象名.属性名
//访问对象的方法：对象名.方法名
p1.personName = "付祝秀";
p1.study(); 

//创建Phone对象
Phone phone1 = new Phone();
phone1.phonePrice = 8848.8f;
phone1.call();  
phone1.navigate();

//创建Student对象
Student stu1 = new Student();
```



## 3. 创建对象的内存图：

![](img\创建对象的内存图.png)





## 4. 三大特征

封装、继承、多态

## 5. 封装概念

存在问题：

​	（1）类的元数据（属性）不安全，现在外部类 能直接访问属性名 ====> 安全性

​	（2）若修改一个属性名，其他类中访问该属性的地方，全要修改 ====> 维护性差 ，【耦合性高】	

解决方案：

​	元数据不被暴露出去，访问权限 public ---> private 

​		public : 外部所有的类 都能访问到该属性

​		private ： 只有本类能访问



​	**采用get 方法对属性取值，set方法对属性赋值**

```java
	//姓名赋值 set
    public void setPersonName(String name){  
        personName = name;
    }
   	//姓名取值  get
    public String getPersonName(){
        return personName;
    }
	//性别赋值 set
    public void setPersonGender(char gender){
            personGender = gender;
    }
	//性别取值 get
 	public char getPersonGender(){
        return  personGender;
    }

	//年龄赋值 set
    public  void setPersonAge(int age){
        personAge = age;
    }
	//年龄取值 get
    public int getPersonAge(){
        return  personAge;
    }
```

### 	测试类

```java

public class PersonTest {
    public static void main(String[] args) {
        //创建一个Person对象
         Person p1 = new Person();
         //第一个Person对象 p1 赋值信息 set
         p1.setPersonName("tom");
         p1.setPersonAge(20);
         p1.setPersonGender('M');

         //第一个Person对象 p1 赋值信息 get
         String name1 = p1.getPersonName();
         int age1 = p1.getPersonAge();
         char gender1 = p1.getPersonGender();

        //创建一个Person对象
        Person p2 =  new Person();
        //第二个Person对象 p2 赋值信息 set
        p2.setPersonName("Jason");
        p2.setPersonAge(30);
        p2.setPersonGender('M');

        //第二个Person对象 p2 获得信息 get
       int age2 =  p2.getPersonAge();
       char gender2 = p2.getPersonGender();
       String name2 = p2.getPersonName();
	}
}
```





Arrays


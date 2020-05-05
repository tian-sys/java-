## Java基础语法
### 1. 标识符
	命名规范（见名思意）：
	组成： 只能由字母、数字、下划线、美元$ ；
	(1)包 package : [模块分类], 字母全部都小写，网站或组织的逆序；
	(2)类 、接口 ：首字母大写，多个单词之间首字母大写分隔 （驼峰式命名）;不能以数字开头；
	(3)变量： 首字母小写，多个单词之间首字母大写分隔 （驼峰式命名）;不能以数字开头；
	(4)常量： [值不能再发生改变的变量], 必须用final 修饰，字母全部都是大写，多个单词之间下划线_ 分隔，必须要赋值；
	(5)方法：  首字母小写，多个单词之间首字母大写分隔 （驼峰式命名）
	可参考《阿里巴巴Java开发手册》

### 2.关键字

* 关键字
* 保留字 goto,const(关键字的候选人)

  ![](img\Java关键字.png)

----------

### 3.注释  
```java
单行注释：	 //  
多行注释：    /*  
 				*
              */  
 文档注释：	/**
    			 *
    			*/
```

----------

### 4.数据类型 

* 基本数据类型(Primitive Type)：byte，short，int，long，float，double，char，boolean
* 引用数据类型(Reference Type)：类，接口，数组，枚举，注解 

![](img\Java基本数据类型.png)

​		

注意：转义字符     
如：char c1 ='\\b';   
![](img\char转义字符.png)
	

----------

### 5. 数据类型的相互转换： 

##### 1)、正向的过程: 从低字节向高字节可以自动转换  （Java中的自动类型提升 ）  
```java
   byte-> short-> int-> long-> float-> double   
   三种情况:  	 int  -> float  
                long -> float  
                long -> double  
   特殊情况：char <-> int  （相互转换）      
```

##### 2)、 反向的过程: 从高字节向低字节可以强制转换.   
        例如: int a = (int) 4.562;   
 		注意: 反向转换将会丢失精度

----------

### 6 . 运算符与操作符

算术运算符

赋值运算符

比较运算符

逻辑运算符

位运算符

类型相关运算符 instance of 

#### 注意：  
```java
int  a = 10;  
c = a++   // c =  a =10  ; a= a+1 =11
看是a离等号近还是++离等号近 谁离等号近就先执行谁(即就近原则)
c = ++a; // a= a+1 =11; c = 11;
就近原则
```

#### & | 

* 

       (1)算术运算：
       
       	0 & 1 = 0
            1 & 0 = 0
            1 * 1 = 1
            0 & 0 = 0
       	
       0 | 1 = 1
        1 |0 = 1
        1 | 1 = 1
        0 | 0 = 0
       示例：
          3 & 2 = 2；
          3 | 2 = 3；


* （2）逻辑运算  

   

         (exp1)  & (exp2) : 两个条件必须同时满足,才为true
                true & true = true;
                true & false = false;
                false & true = false;
                false & false = false;
         (exp1)  | (exp2) : 两个条件有一个为true,值为true
             true | true = true;
            true | false = false;
            false | true = false;
            false | false = false;

#### 短路与&&， 短路或||  


```java
    (exp1)  && (exp2) : 两个条件必须同时满足,才为true
    true && true = true;
	true && false = false;
	false && true = false;
	false && false = false;
    (exp1)  || (exp2) : 两个条件有一个为true,值为true
         true || true = true;
        true || false = false;
        false || true = false;
        false || false = false;
```

#### 总结 && 和 & 的区别 ， || 和 | 的区别
```java
 	(exp1)  & (exp2) :  exp1,exp2 都要执行
     (exp1)  | (exp2) : exp1,exp2 都要执行
     
 	(exp1)  && (exp2)
          若exp1 表达式返回false， exp2不执行，直接返回结果false
	(exp1)  ||  (exp2)
          若exp1 表达式返回true， exp2不执行，直接返回结果true
```



----------

### 7. 流程控制
###### （1）顺序结构 	

* if-else 

    ```java
      	 
    
      if (逻辑表达式) {  
         			语句1；  
         			语句2；  
         			……  
         	}  
    
       	if (逻辑表达式){
       		语句； 
       	}else{
       		语句； 
       	}
    ```

    



* switch-case  

 switch与case后面的值的数据类型：  

**(能够转换成int类型的值)byte,short,int,char, Byte,Short,Integer,Character, + String + 枚举**

```java
switch(表达式){
	case 常量表达式1：语句1
	case 常量表达式2：语句2
	......
	case 常量表达式n：语句n
	default: 语句n+1
}
//case块中不加break时顺序执行下面的语句

int day =1;
switch( day ){    
    case 1: System.out.println("星期1");break;
    case 2:  System.out.println("星期2");break;
    default: System.out.println("无效的星期");break;
}
```

###### （2）循环结构

* while 

   ```java
   while( 逻辑表达式 ){  // 返回true才继续循环执行代码块
   		//代码块
   }
   
   int i =1;
   while(i<=10){
       System.out.print(i);
       i++;
   }
   ```

   

* do-while

   ```java
   do{
   		//代码块
   }while( 逻辑表达式 ){  // 返回true才继续循环执行代码块
   
    
       
   示例：
         
   int i =0;
    do{
   	System.out.println(i);
        i++;
   }  while(i<=10)；  
   ```

   

* for循环  

   ```java
   for(int i =0;i<10;i++){ // 0-9
   	System.out.println(i);
   }  
   
   
   ```

   **循环嵌套**

```java
for(int i =1;i<=3;i++){
    for(int j =1;j<=2 ;j++){
        int m = i * j ;
        System.out.println(m);
    }    
}

/*
	 i = 1;i<= 3; true; 
	 			int j =1; j<=2 true; m = 1*1 = 1; print(m) 1 ; j++
	 			    j = 2; j<=2 true; m = 1* 2 = 2; print(m) 2 ;j++
	 			    j= 3;j<=2 false 内存循环就结束
	 i= 2;i<=3 true;
     			int j = 1;j<=2 m =2 *1 = 2 ;j++
                     j = 2; j<=2  m = 2*2 = 4;j++
                     j = 3 j<=2 false 内存循环就结束
	 i= 3; i<=3 true
     			int j = 1;j<=2 m =3 *1 = 3 ;j++
                     j = 2; j<=2  m = 3*2 = 6;j++
                     j = 3 j<=2 false 内存循环就结束
	
	i = 4 ; i<=3 false 
			该循环结束

*/
```



----------

### 8.数组
##### 一维数组定义：一组相同数据类型数据的集合; 

*  内存地址连续；
*  长度固定；
*  下标从0开始  

##### （1）声明数组变量  
```java
  数组能以下列形式声明： （数据类型 变量名）
	int[] myArray ；
	Product[] proArray ；
```
##### (2)数组的定义
	      int[] a =new int[10](数组空间的声明，并把空间首地址赋值给数组的引用)
	      int[] a；
	      a=new int[10]；
	      Product[] proArray = new Product[100]; 
**上面的语法语句做了两件事:**  

		a. 创建了Product类型的，长度为100的数组。  
		b. 把新创建的数组的引用赋值给变量 proArray 。  

##### (3) 数组创建后有初始值:
		整型类型为0 
		浮点型为0.0
		布尔类型为false
		字符类型''
		引用类型为null
##### (4)访问数组中的元素
		a[8] //访问a数组中下标为8的元素值
##### (5)获得数组的长度
       a.length

**注意:**  

	访问没有初始化的数组中的值，是会抛出异常的(NullPointerException）,  
   	Java中只保证一维数组的地址是连续的，二维数组实际上是一维数组中有存储了一维数组的引用。

练习：将10个任意小数放置数组中，并将其累加获得总和；获得数组中最大值。foreach循环（JDK1.5引进）

### 9. 二维数组
##### (1)二维数组定义：（中药店的药柜，电影院的座位）    
```java
dataType[] arrayName = new arrayName[rows][columns];
int[][] arr = new int[3][4];//定义了一个存放整型数据的数组，3行5列（即包含三个一维数组，每个一维数组中国可以存储5个整数）
arr[0][0] = 18;
arr[0][1] = 17;
arr[0][2] = 33;
arr[0][3] = 6;
arr[1][0] = 99;
arr[1][1] = 23;
arr[1][2] = 56;
arr[1][3] = 91;
arr[2][0] = 76;
arr[2][1] = 10;
arr[2][2] = 4;
arr[2][3] = 7;
```

##### (2)获得二维数组的长度：  

	arr.length : 获得该二维数组共有几行（共有几个一维数组）
	arr[0].length:获得该二维数组共有几列（每个一维数组有几个值）

##### (3)Arrays 类  
	java.util.Arrays 类能方便地操作数组，它提供的所有方法都是静态的。

![](https://i.imgur.com/AY2fAnV.png)
练习：数组中查询最大值，最小值，排序





git 命令： 

git config --global user.name 'tian-sys'
git config --global user.email '1657084569qq.com'

一行差2秒
1000 * 2秒 = 2000s
300天 * 2000 = 600000
600000 / 3600 = 166小时
166 / 3 = 55天

买资源 买人脉 买课程丰满自己
部门的核心业务
























​	 
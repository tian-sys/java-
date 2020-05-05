# JDK1.5新特性之包装类

* 包装类的作用
* 包装类的自动装箱、自动拆箱 
* 包装类的转换

### ### 基本数据类型包装
	基本数据类型			包装类		 	    
  
```java
    int					Integer			 
    char			    Character      
    byte				Byte			 
    short				Short               
    long				Long			 
    float			 	Float		 
    double			  	Double		 
    boolean			 	Boolean	
```

### 	 
​	基本数据类型			包装类		 	    
  	 

### Number类的定义 
​	Number是抽象类，主要是将数字包装类中的内容变为基本数据类型。

### 装箱及拆箱
​	 基本数据类型 ----> 包装类  （装箱 ： boxing） 
​	 包装类  ----> 基本数据类型 （拆箱: unboxing）

	 JDK1.5版本之前，包装类不能直接进行+，-，*，/等操作；
	 JDK1.5版本之后，增加了自动拆箱和装箱的功能，且可以使用包装类直接进行数字运算。


​    
### 包装类的应用：
​	1.将字符串与数据类型相互转换
​	2. 泛型

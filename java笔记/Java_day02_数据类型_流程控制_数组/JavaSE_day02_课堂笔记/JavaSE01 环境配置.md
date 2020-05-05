## Java语言概述
### 1 . 安装JDK

* (1) 官网下载JDK：http://www.oracle.com/technetwork/java/javase/downloads/index.html

* (2) 安装JDK：JDK 安装文件可运行于特定的平台, 为了便于设置环境变量，我们将安装到默认的安装目录

* (3) JDK文件目录结构

* 
  ![](img\JDK目录结构.png)

* ```
  bin:Java 可执行命令
  jre: java 运行时环境
  lib: （Library 类库）：jdk提供的类与接口的仓库
  src.zip:(source):源码包
  ```

  

* (4) 设置环境变量：  
  环境变量是操作系统或其他应用程序用于定位JDK操作系统变量,通常建立  
  		

      编辑 Path :  ;C:\Program Files\Java\jdk1.8.0_201\bin                            
      新建CLASSPATH :   .;C:\Program Files\Java\jdk1.6.0_10\lib	
      
      或者
      
      新建JAVA_HOME:C:\Program Files\Java\jdk1.8.0_201
      编辑 Path :  ;%JAVA_HOME%\bin                            
      新建CLASSPATH :   .;%JAVA_HOME%\lib	

**注意：**
	**CLASSPATH中的 点号. : 当前java 命令执行的根目录**



### 2. 第一个Java程序
新建文件HelloWorld.java  

```java
//1. 文件名必须与类名同名(大小写严格区分)
public class HelloWorld{
	// 2. 主方法的固定写法,,main()运行的入口方法
	public static void main(String[] args){
		System.out.println("Hello Smith!");
	}
}
//3.一个文件中可以同时包含多个类，但是只能有一个public修饰的公开类，并且编译后会分别生成相互独立的类(.class字节码文件);	
```

### 3.分析Java源文件执行原理

### 	

![](img\Java源文件执行原理图.png)

### 4.JDK & JRE 
	JDK : Java Development kits (Java开发工具包)
	JRE: Java Runtime Environment(Java运行时环境)

**Java 跨平台**

![](img\Java跨平台.png)


## 流的概念和作用
	>流是一组有顺序的，有起点和终点的字节集合，是对数据传输的总称或抽象。
	即数据在两设备间的传输称为流，流的本质是数据传输，根据数据传输特性
	将流抽象为各种类，方便更直观的进行数据操作。

## IO流的分类

* 根据处理数据类型的不同分为：字符流和字节流
* 根据数据流向不同分为：输入流和输出流

## 字符流和字节流

 * #### (1) 字符流的由来： 因为数据编码的不同，而有了对字符进行高效操作的流对象。

     ```
     本质其实就是基于字节流读取时，去查了指定的码表。
     Java中的字符是Unicode编码的，是双字节的
     ```

     

* #### (2) 字节流和字符流的区别：

     ```
      a. 读写单位不同：字节流以字节（8bit）为单位，  
       				字符流以字符为单位，根据码表映射字符，一次可能读多个字节。
      b. 处理对象不同：字节流能处理所有类型的数据（如图片、视频、音频等）  
       				   字符流只能处理字符类型的数据。
      c. 执行原理不同：
       		 字节流输出：   程序---->字节流(直接操作文件)---->文件（适合于一些二进制的对象，音频，视频，图片等）	
       		 字符流输出：   程序---->字符流---->缓冲---->文件（适合于文本操作）输入流和输出流
     
     ​	输入流只能进行读操作，输出流只能进行写操作，程序中需要根据待传输数据的不同特性而使用不同的流。
     ```

     

> 设备上的数据无论是图片或者视频，文字，它们都以二进制存储的。
>  二进制的最终都是以一个8位为数据单元进行体现，所以计算机中的最小数据单元就是字节。
>  意味着，字节流可以处理设备上的所有数据，所以字节流一样可以处理字符数据。

> **缓冲 buffer： 减少程序与磁盘的交互（读写）次数===【减少磁盘IO次数】====提高效率**

### 流的分类  

字节流： OutputStream （写）、 InputStream（读）

#### （1）对文件进行操作：
	>FileInputStream（字节输入流），FileOutputStream（字节输出流），  
	FileReader（字符输入流），FileWriter（字符输出流）

#### （2）对管道进行操作：
	>PipedInputStream（字节输入流）,PipedOutStream（字节输出流），
 	PipedReader（字符输入流），PipedWriter（字符输出流）
	PipedInputStream的一个实例要和PipedOutputStream的一个实例共同使用，
	共同完成管道的读取写入操作。主要用于线程操作。

#### （3）对数组进行操作：     
	>字节/字符数组：ByteArrayInputStream，ByteArrayOutputStream，  
	CharArrayReader，CharArrayWriter是在内存中开辟了一个字节或字符数组。

#### （4）Buffered缓冲流：
	>BufferedInputStream，BufferedOutputStream，
	BufferedReader,BufferedWriter,是带缓冲区的处理流，
	缓冲区的作用的主要目的是：减少每次和硬盘交互次数，提高数据访问的效率。

#### （5）转化流：
> InputStreamReader/OutputStreamWriter，把字节转化成字符流。

#### （6）数据流：DataInputStream，DataOutputStream。
	>因为平时若是我们输出一个8个字节的long类型或4个字节的float类型，那怎么办呢？  
	可以一个字节一个字节输出，也可以把转换成字符串输出，但是这样转换费时间，
	若是直接输出该多好啊，因此这个数据流就解决了我们输出数据类型的困难。
	数据流可以直接输出float类型或long类型，提高了数据读写的效率。

#### （7）打印流：

> PrintStream，PrintWriter，一般是打印到控制台，可以进行控制打印的地方。

#### （8）对象流：
> ObjectInputStream，ObjectOutputStream，把封装的对象直接输出，而不是一个个在转换成字符串再输出。

#### （9）序列化流：SequenceInputStream。
	>对象序列化：把对象直接转换成二进制，写入介质中。
	使用对象流需要实现Serializable接口，否则会报错。
	而若用transient关键字修饰成员变量，不写入该成员变量，
	若是引用类型的成员变量为null，值类型的成员变量为0.

----------

## 缓冲思想  
	>字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，
	这是加入了数组这样的缓冲区效果，Java本身在设计的时候，
	也考虑到了这样的设计思想，所以提供了字节缓冲区流
	减少程序与硬盘的交互次数，从而提高IO效率

##### BufferedInputStream   

	BufferedInputStream内置了一个缓冲区(数组),	从BufferedInputStream中读取一个字节时,	BufferedInputStream会一次性
	从文件中读取8192个, 存在缓冲区中, 返回给程序一个程序再次读取时,
	 就不用找文件了, 直接从缓冲区中获取直到缓冲区中所有的都被使用过, 
	才重新从文件中读取8192个
##### BufferedOutputStream

	BufferedOutputStream也内置了一个缓冲区(数组)
	程序向流中写出字节时, 不会直接写到文件, 先写到缓冲区中
	直到缓冲区写满, BufferedOutputStream才会把缓冲区中的数据一次性写到文件里
##### 复制文件示例   
```java
 FileInputStream fis = new FileInputStream("aaa.txt");
 FileOutputStream fos = new FileOutputStream("bbb.txt");
BufferedInputStream bis=new BufferedInputStream(fis);	 
BufferedOutputStream bos=new BufferedOutputStream(fos);	       
 int b;
 while((b=bis.read())!=-1){
  bos.write(b);
 }
  bis.close();
  bos.close();
```

​     **为什么会出现乱码？**

> 写入的编码与读取的编码不一致。
## interface Collection : 集合的根接口 （容器）

## class Collections :工具类，  封装了一系列有关接口的操作（搜索，排序，反转...）



```java
Math: 数学算法中一系列操作
Arrays : 数组的工具类
Collections ：集合的工具类， 封装了一系列有关接口的操作
DateUtil  : 日期工具类，封装了一系列日期的操作
StringUtil ： 字符串的工具类 
FileUtil ： 文件的工具类 （文件夹、文件创建，文件查询，文件复制，上传，下载）
 
```

```java
流 IO
字节流：按字节byte 传输
	   适用于图片、音频、视频等流媒体
	   更贴近二进制，读写速率会更好
	   
字符流：按字符char 传输 
	   适用于文本类读写
        【自带缓冲 buffer】


字节流：
	OutputStream : 
	InputStream :
	步骤
	(1) 创建流对象
	    OutputStream os = new FileOutputStream(File / String filepath , boolean append);
        InputStream is = new FileInputStream(File / String filepath , boolean append);
	(2) 读或写操作
        	os.write(str.getBytes())  // 按照字节挨个写入
        	is.read()
	(3) 关闭流
        	os.close() | is.close()


        
字符流：
       Writer: 字符写入流的抽象父类
       Reader
           
  FileWriter.flush() 
 --- OutPutStreamWriter.flush()
 --- this.implFlushBuffer()
 --- this.writeBytes() // 字节write
 --- OutputStream.write(...)
           
           
 FileWriter.write()
   -- this.writeBytes()        
           
  
   字符流 --------- 字节流
           
           
BufferedWriter  可以自定义缓冲区大小的字符流  
           
  缓冲的本质： char[] charBuffer
  默认char[] 的长度，8192个字符
   public BufferedWriter(){ 
           this(defaultCharBufferSize);  // 默认的缓冲大小
  }  
public BufferedWriter(int sz){
    charBuffer = new char[sz];
}

最终写完一定要 flush 刷新缓冲区 【write 】
           
           
           


```

## buffer 缓冲有什么作用？

```
提高读写效率
程序（字符串） -----  硬盘 （ d://hello.txt ）
本身 对硬盘的IO操作单次的消耗就是重量级
所以希望减少与硬盘的交互次数====> 减少与硬盘的IO 次数
提出了缓冲，提高读写效率
原本是挨个字符读，写，  先将数据写道缓冲中，缓冲如果数据满了，就将缓冲的数据写入到文件中
```



```
字符流     字节流
```






#### 一. 简答题	

```
（1）集合框架有哪些接口和类，区别都是什么
（2）List中ArrayList与LinkedList的区别

```



#### 二. 编写一个程序，使用ArrayList存储客户的邮件地址。地址中应该包含姓名、手机号码街道、市（县）、省（自治区）、国家（地区）和代码，	然后显示ArrayList中的内容。推荐步骤如下：

```
1、定义一个MailAddress类
	1）属性：姓名name、手机号码telno街道street、市（县）city、省（自治区）state、国家（地区）country和代码pincode。
	2）带参构造方法：通过构造方法给新建的MailAddress对象各属性赋值。
	3）重写toString（）方法：按照输出结果所示，编写显示详细信息的字符串。
2、定义一个MailAddressArrayList类
   1）属性：List<MailAddress>类的对象addressList
   2）无参构造方法：构建addressList对象
   3）add()方法：将客户的邮件地址(新建MailAddress的对象)添加到 ArrayList中
   4）display()方法：打印客户的邮件地址。
3、定义一个ClassMain类，通过main()方法测试以上结果：
   1）创建MailAddressArrayList类的对象
   2）调用add()和display（）方法。
   3）给定客户姓名，获得该客户所有的邮件
```

#### 三.在ArrayList中添加课程Course（课程编号，名称，学分）信息	

```
（1）添加若干课程
（2）判断是否存在"数据库原理"课程，如果存在，替换为"数据结构"课程
（3）删除学分最低的课程
```

​	

#### 四、实现简单的购物车功能（初始化20个商品，实现购物车的增删查改，还有总价的显示）

```
商品属性：商品ID，商品名，商品价格 	
```


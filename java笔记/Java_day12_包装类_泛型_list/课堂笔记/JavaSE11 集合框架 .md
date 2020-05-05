## 数组与集合
```java
   （1）数组特征：
            (1)、数据类型一致；
            (2)、空间是连续；
            (3)、下标位置从0开始；
            (4)、获得数组的开辟空间长度，数组的length属性；
            (5)、通过下标表示数组中元素的个数：index。
			int[] i = new int[3];
			int[] j = {1,2,3};
		        
    （2）集合特征： 
            (1)、集合中可以任何数据类型(Object)数据；
            (2)、自动扩容；
            (3)、size() 返回集合中元素的个数；
```


## 集合框架 


接口的继承关系：


```java
		(接口)						Collection 
						   _____________|_____________________
						   |					|		 |				 |
		(接口)			  List					Set		Queue		SortedSet .................
					  ______|____
					 |			 |
		(实现类)		ArrayList	 LinkedList	 Vector	HashSet(散列)   TreeSet(有序)
```


​			
```java
		  Map接口(映射) key-value
		(接口)        Map
		  |
		(接口)       SortedMap
```

### Collection接口的定义：

```java
 Collection是保存单值集合的最大父接口
	 定义格式：
	 public interface Collection<E> extends Iterable<E>
所有的类集操作都存放在java.util包中。
在一般的开发中，往往很少去使用Collection接口直接去开发，基本是使用
其子接口，子接口主要有：List,Set,Queue,SortedSet
```

### Collection子接口的定义：
​	 List接口：可以存放重复的内容
​	 Set接口：不能存放重复的内容，所有的重复内容都是靠hashCode()  和equals()两个方法区分的。
​	 Queue: 队列接口。
​	 SortedSet接口：可以对集合中的数据进行排序。



















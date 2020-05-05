## Set
​	存储不重复（唯一）的元素的集合

### 常用的实现子类
#### 1. HashSet:散列存放

* 唯一性： 依赖于 重写equals、hashcode方法
* 底层通过HashMap实现

### （1）HashSet 示例1

```java
Set<Integer> intSet = new HashSet<>();
        intSet.add(new Integer(10));
        intSet.add(new Integer(10));
		// set中只存放了一个10.【因为 Integer 实现了重写equals、hashcode方法】
```

#### （2）HashSet 示例2


```java
Set<Product> proSet = new HashSet<Product>();
Product p1 = new Product(1004,"东北烤串",60,25);
Product p2 = new Product(1004,"东北烤串",60,25);
proSet.add(p1);
proSet.add(p2);
set中只存放了两个product, 但是在现实中，则认为p1,p2是同一个商品，在集合中只需要存放一次；
    所以需要重写 Product类中的equals、hashcode方法。
```



----------

----------

### 2.TreeSet：有序存放
##### （1）new TreeSet()	自然顺序

```java
 class E implements Comparable<E>{
         @Override
         public int compareTo(E o1  
         //实现自然顺序
         }
 }
Set<E> set1 = new TreeSet();
Set<E> set2 = new TreeSet();
                              
```

######   底层实现：

```java
	TreeMap.put(e1,..) ---Comparable c = (Comparable)e1 ---- 若第一次添加，不比较，直接添加
	TreeMap.put(e2,..) ---Comparable c = (Comparable)e2 ----  e2.compareTo(e1),return (0 或 -1 或 1)
	【返回 0 表示相同元素，不能添加，实现去重】
```



### 注意i： String,Byte,Short,Integer,Long,Float,Double,Character,Boolean  都已经实现了 自然顺序





##### （2）new TreeSet(自定义排序规则)	

```java

	Set<E> set3 =  new TreeSet<E>( new Comparator<E>(){
            @Override
            public int compare(E o1, E o2)  
				//实现自定义排序规则A,仅仅使用于set3
            }
    });
    
Set<E> set4 =  new TreeSet<E>( new Comparator<E>(){
        @Override
        public int compare(E o1, E o2)  
			//实现自定义排序规则B,仅仅使用于set4
        }
});
 compare方法返回 (0 或 -1 或 1), 
【返回 0 表示相同元素，不能添加，实现去重】
【所以，自然顺序必须要实现Comparable接口，否则会有类型转换异常ClassCastException】
```

##### （3）TreeSet示例1：自然顺序
```java
	class Product implements  Comparable<Product>{
		  // 按照价格的升序排序，若价格相同，则按照编号升序排序，若编号相同，业务中认为是相同商品
	    @Override
	    public int compareTo(Product o) {
	        if(this.proPrice != o.proPrice)
	            return  this.proPrice < o.proPrice ? -1 : 1;
	        else{
	            if(this.proId == o.proId)
	                return 0;// 【不添加，去重】
	            return  this.proId < o.proId ? -1 : 1;
	        }	
	    }
	}
```

##### （4）TreeSet示例2：自定义排序规则

```java
	
    // 商品按照名称字母顺序排序，若名称相同，按照编号先后顺序       
    class Product {

	}	

    Set<Product> set2 =  new TreeSet<Product>( new Comparator<Product>(){ //匿名内部类
        @Override
        public int compare(Product o1, Product o2) {
            if(o1.getProName().compareTo(o2.getProName())  !=0)
                return o1.getProName().compareTo(o2.getProName());
            else{
                if(o1.getProId() == o2.getProId())
                    return 0;// 【不添加，去重】
                return o1.getProId()  < o2.getProId() ? -1 : 1;
            }
        }
    });
```
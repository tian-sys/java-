# Set


```
存储不重复（唯一）的元素的集合
```

### 常用的实现子类
#### 1. HashSet:散列存放 (重点掌握 为什么要重写equals方法与hashcode方法)

* ```
  - 唯一性： 依赖于 重写equals、hashcode方法
  - 底层通过HashMap实现
  ```

  
#### 2. TreeSet：有序存放  

```java
- Set set1 = new TreeSet(): 按照自然顺序排序
  	Set set2 = new TreeSet(): 按照自然顺序排序
  	Set set3 = new TreeSet(new Comparator(){
  		//自定义排序规则A,该排序规则仅适用于该集合set3
  	});
  	
  	Set set4 = new TreeSet(new Comparator(){
  		//自定义排序规则B,该排序规则仅适用于该集合set4
  	})

  	

```



* 
   



##### (1)自然排序 new TreeSet()

```java
(1)实现自然排序 new TreeSet<E>()

- implements Comparable<E>  
		  return pro.compareTo(o)  == 0 去重  
	*底层实现:  
	 TreeMap.put(p1,...) ----  Comparable pro1 =  (Comparable)p1; ----之前没有数据，不比较了    
	 TreeMap.put(p2,...) ----  Comparable pro2 =  (Comparable)p2; ---- pro2.compareTo(pro1) :[0,1,-1]

```

##### （2）自定义排序规则 new TreeSet(new Comparator<Product>(){...})

```java
new TreeSet<Product>( new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                //自定义排序规则
				return 0 去重
            }
```


​				
​	

### HashSet 示例1

```java
Set<Integer> intSet = new HashSet<>();
intSet.add(new Integer(10));
intSet.add(new Integer(10));
// set中只存放了一个10.【因为 Integer 实现了重写equals、hashcode方法】
```


### HashSet 示例2

```java
Set<Product> proSet = new HashSet<Product>();
Product p1 = new Product(1004,"东北烤串",60,25);
 Product p2 = new Product(1004,"东北烤串",60,25);
 proSet.add(p1);
proSet.add(p2);
set中只存放了两个product, 但是在现实中，则认为p1,p2是同一个商品，在集合中只需要存放一次；
所以需要重写 Product类中的equals、hashcode方法。
```

​	

### TreeSet示例1：自然顺序	
```java
 class Product implements  Comparable<Product>｛
	// 按照价格的升序排序，若价格相同，则按照编号升序排序，若编号相同，业务中认为是相同商品
	    @Override
	    public int compareTo(Product o) {
	        if(this.proPrice != o.proPrice)
	            return  this.proPrice < o.proPrice? -1 : 1;
	        else{
	            if(this.proId == o.proId)
	                return 0;// 【去重】
	            return  this.proId < o.proId? -1 : 1;
	        }	
 }
｝
```
### TreeSet示例2：自定义顺序

```java
	 // 商品按照名称字母顺序排序，若名称相同，按照编号先后顺序
        //匿名内部类
        Set<Product> set2 =  new TreeSet<Product>( new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getProName().compareTo(o2.getProName())  !=0)
                    return o1.getProName().compareTo(o2.getProName());
                else{
                    if(o1.getProId() == o2.getProId())
                        return 0;
                    return o1.getProId()  < o2.getProId() ?-1:1;
                }
            }
        });
```


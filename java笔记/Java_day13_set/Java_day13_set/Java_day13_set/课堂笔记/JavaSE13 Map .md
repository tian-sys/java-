## Map映射
### 案例： 统计各省份人口数	
```
	省份		人口数（万人）
	广东		10999
	山东		9946
	河南		9532
	四川		8262
	江苏 	    7998
```

### 这种一一对应的数据存储，需要使用Map<键，值>存储。
#### 1. Map<Key，Value>特点：	
```
key:键，唯一性
value :值
```

####  2. 核心方法：	
```java
put(key,value)：注意返回值
get(key)
keySet()：注意返回的Set
values()
entrySet()： map将每一个键值对封装成 Entry对象
```

#### 3.参考Map对key-value底层的封装图 

```java
	Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
    Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
    while(it.hasNext()){
        Map.Entry<String,Integer> entry = it.next();
        String key = entry.getKey();
        Integer value = entry.getValue();
    }
```

![](Map底层键值对的封装.png)

#### 4. HashMap 键值对 散列存放	

```
Key 的唯一性依赖于 重写equals() hashcode()方法
```

#### 5. TreeMap 键值对 有序存放	
```
Key 的唯一性依赖于 自然顺序 或者 自定义排序规则（与TreeSet实现相似）
```

#### 6. Hashtable

* **HashMap<K,V>**
	* 适用于单线程 
	* key,value 允许为null
	* 底层是Node[]添加新Node对象 
* **Hashtable<K,V>**
	* 适用于多线程，线程安全 
	* key,value 都不允许为null，否则会抛NullPointerException
	* 底层是Entry[]添加新Entry对象 ,本质与HashMap一致
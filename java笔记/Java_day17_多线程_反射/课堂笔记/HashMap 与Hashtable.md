# HashMap 与Hashtable

```java
HashMap<K,V> 非线程安全，适用于单线程 （数组 + 链表 + 红黑树）
    		key,value 都可以为null
    
Hashtable<K,V> 线程安全的，适用于多线程
    		 key,value 都不能为null
    
    
t0,t1,t2,t3...tn 修改共享资源 ，  hashmap.put, remove()等 没有同步，所以线程不安全
    
    
    
   
HashMap<String,String> map =   new HashMap<>();
map.put("a","A");
map.put(null,"B");
map.put("c",null);
map.remove("a");


Hashtable<String,String> table =   new Hashtable<>();
table.put("a","A");  		// Hashtable.put synchronized
//table.put(null,"B");   	NullPointerException Hashtable 的key 不能为null
//table.put("c",null);   	NullPointerException Hashtable 的value 不能为null
table.remove("a"); 			// Hashtable.remove synchronized 
```


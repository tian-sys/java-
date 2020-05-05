```java
class Foo{    
    String code;    
    String name;   
    //...
}

List{  
    	Foo("测试1","test a")   
        Foo("测试2","test b")   
        Foo("测试1","test c") 
        Foo("测试3","test d")
        Foo("测试3","test e")  
        Foo("测试4","test f")
}   

将以上List转换成Map
    Map{     
    "测试1", List(Foo("测试1","test a"),Foo("测试1","test c")),     
    "测试2", List(Foo("测试2","test b")),   
    "测试3", List(Foo("测试3","test d"),Foo("测试3","test e")),    
    "测试4", List(Foo("测试4","test f"))
}
```


# 动态代理（非常重要）

## 场景：

### 在商品进行增删改操作后实现日志记录

![](img\代理1.png)

代码实现

```java
public interface ProductService {

    //添加商品
    public boolean add(Product product);
    //修改商品
    public boolean update(Product product);
    //删除商品
    public boolean delete(Product product);
    //查询所有商品
    public List<Product> get();
    //根据Id查询商品
    public Product getById();

}
```

```java
public class ProductServiceImpl implements ProductService {
    @Override
    public boolean add(Product product) {
        System.out.println("商品添加实现...");
        new LogUtil().addLog();
        return false;
    }

    @Override
    public boolean update(Product product) {
        System.out.println("商品修改实现...");
        new LogUtil().addLog();
        return false;
    }

    @Override
    public boolean delete(Product product) {
        System.out.println("商品删除实现...");
        new LogUtil().addLog();
        return false;
    }

    @Override
    public List<Product> get() {
        System.out.println("商品查询所有实现...");
        return null;
    }

    @Override
    public Product getById() {
        System.out.println("商品根据id查询实现...");
        return null;
    }
}
```

```java
/**
 * 日志记录类
 */
public class LogUtil {
    public void addLog(){
        System.out.println("实现日志的添加>>>>>>>>>>>");
    }
}
```

 

**存在的问题：**

```
1.系统的核心业务与服务业务，通过硬编码交织在一起，耦合性非常高

2. 从业务实现角度上看，添加订单中的日志记录出异常，对于添加订单模块而言，是失败

3.代码冗余 
```



#### 问题解决：

### **解决方案：** AOP （Aspect Oriented Programming）： 面向切面编程

```
 将日志记录从核心业务中分离，实现模块的低耦合、高内聚 

 AOP （Aspect Oriented Programming）：  面向切面编程

1. 业务逻辑又进行了进一步的抽取，将多种业务逻辑中的公用部分抽取出来做成一种服务（比如日志记录，性能统计，安全验证，事务管理等），从而实现代码复用。

2. 这种服务通过配置可以动态的给程序添加统一控制，利用AOP可以对业务逻辑的各个部分进行分离，从而使得业务逻辑各部分之间的耦合度降低。
```



## 两种实现方式：

### 1.   JDK动态代理

### 2.  CGLIB代理

 

**（1）**      **JDK动态代理—面向接口**

```
面向接口对象的代理，通过Java反射机制和动态生成class的技术，来动态生成被代理的对象的实现对象。
```

**（2）**      **Cglib动态代理** 

```
JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理，cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理。 
```

 

### **JDK动态代理依靠接口实现，如果有些类并没有实现接口，则不能使用JDK代理，这就要使用cglib动态代理了。

![](img\代理2.png)

## JDK动态代理实现方式

代码实现

```java

public class ProductServiceImpl implements ProductService {
    @Override
    public boolean add(Product product) {
        System.out.println("商品添加实现...");
        return false;
    }

    @Override
    public boolean update(Product product) {
        System.out.println("商品修改实现...");
        return false;
    }

    @Override
    public boolean delete(Product product) {
        System.out.println("商品删除实现...");
        return false;
    }

    @Override
    public List<Product> get() {
        System.out.println("商品查询所有实现...");
        return null;
    }

    @Override
    public Product getById() {
        System.out.println("商品根据id查询实现...");
        return null;
    }
}

```



#### 代理对象类

```java
/**
 * 代理类
 * （1）产生代理对象
 * （2）能够实现在商品进行 增删改后 执行日志记录
 * InvocationHandler.invoke()
 *      目标对象 ProductServiceImpl 调用任意方法 add,delete,update,get,getById....
 *       就会触发调用 代理对象.invoke()
 */
public class MyProxy implements InvocationHandler {

    //目标对象
    private Object target;
    public MyProxy(Object target){
        this.target = target;
    }

    //（1）产生目标对象的代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                      target.getClass().getInterfaces(),
                                      this);
    }

    //（2）能够实现在商品进行 增删改后 执行日志记录
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object returnValue = method.invoke(target,args); //目标对象所有方法都要执行

        if(method.getName().equals("add") || 
           method.getName().equals("update")|| 
           method.getName().equals("delete"))
            new LogUtil().addLog(); //执行日志记录
        return returnValue;
    }
}
```

测试类

```java
public static void main(String[] args) {
    /**
     * 代理对象  proxy
     * 目标对象 ：【面向接口】 new ProductServiceImpl();
     *
     * 实现： 实现商品的添加删除修改 + 日志记录
     */
    ProductService service = (ProductService)  new MyProxy(new ProductServiceImpl()).getProxy();
    service.get(); //添加商品
}
```



##    **Cglib动态代理** 

目标对象没有接口

```java
public class ProductServiceCglib {

    public boolean add(Product product) {
        System.out.println("商品添加实现...");
        return false;
    }


    public boolean update(Product product) {
        System.out.println("商品修改实现...");
        return false;
    }


    public boolean delete(Product product) {
        System.out.println("商品删除实现...");
        return false;
    }


    public List<Product> get() {
        System.out.println("商品查询所有实现...");
        return null;
    }


    public Product getById() {
        System.out.println("商品根据id查询实现...");
        return null;
    }
}
```

通过生成目标对象的子类 作为代理对象，再进行方法回调

```java
public class MyCglibProxy implements MethodInterceptor {  //方法拦截器
    private Object target;
    public MyCglibProxy(Object target){
        this.target = target;
    }
    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());  // target: 目标对象 父类 ， enhancer: 代理对象 子类
        enhancer.setCallback(this);
         return   enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object returnValue = method.invoke(target,args); //目标对象所有方法都要执行

        if(method.getName().equals("add") || method.getName().equals("update")|| method.getName().equals("delete"))
            new LogUtil().addLog(); //执行日志记录

        return returnValue;
    }
}
```
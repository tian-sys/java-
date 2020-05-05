# 单例模式 Singleton

在内存中该对象只有一份

### （1 ）饿汉模式：	

```
在Bank类加载的时候，Bank对象就创建好了
```

### （2）懒汉模式：

```
外部调用getBankInstance() (外部 什么时候需要使用bank对象的时候)， 才实例化Bank对象，尤其是该对象是重量级对象（ 实例化需要很多资源[网络资源，内存，时间....] ）=====> 延迟实例化对象 （ 懒加载 lazy ） 
```



饿汉模式示例：

```java
public class Bank {//student product

        private static Bank bank =  new Bank();

        private Bank(){}

        public static Bank getBankInstance(){
            return bank;
        }

}
```

懒汉模式示例：

```java
public class Bank2 {
    private static Bank2 bank = null;
    private  Bank2(){}
    
    public static Bank2 getBankInstance(){
        if(bank == null)
            bank = new Bank2();
        return  bank;
    }
}
```
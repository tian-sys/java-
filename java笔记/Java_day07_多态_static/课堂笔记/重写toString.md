# 重写 toString



```java

class Account{
    private long accNo;
    private String accName;
    private int accPassword;  //账户密码
    private long  accTelno;  //账户手机号
    private String personId;
    private double accBalance;  //账户余额
    private int   accType; //账户类型 0:储蓄账户， 1：信用账户
    ....
    ....
}

Account account = new Account("计长瑞",123456,183928392L,"374938943043",0);
System.out.print(account); 
System.out.print(account.toString()); // 继承了 Object.toString() ： 类全名@哈希码


//Object中的toString方法
public class Object{
      public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
     }
}

//在Account类中，希望 显示的是 account的基本信息值,所以需要重写父类的toString()
class Account{
  @Override
    public String toString() {       
        return "Account{" +
                "accNo=" + accNo +
                ", accName='" + accName + '\'' +
                ", accPassword=" + accPassword +
                ", accTelno=" + accTelno +
                ", personId='" + personId + '\'' +
                ", accBalance=" + accBalance +
                ", accType=" + accType +
                '}';
    }
}
```


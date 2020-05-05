1. 设计小米手机，华为手机，iphone手机，有以下参数：商品名称，商品编号，型号，内存，屏幕尺寸，颜色
  有功能：打电话，发信息，拍照
  iphone特有功能： siri说话
  华为的拍照内部实现与其他手机实现不一样（只要有方法结构就行，内部业务不实现）

类中要有属性，无参构造函数，有参构造函数，get,set方法
再写测试类创建3款手机对象，调用方法





2. 设计银行类，存储着所有的银行账户信息，可以开户，统计储蓄账户的金额，统计信用账户的金额，

   完成功能并写出测试类BankTest



```java
public class Account{...}
public class SavingAccount extends Account{...} 
public class CreditAccount extends Account{...}


public class Bank {
    private Account[] accountArr = new Account[100];//假设默认存储100个银行账户

    /**
     * 账户开户
     * @param username  开户人的姓名
     * @param telno 开户人的手机
     * @param password  账户密码
     * @param accountType 开户类型（0：储蓄账户，1：信用账户）
     * @return
     */
    public Account regist(String username,long telno,int password,int accountType){
        return null;
    }

    /**
     * 统计出储蓄账户的总金额
     * @return 返回储蓄账户的总金额
     */
    public double getSavingAccountMoney(){
        return 0;
    }

    /**
     * 统计出信用账户的总金额
     * @return 返回信用账户的总金额
     */
    public double getCreditAccountMoney(){
        return 0;
    }
}
```
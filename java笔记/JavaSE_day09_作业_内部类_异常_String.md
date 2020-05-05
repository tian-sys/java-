#### 1. 下面这段代码的输出结果是什么？

```java
public class Test {
    public static void main(String[] args)  {
        Outter outter = new Outter();
        outter.new Inner().print();
    }
}

class Outter{
    private int a = 1;
    class Inner {
        private int a = 2;
        public void print() {
            int a = 3;
            System.out.println("局部变量：" + a);

            System.out.println("内部类变量：" + this.a);

            System.out.println("外部类变量：" + Outter.this.a);

        }
    }
}
```

#### 2. String底层是怎么实现的？

#### 3. 列出一些你常见的运行时异常？至少五个（常见面试题）

#### 3. 编程题：密码验证合格程序

##### **题目描述**

##### 密码要求: 

```
1.长度超过8位
2.包括大小写字母.数字.其它符号,以上四种至少三种
3.不能有相同长度超2的子串重复
说明:长度超过2的子串
输入密码不符合要求的，则返回自定义异常InvalidPasswordFormatException。
```

**输入描述**

一组或多组长度超过2的子符串。每组占一行 

**输出描述**

如果符合要求输出：OK，否则输出NG 

**输入例子**

```
021Abc9000
021Abc9Abc1
021ABC9000
021$bc9000
```

 

**输出例子**

```
OK
NG
NG
OK
```


## 一、选择题 （共50分）

#### 1. 以下关于继承的叙述正确的是（  A  ）

```java
A、在Java中类只允许单一继承
B、在Java中一个类只能实现一个接口  // 类也实现多个接口
C、在Java中一个类不能同时继承一个类和实现一个接口
D、在Java中接口只允许单一继承
```

#### 2. 给出下面代码，关于该程序以下哪个说法是正确的？（   C ）

```java
public class Person{ 
    //int[] a
    // int a[] 
	static int arr[] = new int[5];
	public static void main(String args[]) { 
		System.out.println(arr[0]);
	} 
   
}

A、编译时将产生错误            B、编译时正确，运行时将产生错误
C、输出零                     D、输出空
```

#### 3.   在使用interface声明一个接口时，只可以使用（  D  ）修饰符修饰该接口。

```java
A、private            B、protected         C、private  protected   D、public
```

#### 4.   编译并运行以下程序，以下描述哪个选项是正确的（ D ）

```java
class  A{
    //新方法（重载）
	 protected  boolean  equals(){
		return  super.equals();
	}
    /*
    	public boolean equals(Object o){
    
		}
	*/
}
}

A、编译通过运行无异常     B、编译通过但运行时出错
C、行2出错，不能成功编译     D、不能成功编译，行3出错
```

#### 5. 阅读以下代码：输出结果应该是：（  C  ）

```java
import java.io.*;	
import java.util.*;

public class Foo{
	public static void main (String[] args){
		String s;
		System.out.println("s=" + s);
	}
}

输出结果应该是：（  C  ）
A．代码得到编译，并输出“s=” 
B．代码得到编译，并输出“s=null” 
C．由于String s没有初始化，代码不能编译通过
D．代码得到编译，但捕获到 NullPointException异常
```

#### 6.   编译运行以下程序后，关于输出结果的说明正确的是 （  C  ）

```java
public  class   Conditional{
		public  static  void  main(String  args[ ]){	
 			 int  x=4;
			System.out.println(“value  is  “+ ((x>4) ? 99.9:9));
	}
}

A．输出结果为：value  is  99.9             B．输出结果为：value  is  9
C．输出结果为：value  is  9.0               D．编译错误
```

#### 7.  执行完以下代码int [ ]  x = new int[10]；后，以下哪项说明是正确的（  A  ）

```java
A．x[9]为0          B．x[9]未定义      C．x[10]为0       D．x[0]为空
```

#### 8. 关于以下程序段，正确的说法是（ C   ）

```java
   String  s1="a"+"b";
   String  s2= new  String（s1）；
   if（s1 == s2）
  	System.out.println(“= =  is succeeded”);
  if (s1.equals(s2))
 	System.out.println(“.equals() is succeeded”);

A．行4与行6都将执行            B．行4执行，行6不执行
C．行6执行，行4不执行          D．行4、行6都不执行
```

#### 9.  应用程序的main方法中有以下语句，则输出的结果是： （  A）

```java
int[]  x={122,33,55,678,-987}; 
int  y=x[0];      // y = 122
for(int i=1;i<x.length;i++){ 
	if(x[i]>y) 
	y =x[i]; 
}  
System.out.println(y); 

/*
	x[1] > 122 false ; i++
	x[2] > 122 false; i++
	x[3] >122 true, y = x[3] = 678; i++
	x[4] > 122 false ;i++ 
	 i<len false
	 y = 678
*/

A. 678 
B. 122 
C. -987
D. 33
```

#### 10.  下列语句序列执行后，k 的值是  （ D  ）

```java
int  x=6, y=10, k=5; 

switch( x % y )  {  // x % y = 6
 case 0:  k=x*y;    
 case 6:  k=x/y;   
 case 12:  k=x-y;        
 default:  k=x*y-x; 
} 

A. 60 B. 5 C. 0 D. 54
```

#### 11. 下面程序运行的结果是？ ( C  )

```java
abstract class AbstrctIt { 
	abstract float getFloat (); 
}   

public class AbstractTest extends AbstractIt {  
 	 private float f1= 1.0f;  
	 private float getFloat () {return f1;}   
}   

A. 编译成功   
B. 在第6行产生一个运行时异常  
C. 在第6行产生一个编译错误 
D. 在第2行产生一个编译错误
```

#### 12. 关于构造方法，说法错误的是：B

```
A.构造方法不可以进行方法重写
B.构造方法用来实例化一个新的对象
C.构造方法具有和类名相同的名称
D.构造方法不返回任何数据类型 
```

#### 13. 关于sleep()和wait()，以下描述错误的一项是？（D）

```java
A、sleep是线程类（Thread）的方法，wait是Object类的方法； 
B、sleep不释放对象锁，wait放弃对象锁； 
C、sleep暂停线程、但监控状态仍然保持，结束后会自动恢复； 
D、wait后进入等待锁定池，只有针对此对象发出notify方法后获得对象锁进入运行状态。
```



---------------------
#### 14. 下面程序运行的结果是（B  ）  

```java
public class Example{ 
    int x = 12;    //this.x
    public void method(int x){   //临时变量，局部变量
		x += x; 
		System.out.println(x);  
    } 

   public static void main(String[] args){  
 		Example t = new Example(); 
 		t.method(5); 
 	} 

} 
A.5   B.10     C.12    D.17    E.24
```

#### 15.   下列关于泛型的说法，错误的是(  B   ) 

```java
A、泛型是一种参数化类型 // List<T> 
B、可以取代继承机制
C、避免了运行时进行类型转换可能的潜在性错误 
D、增强了程序的灵活性和安全性
```

#### 16. 下面代码执行的结果是：（B）

```java
public class Example{ 

	String str=new String("good"); 
	char[]ch={'a','b','c'}; 

	public static void main(String args[]){
		Example ex=new Example(); 
		ex.change(ex.str,ex.ch); 
		System.out.print(ex.str+" and "); 
		Sytem.out.print(ex.ch); 
	}

	public void change(String str,char ch[]){ //strxxx = str , chxxx = ch
		str="test ok"; 
		ch[0]='g'; 
	}
}
A.good and abc
B. good and gbc
C. test ok and abc
D. test ok and gbc
```

#### 17. 已知A类被打包在packageA , B类被打包在packageB ，且B类被声明为public，且有一个成员变量x被声明为protected控制方式。C类也位于packageA包，且继承了B类 。则以下说话正确的是（ C）

```java
A．A类的实例不能访问到B类的实例 
B．A类的实例能够访问到B类一个实例的x成员
C．C类的实例可以访问到B类一个实例的x成员
D．C类的实例不能访问到B类的实例
package A
	class A{}
	class C extends B{}  // 继承并访问B x

package B
	public class B{
        protected .. x; 
        
	}
```

#### 18. 下面可以删除list中所有的“java”的代码是： （ A ）

```java
ArrayList list = new ArrayList(); 
list.add("java"); 
list.add("aaa");
list.add("java"); 
list.add("java"); 
list.add("bbb"); 

下面可以删除list中所有的“java”的代码是： （ A ）
A.    for (int i = list.size() - 1; i >= 0; i--) {
 			if ("java".equals(list.get(i))) { 
                  list.remove(i); 
			}
      }  
B.for (int i = 0; i < list.size(); i++) { 
        if ("java".equals(list.get(i))) {
         	list.remove(i); 
        }
 }  

C.list.remove("java");  
D.list.removeAll("java");
```

#### 19.下面的程序段输出的结果是（D）

``` java
int i =1,b,c;
int[] a = new int[3];
b=a[i];
c=b+i;

System.out.println(c);

A)0				B)2					C)4                  D)1
```

#### 20.字符流和字节流的区别在于（B）

```
A）前者带有缓冲，后者没有					B）前者是块读写，后者是字节读写

C）二者没有区别，可以互相使用				   D）每次读写的字节数不同
```

#### 21.访问修饰符作用范围由大到小是（D）

```
A)private-default-protected-public                   B) public-default-protected-private

C)private-protected-default-public					D) public -protected-default-private
```

#### 22.下面程序运行的结果是什么(A)

```java
public class Test2 {
    static boolean foo(char c) {
       System.out.print(c);
       return true;
    }
    public static void main(String[] argv) {
       int i = 0;
      
       for (foo('A'); foo('B') && (i < 2); foo('C')) {
           i++;
           foo('D');
       }
    }
}
 
What is the result?
A. ABDCBDCB
B. ABCDABCD
C. Compilation fails.
D. An exception is thrown at runtime.

```

#### 23. 下列语句序列执行后，ch1 的值是(B )。

```java
char ch1='A',ch2='W'; 

 if(ch1 + 2 < ch2 ) ++ch1; 

 A、 'A'    B、 'B'    C、 'C'    D、 B
```

#### 24. 哪个关键字可以对对象加互斥锁？ （B）

```java
 A transient 
 B synchronized 
 C serialize 
 D static 
```

#### 25. 假设有如下两个赋值语句,下述说法正确的是（  D   ）       

```java
a = Integer.parseInt("5");   //int
b = Integer.valueOf("5").intValue();  //int

 A、a是整数类型变量，b是整数类对象。 B、a是整数类对象，b是整数类型变量。
 C、a和b都是整数类对象并且值相等。    D、a和b都是整数类型变量并且值相等
```



## 二、简答题 （共18分）

```java
1.      Java中的访问权限的作用域分别是什么？（3分）
	 	public： 所有的类都能访问
		protected： 本包能访问，不同包中的子类
		缺省：本包中的类能访问
		private： 只有本类能访问
		
2.      Hashtable与HashMap有什么区别？（3分）
		HashMap （JDK8）是数组+链表+ 红黑树
			非线程安全，适用于单线程
		Hashtable :线程安全，适用于多线程
		
		Hashtable使用 Enumeration进行遍历， HashMap使用 Iterator进行遍历
		Hashtable继承自 Dictionary类，HashMap是 Map 接口的一个实现
		 HashMap允许空(null)键值(key)(但需要注意， HashMap最多只允许一条记录的键为mull，不允许多条记录的		值为null)，而 Hashtable不允许空(null)键值(key)。

3. 		”==”和equals方法究竟有什么区别？（3分）
			== 基本数据类型值比较
     		引用数据类型 比较的是堆地址
			equals 比较的是 对象的属性值
			
4.		写出常见的5种运行时异常（3分）
			NullPointerException
			ClassCastException
			ClassNotFoundException
			IndexOutOfBoundException
			ArrayIndexOutOfBoundException
			StringIndexOutOfBoundException
			ArithmeticException
			SystemException
			
5.		简述 synchronized 的使用原理。（3分）
		synchronized的基本使用 
		从语法的角度来看，synchronized的使用场景有 
			修饰普通方法 
			修饰静态方法 
			修饰代码块
       synchronized的作用如下： 
		 确保线程互斥访问同步代码 (只有一个线程能访问共享资源)
		 保证共享变量的修改能够及时可见 
		 有效解决指令重排序问题

6.		简述 String ,StringBuilder,StringBuffer 的区别。（3分）
		String: 字符串常量，值不能改变，所以常用在字符串值不经常发生改变的场合
		StringBuilder: 字符串变量，非线程安全，适用于单线程
		StringBuffer: 字符串变量，线程安全，适用于多线程
		
```

## 三、编程设计题

**1. 编程实现Singleton类的封装。**(10分)

```java
//饿汉模式
public class Bank {
   private  static Bank bank = new Bank();
    private Bank(){}
    /**
     * 获得Bank对象
     * @return  返回Bank对象
     */
    public static  Bank getInstance(){
        return bank;
    } 
}


//懒汉模式  
public class Bank2 {

    private static Bank2 bank2 =null;
    private Bank2(){}
    public static Bank2 getInstance(){
        if(bank2 ==null) 
            bank2 = new Bank2();        
        return bank2;
    }
}
```

#### 2.实现以下员工操作，使用到的Java知识点：对象，IO, 日期，包装类，类型转换，集合，排序 （共22分）

```java
以下员工的数据在d:\\emp.txt中
员工编号|姓名|性别|入职日期|所在部门|薪资
1001|Sam|0|20170203|研发部|28000.00
1002|Tommy|0|20160305|销售部|4000.00
1003|Sandy|1|120170203|研发部|9000.00
1004|Ada|1|20160305|行政部|6000.00
1005|Lynn|0|20170203|销售部|5000.00
1006|Yigo|0|20190605|研发部|9000.00
1007|Walter|1|120160203|销售部|5600.00
1008|Pinkman|1|20160914|研发部|9800.00

（1）将emp.txt中的员工数据中读取到员工集合中（8分） 


（2）按照部门进行统计，实现 （8分）
    研发部-（员工1，员工2，员工3...）
    销售部-（员工4，员工5...）
    行政部-（员工6，员工7...）
（3）找出薪资大于7000的研发部的员工，并按照薪资降序显示输出员工的姓名，薪资（6分）

//1. 员工实体类
public class Employee {
    private int empNo;  //员工编号
    private String empName; //姓名
    private int empGender;//性别
    private Date empHireDate;//入职日期
    private String empDept;//所在部门
    private float empSalary;//薪资

    public Employee(){}
    public Employee(int empNo, String empName, int empGender, Date empHireDate, String empDept, float empSalary) {
        this.empNo = empNo;
        this.empName = empName;
        this.empGender = empGender;
        this.empHireDate = empHireDate;
        this.empDept = empDept;
        this.empSalary = empSalary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpGender() {
        return empGender;
    }

    public void setEmpGender(int empGender) {
        this.empGender = empGender;
    }

    public Date getEmpHireDate() {
        return empHireDate;
    }

    public void setEmpHireDate(Date empHireDate) {
        this.empHireDate = empHireDate;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", empGender=" + empGender +
                ", empHireDate=" + empHireDate +
                ", empDept='" + empDept + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}


//2. 文件工具操作类
public class EmployeeFileUtil {
    //读取文件中的记录封装成List<TransRecord>
    private final  static  String filepath =  "d://emp.txt";

    /**
     * 读取文件中的员工记录
     * @return  返回交易记录集合对象
     */
    public static List<Employee> readRecord( ){
        System.out.println("文件路径：" + filepath);
        List<Employee> empList= new ArrayList<>();

        //创建读取流
        BufferedReader bufferedReader = null;
        try {
            bufferedReader =   new BufferedReader(new InputStreamReader(new FileInputStream(filepath)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String tempRecordLine =null;
        try {
            while((tempRecordLine = bufferedReader.readLine()) != null){//读取每行数据
                //解析每行记录
//                员工编号|姓名|性别|入职日期|所在部门|薪资
//                1001|Sam|0|20170203|研发部|28000.00
//                1002|Tommy|0|20160305|销售部|4000.00

                String[] recordLine =tempRecordLine.split("[|]");

                int empNo = Integer.valueOf(recordLine[0]);
                String empName =  recordLine[1];
                int empGender = Integer.valueOf(recordLine[2]);
                Date empHiredate = DateUtil.stringToDate(recordLine[3],DateUtil.PATTERN_YMDHMS);
                String empDept =  recordLine[4];
                float empSalary = Float.valueOf(recordLine[5]);
                Employee emp =      new Employee(empNo,empName,empGender,empHiredate,empDept,empSalary);

                //添加到集合中
                empList.add(emp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bufferedReader !=null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return empList;
    }
}

//3. 员工数据查询类
public class EmpOperation {

    public Map<String, List<Employee>> groupByDept(){
        Map<String, List<Employee>> map = new HashMap<>();

        //获得所有的员工集合对象
       List<Employee> employeeList =  EmployeeFileUtil.readRecord();

        for(Employee emp:employeeList){
            if( !map.containsKey(emp.getEmpDept())){
                List<Employee> list = new ArrayList<>();
                list.add(emp);
                map.put(emp.getEmpDept(),list);
            }else{
                List<Employee> list = map.get(emp.getEmpDept());
                list.add(emp);
            }
        }
        return map;
    }

    public Set<Employee> orderBySalary(){
        Set<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getEmpSalary() != o2.getEmpSalary())
                    return o1.getEmpSalary() > o2.getEmpSalary() ?-1:1;
                else
                    return o2.getEmpNo() -o1.getEmpNo();
            }
        });
        //获得所有的员工集合对象
        List<Employee> employeeList =  EmployeeFileUtil.readRecord();
        for(Employee emp:employeeList){
            if(emp.getEmpSalary()>7000){
                set.add(emp);
            }
        }
        return  set;
    }
}

//4. 测试类
public class EmpTest {

    //测试文件中记录读取到集合中
    @Test
    public void test1(){
      List<Employee> list =   EmployeeFileUtil.readRecord();
      for(Employee e:list){
          System.out.println(e);
      }

    }

    //测试根据部门分组
    @Test
    public void test2(){
        EmpOperation e = new EmpOperation();
        Map<String, List<Employee>> map = e.groupByDept();
        System.out.println(map); //也可以map.entrySet() 遍历
    }

    //测试根据薪资过滤
    @Test
    public void test3(){
        EmpOperation e = new EmpOperation();
        Set<Employee> set  = e.orderBySalary();
        for(Employee emp:set){
            System.out.println(emp);
        }

    }

}

//日期工具类
public class DateUtil {

    /**
     * 日期格式，年月日时分秒
     */
    public static final String PATTERN_YMDHMS ="yyyyMMdd";  

    /**
     * 字符串转换成日期对象
     * @param source    源字符表示的日期
     * @param dateParttern 日期转换格式
     * @return  返回日期对象
     */
    public static Date stringToDate(String source,String dateParttern){
        DateFormat df = new SimpleDateFormat(dateParttern);
        Date date =null;
        try {
            date = df.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  date;
    }

    /**
     * 日期转换成字符串
     * @param date  要转换的日期对象
     * @param dateParttern 日期转换格式
     * @return  返回字符换表示的日期
     */
    public static String dateToString(Date date,String dateParttern){
       DateFormat df =  new SimpleDateFormat(dateParttern);
       String dateStr = df.format(date);
        return dateStr;
    }
}
```


package com.chixing.day17_thread;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    反射 reflect

    给定类全名 class ,
    获得该类所有的组成结构（变量，方法，构造函数，接口）

    "com.chixing.day17_thread.Account"


    class Account {

        字段 Field (变量，属性)
        方法 Method
        构造函数 Constructor

   }



   Method

   public static | abstract | final void fun( int a,float y ) throws XXException,YYException {}



 */
public class ReflectDemo {

    public static void main(String[] args) {

     Class<Account> clazz =    Account.class;  // JVM 中的Account.class


      String className =   clazz.getName();
      System.out.println(className);   // 类限定名(包名.类名)

      Method[] methods =   clazz.getDeclaredMethods();

      for(Method m:methods){

          /* 方法名 */
          String methodName = m.getName();

          /* 修饰符 */
         int modifies =  m.getModifiers();

          /*返回值类型*/
          Class<?> returnType = m.getReturnType();

          System.out.print("方法名 :" + methodName  + ", 修饰符：" + modifies + "， 返回值类型：" + returnType);
          /* 参数列表*/

         Class<?>[] paramTypes=  m.getParameterTypes();
         for(Class c:paramTypes){
             System.out.print(" , 参数列表 :" + c  +", ");

         }


         Class<?>[] exceptions = m.getExceptionTypes();
         for(Class c:exceptions){
             System.out.print("异常 :" + c  +", ");
         }

          System.out.println();




         //根据方法名获得指定那个方法
          Class[] paramTypeArr = {int.class,String.class};
          Method method = null;
          try {
              method = clazz.getMethod("fun",paramTypeArr);
          } catch (NoSuchMethodException e) {
              e.printStackTrace();
          }

          Account account = new Account();
          Object[] args1 = {10,"hello"};
//          Object returnValue =  method.invoke(对象, 实参);
          Object returnValue = null;
          try {
              returnValue =   method.invoke(account, args1);
          } catch (IllegalAccessException e) {
              e.printStackTrace();
          } catch (InvocationTargetException e) {
              e.printStackTrace();
          }

System.out.println("fun 方法调用后的返回值：" + returnValue);

          /*
            Account account = new Account();
            float balance= account.depoist(10);
            int result =  account.fun();


           */



      }




    }
}

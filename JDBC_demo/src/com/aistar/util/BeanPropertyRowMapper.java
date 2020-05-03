package com.aistar.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class BeanPropertyRowMapper<T> implements RowMapper {
    private Class clazz;
    public BeanPropertyRowMapper(Class clazz){
        this.clazz = clazz;
    }

    @Override
    public T mapper(ResultSet rs) {
        T t = null;
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            //1. 获得一条行记录 rs.next()
            if (rs.next()) {

                //5. 反射 创建对象 ====> 无参构造函数
              t =   (T)  clazz.newInstance();


                //2. 获得表中列数 ResultSetMetaData  ( dept：3 emp:8 )
                int columnCount = metaData.getColumnCount();
                //3. 获得每列的值
                int index = 1;
                while (index <= columnCount) {
                    Object columnValue = rs.getObject(index); // 10
                    String columnName = metaData.getColumnName(index); //"deptno"

                    String setMethodName = columnCast2SetMethodName(columnName);// "setDeptno"
                     Method method =   getMethodByName(setMethodName);
                     if(method == null)
                         throw new NoSuchMethodException("there is no setter method for property  " +columnName );

                   method.invoke(t,columnValue);
                   index++;

                }
                //4. 获得每列列名 empno,ename,job,hiredate..

                //6. 反射 set 方法赋值 ===>set方法
            }
        }catch(SQLException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return t;
    }

    //deptno ----Deptno--> setDeptno
    private  String columnCast2SetMethodName(String columnName){ //deptno
        return "set" + (char) ( columnName.charAt(0) -32 ) + columnName.substring(1,columnName.length());
    }

  //根据方法名称，获得对应的方法对象Method
    private Method getMethodByName(String methodName){
        Method[] methodArr = clazz.getMethods();
        for(Method m :methodArr){
            if(m.getName().equals(methodName))
                return m;
        }
        return null;
    }



    public static void main(String[] args) {
        //System.out.println(columnCast2SetMethodName("deptno"));
    }


}

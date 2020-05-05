package com.chixing.day13_set_map;



import java.util.HashSet;
import java.util.Iterator;

/*
Set ： 元素不重复
    HashSet(无序的)         TreeSet（有序）




 */
public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> set1 =  new HashSet<>();
        set1.add("file");
        set1.add("code");
        set1.add("view");
        set1.add("code");
        set1.add("view");
        System.out.println(set1);

        // String 重写了equals hashcode方法

        HashSet<Integer> set2 =  new HashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(18);
        set2.add(7);
        set2.add(20);
        System.out.println(set2);
        //Integer 重写了equals hashcode方法

        HashSet<Student> set3 =  new HashSet<>();


        set3.add(new Student(101,"tom",20,'M'));
        set3.add(new Student(102,"tommy",23,'M'));
        set3.add(new Student(103,"tony",20,'M'));
        set3.add(new Student(104,"jack",22,'M'));


    //List,Set iterator  Iterator<E>

      //集合的遍历（迭代器 Iterator）
      Iterator<Student> it =  set3.iterator();
      while(it.hasNext()){
          Student stu = it.next();
          System.out.println(stu);
      }


      //foreach (底层原理是 Iterator)
      for(Student s:set3){
          System.out.println(s);
      }







    }



}

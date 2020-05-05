package com.chixing.day13_set_map;

import com.chixing.day06_inherited.Account;
import com.chixing.day09_interface.Student;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> strList =  new ArrayList<>();
        List<Account>  accountList =  new ArrayList<>();
        List<Student>  studentList =  new ArrayList<>();


        studentList.add(new Student(101,"tom",20,'M'));
        studentList.add(new Student(102,"tommy",23,'M'));
        studentList.add(new Student(103,"tony",20,'M'));
        studentList.add(new Student(104,"jack",22,'M'));

        //获得第3个学生
       Student stu =  studentList.get(2);
       stu.setStuAge(21);

    }
}

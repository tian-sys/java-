package com.chixing.day09_interface;

public class Student {
    private int stuNo;
    private String stuName;
    private int stuAge;
    private char stuGender;


    public Student(){}
    public Student(int stuNo, String stuName, int stuAge, char stuGender) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public char getStuGender() {
        return stuGender;
    }

    public void setStuGender(char stuGender) {
        this.stuGender = stuGender;
    }

    //重写Object.equals方法 【若两个Student对象 stuNo,stuName 相同，则为同一个Student对象】

    @Override
    public boolean equals(Object obj) {
        if(obj ==null)
            return false;
        if(obj == this)
            return true;
        if(obj.getClass() != this.getClass())
            return false;

        Student stu = (Student)obj;
        if(this.stuNo != stu.stuNo)
            return false;
        if(this.stuName.equals(stu.stuName))
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuGender=" + stuGender +
                '}';
    }
}

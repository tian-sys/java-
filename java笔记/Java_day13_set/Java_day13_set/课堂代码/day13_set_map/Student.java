package com.chixing.day13_set_map;

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

    //重写hashcode


    @Override
    public boolean equals(Object o) {
        System.out.println("equals...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (stuNo != student.stuNo) return false;
        return stuName.equals(student.stuName);  // tom tony
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode...");
        int result = stuNo;
        result = 31 * result + stuName.hashCode();
        return result;
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

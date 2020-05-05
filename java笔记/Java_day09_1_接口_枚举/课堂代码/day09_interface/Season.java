package com.chixing.day09_interface;

public class Season {


    public static final Season SPRING = new Season("春");
    public static final Season SUMMER = new Season("夏");
    public static final Season AUTUMN = new Season("秋");
    public static final Season WINTER = new Season("冬");

    private String name;

    private Season(String name) {
        this.name = name;
    }

    private Season(){}


    public String getName() {
        return name;
    }


}

package com.chixing.day09.exception;

public class FinallyReturn {
    public static void main(String[] args){
        Book book=  fun2();
        System.out.println("result = " + book.booName);
    }

    public static int fun1(){
        int a = 10;
        int b = 20;
        try{
            System.out.println("try ...");
            return a;
        }catch (ArithmeticException e){
            System.out.println("catch ...");
            e.printStackTrace();
            return b;
        }finally {
            a++;
            System.out.println("finally a =" + a);// a =11

        }
    }

    public static Book fun2(){
        Book book =  new Book("Java 学习");
        try{
            int a = 10/2;
            return book;
        }catch (ArithmeticException e){
            System.out.println("catch ...");
            return book;
        }finally {
            System.out.println("finally ...");
            book.booName ="Hadoop权威指南";
        }
    }
}


class Book{
    public String booName;

    public Book(String booName) {
        this.booName = booName;
    }
}


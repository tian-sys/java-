package com.chixing.day07_polymorphism;
/*
    int a = 10;
    int b = a;
    值传递：
        【基本数据类型】的赋值，复制了一份副本，现有变量值发生改变，原来值不受影响，不改变

    Student s2 = s1;
    defaultArray = newArray;
    地址传递：
       【引用数据类型】的赋值,指向同一块堆地址，即为同一个对象。所以现有对象修改了属性值，原来对象也一起发生修改（因为是同一个对象）
 */
public class DataTransfer {
    public  static void main(String[] args){

        DataTransfer dt = new DataTransfer();

        int a = 10;
        int b = 20;
        dt.fun1(a,b);
        System.out.println("a = " + a + ", b = " + b);


/*===============================================================*/

        Book book =  new Book("Java面向对象",100);
        dt.fun2(book);
        System.out.println("book name = " + book.getBookName() + ", price = " + book.getBookPrice());
    }

    public void fun2(Book book){
        book.setBookName("毛泽东选集");
        book.setBookPrice(99.9f);

    }

/*===============================================================*/


   public void fun1(int x,int y){ // int x = a ; int y = b 【将a 的值 复制了一个副本 10 给 x 】
        x = 100;
        y = 200;
   }




}


class Book{

    private String bookName;
    private float bookPrice;

    public Book(){}
    public Book(String bookName,float bookPrice){
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }
    //get,set方法省略

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }
}


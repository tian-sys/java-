package com.chixing.day12_boxing_generic_list;

/*
    泛型的作用：数据类型的安全性

    T
    E
 */
public class Point<T,E> {
    private T x;
    private E y;


    public Point(){}

    public Point(T x, E y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public E getY() {
        return y;
    }

    public void setY(E y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

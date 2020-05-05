package com.chixing.day12_boxing_generic_list;

import java.util.Arrays;

/**
 * 可扩容的容器
 */
public class MyContainer<T> {


    private Object[] defaultArray =null;

    public MyContainer(){
       this(10);
    }

    public MyContainer(int capacity){
        defaultArray = new Object[capacity];
    }


    private int size = 0;// 已有元素的个数


    /**
     * 添加新元素
     *  默认放在数组的尾部
     * @param ele 新元素
     */
    public void add(T ele){
        if(size >= defaultArray.length)//扩容
            defaultArray  =  Arrays.copyOf(defaultArray,defaultArray.length * 2 +1);
        defaultArray[size++] = ele;
    }


    /**
     * 添加新元素到指定位置上
     * @param ele 新元素
     * @param index 指定的位置，从0开始
     */
    public void add(T ele,int index){
        if(index <0 || index >= size)
            return;

        if(size <defaultArray.length) { //不需要扩容
            //(1)从index 开始下标的元素，依次往后移位
            System.arraycopy(defaultArray,index,defaultArray,index+1,size-index);
        }else{//需要扩容
            //(0) 创建新数组
            Object[] newArray =  new Object[defaultArray.length * 2 + 1];
            //(1)复制源数组前半部分
            System.arraycopy(defaultArray,0,newArray,0,index);
            //(2)复制元数据后半部分]
            System.arraycopy(defaultArray,index,newArray,index+1,size-index);
            defaultArray = newArray;
        }
        //(2)将新元素放在index位置上
        defaultArray[index] = ele;
        size++;
    }

    /**
     * 删除指定位置上的元素
     * @param index 指定的位置，从0开始
     */
    public void remove(int index){
        if(index <0 || index >= size)
            return;

        //创建新数组
        Object[] newArray = new Object[size-1];
        //复制源数组的前半部分
        System.arraycopy(defaultArray,0,newArray,0,index);
        //复制源数组的后半部分
        System.arraycopy(defaultArray,index+1,newArray,index,size-index-1);
        defaultArray = newArray;
        size--;
    }

    /**
     * 获得容器中已有元素的个数
     * @return  返回容器中已有元素的个数
     */
    public int size(){
        return size;
    }

    /**
     * 获得指定位置上的元素
     * @param index 指定位置下标
     * @return  返回指定位置上的元素
     */
    public T get(int index){
        if(index <0 || index >= size)  //抛异常
            throw new ArrayIndexOutOfBoundsException("数组下标已经越界");
        return (T)(defaultArray[index]);
    }




}

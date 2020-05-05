package com.chixing.day13_set_map;

public class Product implements  Comparable<Product>{
    private int proNo;  //商品编号
    private String proName; //商品名称
    private float proPrice;  //商品价格
    private  int proSaleCount;  //商品销量

    public Product(){}
    public Product(int proNo, String proName, float proPrice, int proSaleCount) {
        this.proNo = proNo;
        this.proName = proName;
        this.proPrice = proPrice;
        this.proSaleCount = proSaleCount;
    }

    public int getProNo() {
        return proNo;
    }

    public void setProNo(int proNo) {
        this.proNo = proNo;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public float getProPrice() {
        return proPrice;
    }

    public void setProPrice(float proPrice) {
        this.proPrice = proPrice;
    }

    public int getProSaleCount() {
        return proSaleCount;
    }

    public void setProSaleCount(int proSaleCount) {
        this.proSaleCount = proSaleCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proNo=" + proNo +
                ", proName='" + proName + '\'' +
                ", proPrice=" + proPrice +
                ", proSaleCount=" + proSaleCount +
                '}';
    }



    /*
        比较当前商品 与另一个商品的先后顺序，(按照价格排序，按照编号)
        若当前商品 < 另一个商品, 返回 -1
        若当前商品 > 另一个商品, 返回 1
        若当前商品 = 另一个商品，返回 0
     */
/*
    public int compare(Product anotherProduct){

       if(this.proPrice == anotherProduct.proPrice ){
           if ( this.proNo == anotherProduct.proNo )
               return 0;
           else
               return  ( this.proNo > anotherProduct.proNo )?1:-1;
       }else
           return (this.proPrice > anotherProduct.proPrice)?1:-1;

    }*/


 /*
        比较当前商品 与另一个商品的先后顺序，(按照销量排序，按照名称，按照编号)
        若当前商品 > 另一个商品, 返回 正整数 1
        若当前商品 < 另一个商品, 返回 负整数 -1
        若当前商品 = 另一个商品，返回 0
     */


    @Override
    public int compareTo(Product o) {
        if(this.proSaleCount != o.proSaleCount) //int
            return this.proSaleCount - o.proSaleCount;

        else if(this.proName.compareTo(o.proName) != 0)
            return this.proName.compareTo(o.proName);
        else
            return  this.proNo - o.proNo;
    }
}

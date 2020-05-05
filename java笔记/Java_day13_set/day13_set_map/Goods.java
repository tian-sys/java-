package com.chixing.day13_set_map;

public class Goods {
    private String brand; //品牌
    private String name; //产品名
    private double cost; // 费用

    public Goods(){}
    public Goods(String brand, String name, double cost) {
        this.brand = brand;
        this.name = name;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}

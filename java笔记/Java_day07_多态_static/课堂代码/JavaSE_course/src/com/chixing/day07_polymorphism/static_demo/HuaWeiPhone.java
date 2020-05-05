package com.chixing.day07_polymorphism.static_demo;

/**
 * 该类封装了华为手机属性与功能
 */
public class HuaWeiPhone {
    private String phoneBrand; //品牌名称
    private String phoneType; //型号
    private float phonePrice ;//价格
    private String phoneColor;//颜色

    public HuaWeiPhone(){}
    public HuaWeiPhone(String phoneBrand, String phoneType, float phonePrice, String phoneColor) {
        this.phoneBrand = phoneBrand;
        this.phoneType = phoneType;
        this.phonePrice = phonePrice;
        this.phoneColor = phoneColor;
    }

    //get,set
    //toString()
}

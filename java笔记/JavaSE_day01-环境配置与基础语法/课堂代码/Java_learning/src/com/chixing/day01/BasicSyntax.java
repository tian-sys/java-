package com.chixing.day01;


/**
 * Java基础语法
 * 1. 标识符 ： 字母、数字、下划线、$
 *  （1）包
 *  （2）类、接口：首字母必须大写，多个单词首字母必须大写，不允许数组开头
 *  （3）变量: 首字母小写，从第二个单词开始 每个单词首字母大写，不允许数组开头（驼峰式命名）
 *  （4）方法：首字母小写，从第二个单词开始 每个单词首字母大写，不允许数组开头（驼峰式命名）
 *  （5）常量：必须final 修饰，字母必须全部都大写，多个单词之间用下划线分隔
 *            常量值不能改变
 */
public class BasicSyntax {
    public static void main(String[] args){
        //变量
        int teacherAge = 20;
        String studentName ="Tom";

        teacherAge = 30;



        //常量：项目所在公司名称是固定的
        final String SUZHOU_COMPANY_NAME  = "苏州思必驰AI";
        //SUZHOU_COMPANY_NAME = "苏州大学";


    }

    //用户支付订单
    public void userPayOrder(){

    }




}

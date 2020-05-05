package com.chixing.day09_interface;
/*
接口：
    全局常量
    抽象方法
 */
public interface MockServiceApi {

        public static final String plat_name = "腾讯QQ平台";



        public String getPhoneCode(long telno);



         boolean qqLogin(long qq,String password);

}

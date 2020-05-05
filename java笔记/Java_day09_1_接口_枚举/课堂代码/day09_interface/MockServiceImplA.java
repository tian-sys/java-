package com.chixing.day09_interface;

public class MockServiceImplA implements MockServiceApi {
    @Override
    public String getPhoneCode(long telno) {
        return null;
    }

    @Override
    public boolean qqLogin(long qq, String password) {
        return false;
    }
}

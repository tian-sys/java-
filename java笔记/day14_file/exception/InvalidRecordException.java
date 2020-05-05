package com.chixing.day14_file.exception;

/**
 *交易记录异常类
 */
public class InvalidRecordException extends Exception{



    public InvalidRecordException(){}

    public InvalidRecordException(String message) {
       super(message);
    }
}

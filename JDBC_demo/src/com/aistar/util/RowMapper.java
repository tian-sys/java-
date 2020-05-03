package com.aistar.util;

import java.sql.ResultSet;


/**
 *将表中的行记录	映射成 Java 对象
 * @param <T>  POJO 类 类型
 */
public interface RowMapper<T> {
    public T mapper(ResultSet rs) ;
}

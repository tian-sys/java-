package com.chixing.day17_thread;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapHashtableDemo {
    public static void main(String[] args) {

        HashMap<String,String> map =   new HashMap<>();
        map.put("a","A");
        map.put(null,"B");
        map.put("c",null);
        map.remove("a");


        Hashtable<String,String> table =   new Hashtable<>();
        table.put("a","A");  // Hashtable.put synchronized
//      table.put(null,"B");   NullPointerException Hashtable 的key 不能为null
//      table.put("c",null);   NullPointerException Hashtable 的value 不能为null
        table.remove("a"); // Hashtable.remove synchronized


    }
}

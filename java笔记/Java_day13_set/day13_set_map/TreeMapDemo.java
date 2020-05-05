package com.chixing.day13_set_map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {


    public static void main(String[] args) {


        /*
            TreeMap<Key,Value>
                Key 进行排序
                    （1）自然顺序
                    (2) 自定义排序规则
         */
        Map<String ,String> map =  new TreeMap<>();
        map.put("中国","汉语");
        map.put("韩国","思密达");
        map.put("日本","空你齐瓦");
        map.put("泰国","萨瓦迪卡");
        map.put("英国","Hello");
        map.put("英国","GoodMorning");

        //String implements Comparabale<String>

        System.out.println(map);

        //Key : TreeSet<E> -- TreeMap<Key,Value>
        Map<Product ,String> map2 =  new TreeMap<>();

        Map<Product,String> map3 =   new TreeMap<>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return 0;
            }
        });

    }
}


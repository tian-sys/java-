package com.chixing.day13_set_map;

import java.util.*;

public class MapDemo {
/*
    Map<Key,Value>
    Key: 唯一的

    中国-汉语
    韩国-思密达
    日语-空你齐瓦
    泰语-萨瓦迪卡

    HashMap<Key,Value>
    TreeMap


 */
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("中国","汉语");
        map.put("韩国","思密达");
        map.put("日本","空你齐瓦");
        map.put("泰国","萨瓦迪卡");
        map.put("英国","Hello");
        map.put("英国","GoodMorning");

        System.out.println(map);

        //1. 获得 "日本"对应的值
       String value1 =  map.get("日本");

        //2. 判断key 泰国是否存在
        map.containsKey("泰国");

        //3. 删除"韩国"对应的键值对
        map.remove("韩国");

        //4. 将泰国的值替换为"泰语"
        map.replace("泰国","泰语");

        //5. 获得所有的value值
        Collection<String> values = map.values();

        //6. 获得所有的key值
       Set<String> keys=  map.keySet();


       //7. 遍历获得每一个键值对
       Set<Map.Entry<String,String>> entrySet =  map.entrySet();
        Iterator<Map.Entry<String,String>> it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            String key =  entry.getKey();
            String value =  entry.getValue();
            System.out.println("key:" + key + ", value :" + value);
        }



    }
}

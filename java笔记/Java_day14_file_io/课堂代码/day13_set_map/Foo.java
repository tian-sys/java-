package com.chixing.day13_set_map;

import java.util.*;

public class Foo {
    private  String code;
    private String name;

    public Foo(){}
    public Foo(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {
        //List
        List<Foo> list1 = new ArrayList<>();
        list1.add(new Foo("测试1","test a"));
        list1.add(new Foo("测试1","test c"));
        list1.add(new Foo("测试3","test d"));
        list1.add(new Foo("测试3","test e"));
        list1.add(new Foo("测试2","test b"));
        list1.add(new Foo("测试4","test f"));


        //List --Map

        Map<String,List<Foo>> map = new HashMap<>();

        Iterator<Foo> it =  list1.iterator();
        while(it.hasNext()){

            Foo foo = it.next();
            List<Foo> fooList = null;
             if(!map.containsKey(foo.getCode())) {
                 fooList =   new ArrayList<>();
                 map.put(foo.getCode(),fooList );
             }else{
                 fooList = map.get(foo.getCode());
             }
            fooList.add(foo);
        }

        // 输出键值对
      Set<Map.Entry<String,List<Foo>>> set =  map.entrySet();
        Iterator<Map.Entry<String,List<Foo>>> setIt = set.iterator();
        while(setIt.hasNext()){
            Map.Entry<String,List<Foo>> entry = setIt.next();
           String key =  entry.getKey();
           List<Foo> list =   entry.getValue();
           System.out.println(key + ":" + list);
        }



        HashSet s;







    }
}

package com.chixing.day12_boxing_generic_list;


import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {

        // 应用


        ArrayList<String> list = new ArrayList<>();

        //1. 添加5个字符串元素
        list.add("edit");
        list.add("file");
        list.add("build");
        list.add("window");
        list.add("help");
        list.add("file");

        System.out.println(list);
        //2. 在第4个位置上添加"code"
        list.add(3,"code");

        //3. 获得第3个元素
        String ele1 = list.get(2);

        //4. 移除第4个元素
        list.remove(3);

        //5. 移除"file"
        list.remove("file");

        //6. 获得"hello" 所在集合的位置
        int index = list.indexOf("hello");

        //7. 集合中是否包含"good"
        boolean r1 = list.contains("good");

        //8. 将第2个位置上的值替换为"tools"

        list.set(1,"tools");

        //9. 获得集合中元素个数
        int size =  list.size();

        //10. 清空该集合中所有元素
        list.clear();


        new LinkedList<>();

    }
}

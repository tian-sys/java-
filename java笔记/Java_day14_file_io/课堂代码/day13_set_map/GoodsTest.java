package com.chixing.day13_set_map;

import java.util.*;

public class GoodsTest {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();
        Goods p1 = new Goods("宝洁","洗手粉",18.5);
        Goods p2 = new Goods("联合利华","肥皂",4.5);
        Goods p3 = new Goods("宝洁","牙膏",32.5);
        Goods p4 = new Goods("宝洁","毛巾",14.5);
        Goods p5 = new Goods("洁利","洗面奶",26.0);
        Goods p6 = new Goods("好迪","洗发水",27.5);
        Goods p7 = new Goods("洁利","沐浴露",38.5);
        Goods p8 = new Goods("宝洁","洗洁精",3.4);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);

         /*1. 统计出各类产品的列表

            Map<String,List<Product>>

            "宝洁",{p1,p3,p4,p8}
            "联合利华",{p2}
            "洁利",{p5,p7}
         	"好迪",{p6}

         */
        Map<String,List<Goods>> map = new HashMap<>();

        Iterator<Goods> it =  list.iterator();
        while(it.hasNext()){
            Goods goods = it.next();
            //没有该品牌 brand,需要创建List 添加该商品
            if(!map.containsKey(goods.getBrand())){
                List<Goods> goodsList = new ArrayList<>();
                goodsList.add(goods);
                map.put(goods.getBrand(),goodsList);
            }else{ //该品牌已经有了 ，则只需要将新商品添加到已有对应的list后面
                map.get(goods.getBrand()).add(goods);
            }
        }

        /*2. 统计出各类产品的价格总和*/

        //Map<品牌名称,总价>
        Map<String,Double> map2 = new HashMap<>();

        Set<Map.Entry<String,List<Goods>>> set = map.entrySet();
        Iterator<Map.Entry<String,List<Goods>>> setIt =  set.iterator();

    /*
        "宝洁",{p1,p3,p4,p8}
        "联合利华",{p2}
        "洁利",{p5,p7}
        "好迪",{p6}
        */

        while(setIt.hasNext()){
             Map.Entry<String,List<Goods>> entry =   setIt.next();
             String brand = entry.getKey();
            List<Goods> goodsList =  entry.getValue();
            double sum = 0;
            for(Goods g:goodsList){
                sum += g.getCost();
            }

            map2.put(brand,sum);

        }


    }
}

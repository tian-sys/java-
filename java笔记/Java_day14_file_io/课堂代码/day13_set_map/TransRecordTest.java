package com.chixing.day13_set_map;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TransRecordTest {


    private static List<TransRecord> recordList = null;
    /**
     * 初始化交易记录
     * @return
     */
    public static List<TransRecord> init(){
        recordList = new ArrayList<>();

        TransRecord t1 =new TransRecord("000001","刘德华","0000",1,"4155990188888888",DateUtil.string2Date("20060720200005",DateUtil.DATE_PATTERN_YMDHMS),300.00f);
        TransRecord t2 = new TransRecord("000201","晓龙","0002",1,"4155990199999999",DateUtil.string2Date("20060720200005",DateUtil.DATE_PATTERN_YMDHMS),500.00f);
        TransRecord t3 = new TransRecord("000101","张东健","0012",1,"4155990100000000",DateUtil.string2Date("20060720200005",DateUtil.DATE_PATTERN_YMDHMS),1000.50f);
        TransRecord t4 = new TransRecord("000101","张东健","0012",1,"4155990155555555",DateUtil.string2Date("20060720200005",DateUtil.DATE_PATTERN_YMDHMS),600.99f);
        TransRecord t5 = new TransRecord("000301","梁朝伟","0013",0,"4155990111111111",DateUtil.string2Date("20060722201005",DateUtil.DATE_PATTERN_YMDHMS),5000.00f);
        TransRecord t6 = new TransRecord("000001","刘德华","0000",1,"4155990188888888",DateUtil.string2Date("20060725200005",DateUtil.DATE_PATTERN_YMDHMS),200.00f);
        recordList.add(t1);
        recordList.add(t2);
        recordList.add(t3);
        recordList.add(t4);
        recordList.add(t5);
        recordList.add(t6);
        return recordList;
    }

    /**
     * 按客户号查询记录
     * @param customerNumber - 客户号
     * @return 符合条件的记录集合或null
     */
    public List<TransRecord> findByCustomerNumber(String customerNumber){ //"000001"
        List<TransRecord> list = new ArrayList<>();


        Iterator<TransRecord> it = recordList.iterator();
        while(it.hasNext()){
            TransRecord record = it.next();
            if(record.getCustomerNumber() .equals(customerNumber))
                list.add(record);
        }

        return list;
    }

    /**
     * 按日期段查询记录
     * @param startDateStr - 开始日期
     * @param endDateStr - 结束日期
     * @return 符合条件的记录数组或null
     */
    public List<TransRecord>  findByDate(String startDateStr, String endDateStr){ // 20060720200005   20060730200005
        List<TransRecord> list = new ArrayList<>();

        Date startDate = DateUtil.string2Date(startDateStr,DateUtil.DATE_PATTERN_YMDHMS);
        Date endDate = DateUtil.string2Date(endDateStr,DateUtil.DATE_PATTERN_YMDHMS);

        Iterator<TransRecord> it = recordList.iterator();
        while(it.hasNext()){
            TransRecord record = it.next();

            if(record.getTransDate() .compareTo(startDate) >=0  && record.getTransDate() .compareTo(endDate) <=0  )
                list.add(record);

        }


        return list;
    }

    /**
     * 取得总金额
     * @return 总金额
     */
    public BigDecimal totalAmount(){
        BigDecimal sum = new BigDecimal(0);
        Iterator<TransRecord> it = recordList.iterator();

        while(it.hasNext()){
            TransRecord record = it.next();
             sum = sum.add( new BigDecimal(record.getTransMoney()));

        }

        return sum;
    }

    public static void main(String[] args) {

    }
}

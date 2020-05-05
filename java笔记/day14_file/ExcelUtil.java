package com.chixing.day14_file;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.util.List;

public class ExcelUtil {

    //excel 文件导入
    public static void import2Excel(List<TransRecord> recordList, String filepath){


        HSSFWorkbook workbook =    new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("transRecord sheet");

        //第一行标题
        HSSFRow tilteRow = sheet.createRow(0);
        tilteRow.createCell(0).setCellValue("账户编号");
        tilteRow.createCell(1).setCellValue("账户姓名");
        tilteRow.createCell(2).setCellValue("机构编号");
        tilteRow.createCell(3).setCellValue("用户性别");
        tilteRow.createCell(4).setCellValue("交易编号");
        tilteRow.createCell(5).setCellValue("交易日期");
        tilteRow.createCell(6).setCellValue("交易金额");


        //数据行
        for(int i= 0;i<recordList.size();i++){
            TransRecord record = recordList.get(i);
            HSSFRow row = sheet.createRow(i+1);
            row.createCell(0).setCellValue(record.getCustomerNumber());
            row.createCell(1).setCellValue(record.getCustomerName());
            row.createCell(2).setCellValue(record.getOrgNo());
            row.createCell(3).setCellValue(record.getCustomerGendedr()==0?"男":"女");// 0 男性， 1 女性
            row.createCell(4).setCellValue(record.getTransAccountNo());

            String date = DateUtil.date2String(record.getTransDate(),DateUtil.DATE_PATTERN_YMDHMS2);

            row.createCell(5).setCellValue(date);
            row.createCell(6).setCellValue(record.getTransMoney());
        }

        OutputStream os = null;
        try {
            os = new FileOutputStream(new File(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            workbook.write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(workbook!=null) {
                try {
                    workbook.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
    //excel 文件导出

}

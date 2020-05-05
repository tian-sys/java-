package com.chixing.day14_file;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *  该类是文件的工具类
 *  提供了文件夹、文件创建，文件查询，文件复制，上传，下载等操作
 */
public class FileUtil {


    /**
     * 文件复制
     * @param srcFilepath   源文件的路径
     * @param destFilePath  需要被复制到的路径
     * @return  返回源文件的副本文件（即复制后的新文件）
     */
    public static File copyFile(String srcFilepath, String destFilePath){
        return null;
    }


    /**
     * 文件复制
     * @param srcFile   源文件对象
     * @param destFilePath  需要被复制到的路径
     * @return  返回源文件的副本文件（即复制后的新文件）
     */
    public static File copyFile(File srcFile, String destFilePath){
        return null;
    }
    private static List<File> list = new ArrayList<>();

    /**
     * 在指定目录中查询某个文件
     * @param pathname 指定的目录
     * @param filename  要查询的文件名
     * @return  返回指定目录中查询某个文件
     */
    public static List<File> searchFile(String pathname, String filename){
        File file =  new File(pathname);

       File[] subFiles = file.listFiles();
       for(File f: subFiles){
           if(f.isFile()){
               if(f.getName().contains(filename) )
                   list.add(f);
           }else{
               searchFile(f.getAbsolutePath(),filename);
           }
       }

        return list;
    }




}

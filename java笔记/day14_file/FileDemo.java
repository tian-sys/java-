package com.chixing.day14_file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*

    1. 在 d:创建文件夹 myfile   mkdir(..)
    2. 在  myfile文件夹中创建文件 hello.txt  createNewFile()
    3. 在  myfile文件夹中创建文件 java.txt
    4. 判断 myfile是不是文件夹
    5. 判断 hello.txt 是不是文件
    6. 获得 hello.txt文件对象的全路径
    7. 获得 hello.txt文件对象的父文件夹对象
    8. 获得文件夹 myfile下所有的文件对象，输出文件名
    9. 删除文件java.txt
    10.删除文件夹myfile
 */
public class FileDemo {
    public static void main(String[] args) {
        File file1 = new File("D:\\myfile");
        file1.mkdir();

        File file2 = new File("D:\\myfile\\hello.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file3 = new File("D:\\myfile\\java.txt");
        try {
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file1.isDirectory();
        file2.isFile();

        String file1Name = file1.getName();
        System.out.println("file1Name :" + file1Name);

        String file2Name = file2.getName();
        System.out.println("file2Name :" + file2Name);

        String absPath = file2.getAbsolutePath();
        System.out.println("file2 绝对路径 :" + absPath);

        String parentPath = file2.getParent();
        File parentFile = file2.getParentFile();
        System.out.println("file2 父文件路径 :" + parentPath);
        System.out.println("file2 父文件对象 :" + parentFile);

        File[] subFiles = file1.listFiles();


        file1.delete();


        //
    System.out.println("separator:" + File.separator);  //     \
    System.out.println("separator char:" + File.separatorChar);
    System.out.println("pathSeparator:" + File.pathSeparator);
    System.out.println("pathSeparatorChar:" + File.pathSeparatorChar);






        // 获得某一个路径下面所有的子文件
        System.out.println("===================== 获得某一个路径下面所有的子文件=================");

        // "C:\\Program Files\\Microsoft Office\\Document Themes 16"
        listFiles =  getSubFiles("C:" + File.separator+"Program Files"+File.separator +"Microsoft Office"+File.separator +"Document Themes 16");
        for(File f:listFiles){
            System.out.println(f.toString());
        }






    }

public static List<File> listFiles = new ArrayList<>();
    /**
     *  获得某一个路径下面所有的子文件
     * @param pathname 指定文件对象
     * @return  返回该目录下的所有文件
     */
    public static List<File> getSubFiles(String pathname){  //  D:\\JavaCourse
        File file =   new File(pathname);
        if(file.isFile()) {
            listFiles.add(file);
        }else{
            File[] subFiles = file.listFiles();
            for(File f: subFiles){
                if(f.isFile())
                    listFiles.add(f);
                else
                    getSubFiles(f.getAbsolutePath());
            }
        }



           return listFiles;
    }



    // C:\Program Files\Microsoft Office\Document Themes 16 查询指定文件


}

# File

#### 1. File 是文件和路径目录的表示（即文件夹与文件的类型）

#### 2. 构造函数与常用API

```java
File(String pathname) 
通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。 

boolean createNewFile() 
当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。 

boolean delete() 
删除由此抽象路径名表示的文件或目录。  

boolean exists() 
测试此抽象路径名表示的文件或目录是否存在 

File getAbsoluteFile() 
返回此抽象路径名的绝对形式。  
String getAbsolutePath() 
返回此抽象路径名的绝对路径名字符串。  


String getName() 
返回由此抽象路径名表示的文件或目录的名称。  
String getParent() 
返回此抽象路径名的父 null的路径名字符串，如果此路径名未命名为父目录，则返回null。  
File getParentFile() 
返回此抽象路径名的父，或抽象路径名 null如果此路径名没有指定父目录。  
String getPath() 
将此抽象路径名转换为路径名字符串。 

boolean isDirectory() 
测试此抽象路径名表示的文件是否为目录。  
boolean isFile() 
测试此抽象路径名表示的文件是否为普通文件。 

long length() 
返回由此抽象路径名表示的文件的长度。  
String[] list() 
返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。  

File[] listFiles() 
返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。  

boolean mkdir() 
创建由此抽象路径名命名的目录。  
boolean mkdirs() 
创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。 

```

#### 3. 文件目录的分隔符

```java
//文件目录的分隔符
System.out.println("File.separator:" + File.separator); //   \
System.out.println("File.separatorChar:" + File.separatorChar);   //  \
```

#### 4. 文件操作工具类

```java
/**
 * 文件操作工具类
 */
public class FileUtils {
    public static  ArrayList<File> subFilelist = new  ArrayList<>();//所有的子文件的集合
    public static  ArrayList<File> sameFileNameList = new  ArrayList<>();    //指定文件名称的所有文件的集合

    /**
     * 获得所有的子文件
     * @param pathname  指定要遍历的目录
     * @return  返回该目录下所有的子文件对象集合
     */
    public static ArrayList<File> getAllFiles(String pathname){

        File file =  new File(pathname);
        File[] subFiles =  file.listFiles();
        for(int i=0;i<subFiles.length;i++){
            File subFile = subFiles[i];
            if(subFile.isFile())
                subFilelist.add(subFile);//集合
            else
                getAllFiles(subFile.getAbsolutePath());
        }
        return subFilelist;
    }

    /**
     * 在指定目录下，查询指定名称的文件
     * @param pathname
     * @param fileName
     * @return
     */
    public static ArrayList<File>  getFile(String pathname,String fileName){
        File file =  new File(pathname);
        File[] subFiles =  file.listFiles();
        for(int i=0;i<subFiles.length;i++){
            File subFile = subFiles[i];
            if(subFile.isFile() && subFile.getName().contains(fileName))
                sameFileNameList.add(subFile);//集合
            else
                getFile(subFile.getAbsolutePath(),fileName);
        }
        return sameFileNameList;
    }

}
```
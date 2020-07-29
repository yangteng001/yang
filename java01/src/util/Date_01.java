package util;

import java.io.File;
import java.util.Date;

public class Date_01 {
    public static  void main(String[] args){
        /*Date date = new Date(1607616000000L);
        System.out.println(date);*/
       /* int a=12;//基本数据类型
        Integer b=15;//包装类型
       // Integer it=new Integer(12);
        double c=a;
        System.out.println(c);*/
       String s="18-22-40-65";
       String regex="-";
       String[] result=s.split(regex);
       for(int i=0;i<result.length;i++){
           String a=result[i];
           int d=Integer.parseInt(a);
           System.out.println(d);
       }
        String pathName = "e:\\java_code\\day22e\\hello.java";
        File f1 = new File(pathName);//将Test22文件封装成File对象。注意；有可以封装不存在文件或者文件夹，变成对象。
        System.out.println(f1);
        File f2 = new File("e:\\java_code\\day22e","hello.java");
        System.out.println(f2);
    }
}

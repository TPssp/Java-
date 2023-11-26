package TEN;

import java.io.*;

public class ObjectSer {
    public static void main(String[] args){
        Student stu1=new Student(1,"zhangsan",18,"cs");
        Student stu2=new Student(2,"lisi",19,"cs");
        Student stu3=new Student(3,"wangwu",20,"cs");
        try{
            FileOutputStream fo=new FileOutputStream("TEST2.txt");
            ObjectOutputStream so=new ObjectOutputStream(fo);
            so.writeObject(stu1);
            so.writeObject(stu2);
            so.writeObject(stu3);
            so.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

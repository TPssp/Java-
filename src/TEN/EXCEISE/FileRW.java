package TEN.EXCEISE;

import java.io.*;

public class FileRW {
    public static void addBooks(String fileName) {
        try{
            FileOutputStream fos=new FileOutputStream(fileName);
            DataOutputStream out=new DataOutputStream(fos);
            out.writeInt(151110101);
            out.writeUTF("张三");
            out.writeInt(21);
            out.writeDouble(80.5);

            out.writeInt(151110102);
            out.writeUTF("李四");
            out.writeInt(21);
            out.writeDouble(83.0);

            out.writeInt(151110103);
            out.writeUTF("王五");
            out.writeInt(22);
            out.writeDouble(95.6);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public static void getBooks(String fileName){
        try{
            FileInputStream fis=new FileInputStream(fileName);
            DataInputStream in=new DataInputStream(fis);

            while(in.available()>0){
                int id=in.readInt();
                String name=in.readUTF();
                int age = in.readInt();
                double averageScore = in.readDouble();
                System.out.println("学号: " + id + " 姓名: " + name + " 年龄: " + age + " 平均成绩: " + averageScore);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        String fileName = "student_info.txt";

        // 写入学生信息
        addBooks(fileName);

        // 从文件中读取并输出学生信息
        getBooks(fileName);
    }
}

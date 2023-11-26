package EX_A;

import java.io.*;

public class FileIO {
    public void addBooks(String fileName){
        try{
            FileOutputStream fos=new FileOutputStream(fileName);
            DataOutputStream dout=new DataOutputStream(fos);
            String name;
            int id;
            int age;
            double score;

            id=151110101;
            dout.writeInt(id);
            name="张三";
            dout.writeUTF(name);
            age=21;
            dout.writeInt(age);
            score=80.5;
            dout.writeDouble(score);

            id=151110102;
            dout.writeInt(id);
            name="李四";
            dout.writeUTF(name);
            age=22;
            dout.writeInt(age);
            score=85.5;
            dout.writeDouble(score);

            fos.close();
            dout.close();

        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public void getBooks(String fileName){
        try{
            FileInputStream fis=new FileInputStream(fileName);
            DataInputStream din=new DataInputStream(fis);
            String name;
            int id;
            double score;
            int age;
            while(din.available()>0){
                id= din.readInt();
                name= din.readUTF();
                age=din.readInt();
                score=din.readDouble();
                System.out.println("id="+id+",name="+name+",age="+age+"score="+score);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        FileIO file=new FileIO();
        file.addBooks("EX_A.txt");
        file.getBooks("EX_A.txt");
    }
}

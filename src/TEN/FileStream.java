package TEN;
import java.io.*;
public class FileStream {


    public static void inputStream1(String filename){
        try{
            FileInputStream fis=new FileInputStream(filename);
            int c;
            int i=0;
            while((c=fis.read())!=-1){
                i++;
                System.out.print((char)c);
            }
            System.out.println();
            System.out.println("文件字节数"+i);
            fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            System.err.println("发生异常"+e);
            e.printStackTrace();
        }
    }
    public static void outputStream1(String str,String filename){
        byte[] b=str.getBytes();
        try{
            FileOutputStream fos=new FileOutputStream(filename);
            fos.write(b);
            fos.flush();
            System.out.println("文件字节数："+b.length);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        FileStream.outputStream1("Java程序设计","TXT.txt");

        try{
            FileInputStream in=new FileInputStream("TXT.txt");
            FileOutputStream out=new FileOutputStream("TEST.txt");

            int c;
            while((c=in.read())!=-1){
                out.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }


}

package TEN;

import java.io.*;

public class FileToUnicode {
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("writer.txt");
        InputStreamReader dis=new InputStreamReader(fis,"UTF-8");
        BufferedReader reader=new BufferedReader(dis);
        String s;
        while ((s=reader.readLine())!=null){
            System.out.println("read:"+s);
        }
        dis.close();
    }
}

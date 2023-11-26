package TEN;
import java.io.*;
public class FileReaderDemo {
    public static void main(String[] args) {
        try{
            FileReader reader=new FileReader("my1.txt");
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

package TEN;
import java.io.*;
public class FileWriterDemo {
    public static void main(String[] args) throws IOException{
        FileWriter writer=new FileWriter("my1.txt");
        writer.write('软');
        char[] cbuf={'件','工','程'};
        writer.write(cbuf);
        String str="Java程序设计";
        writer.write(str);
        writer.close();
    }
}

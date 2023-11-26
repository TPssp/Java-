package TEN;
import java.io.*;
public class WriterDemo {
    public static void main(String[] args)throws Exception{
        FileOutputStream fos=new FileOutputStream("writer.txt");
        OutputStreamWriter dis=new OutputStreamWriter(fos);
        BufferedWriter writer=new BufferedWriter(dis);
        writer.write("姓名：刘知远");
        writer.newLine();
        writer.write("专业：软件工程");
        writer.newLine();
        writer.close();
    }
}

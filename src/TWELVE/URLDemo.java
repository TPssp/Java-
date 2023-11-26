package TWELVE;

import java.io.IOException;
import java.net.*;

public class URLDemo {
    public static void main(String[] args)throws IOException{
        URL url=new URL("http://hitwh.edu.cn/");
        System.out.println("url="+url);
        System.out.println("Protocol="+url.getProtocol());
        System.out.println("Host="+url.getHost());
        System.out.println("Port="+url.getPort());
        System.out.println("File="+url.getFile());
        System.out.println("Path="+url.getPath());
        System.out.println("Ref="+url.getRef());



    }
}

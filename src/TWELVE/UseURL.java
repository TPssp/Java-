package TWELVE;
import java.io.*;
import java.net.*;
public class UseURL {
    public static void main(String[] args){
        try{
            URL url=new URL("http://www.hitwh.edu.cn/");
            InputStreamReader isr=new InputStreamReader(url.openStream(),"utf-8");
            BufferedReader br=new BufferedReader(isr);
            String readStr;
            while((readStr=br.readLine())!=null){
                System.out.println(readStr);
            }
            br.close();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

package TWELVE;
import java.io.*;
import java.net.*;
public class SocketClient {
    Socket socket;
    InputStream in;
    OutputStream out;
    DataInputStream din;
    DataOutputStream dout;
    public SocketClient(){
        try{
            socket=new Socket("10.241.203.226",10000);
            in=socket.getInputStream();
            out=socket.getOutputStream();
            din=new DataInputStream(in);
            dout=new DataOutputStream(out);
            din.readUTF();
            System.out.println("服务器说："+din.readUTF());
            dout.writeUTF("张三");
            dout.writeUTF("计算机系");
            in.close();
            out.close();
            din.close();
            dout.close();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        SocketClient socketClient=new SocketClient();
    }
}

package TWELVE;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    ServerSocket ss=null;
    Socket socket;
    InputStream in;
    OutputStream out;
    DataInputStream din;
    DataOutputStream dout;
    public SocketServer(){
        try{
            InetAddress ir=null;
            ir=InetAddress.getLocalHost();
            System.out.println(ir.getHostAddress());
            ss=new ServerSocket(10000);
            System.out.println("等待连接...");
            socket=ss.accept();
            System.out.println("连接成功");
            in=socket.getInputStream();
            out=socket.getOutputStream();
            din=new DataInputStream(in);
            dout=new DataOutputStream(out);
            dout.writeUTF("你好，我是服务器");
            String name=din.readUTF();
            String department=din.readUTF();
            System.out.println("姓名："+name);
            System.out.println("部门："+department);
            in.close();
            out.close();
            din.close();
            dout.close();
            socket.close();
            ss.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        SocketServer socketServer=new SocketServer();
    }
}

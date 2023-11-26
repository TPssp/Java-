package EX_A;

import java.io.*;
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
            ss=new ServerSocket(5432);
            socket=ss.accept();
            in=socket.getInputStream();
            out=socket.getOutputStream();
            din=new DataInputStream(in);
            dout=new DataOutputStream(out);
            int length=din.readInt();
            double[] a=new double[length];
            for(int i=0;i<length;i++){
                a[i]= din.readInt();
            }
            double sum=0;
            for(int i=0;i<length;i++){
                sum+=a[i];
            }
            dout.writeDouble(sum);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

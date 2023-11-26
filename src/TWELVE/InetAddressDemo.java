package TWELVE;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args){
        InetAddress ia1=null;
        InetAddress ia2=null;
        InetAddress[] ia3=null;
        try {
            ia1=InetAddress.getByName("www.163.com");
            ia2=InetAddress.getLocalHost();
            ia3=InetAddress.getAllByName("www.sina.com");
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
        System.out.println(ia1.getHostName()+ia1.getHostAddress());
        System.out.println(ia2.getHostName()+ia2.getHostAddress());
        for(int i=0;i<ia3.length;i++){
            System.out.println(ia3[i].getHostName()+ia3[i].getHostAddress());
        }
    }
}

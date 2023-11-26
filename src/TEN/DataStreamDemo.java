package TEN;
import FIVE.Data;

import java.io.*;
public class DataStreamDemo {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos=new FileOutputStream("TEST1.txt");
        DataOutputStream out=new DataOutputStream(fos);
        //DataOutputStream out=new DataOutputStream(new FilterOutputStream("TEST1.txt"));
        double[] prices={123,156,456,4.5};
        int[] units={12,564,123,58};
        String[] descs={"das","daswx","dawd","dawd"};
        for(int i=0;i<prices.length;i++){
            out.writeDouble(prices[i]);
            out.writeInt(units[i]);
            out.writeUTF(descs[i]);
        }

        out.close();
        DataInputStream in=new DataInputStream(new FileInputStream("TEST1.txt"));
        double price;
        int unit;
        String desc;
        double total=0;
        try {
            while (in.available()>0){
                price=in.readDouble();
                unit=in.readInt();
                desc=in.readUTF();
                System.out.println("你购买了"+unit+"个"+desc+"，单价为"+price);
                total+=unit*price;
                System.out.println("总价为："+total);
            }
        }catch (EOFException e){
            e.printStackTrace();
        }
        in.close();
    }
}

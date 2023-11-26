package ELEVEN;
import java.lang.*;
public class Mythread1 {
    static Thread threadobjA;
    static Thread threadobjB;
    public static void main(String[] args){
        Runnable targetA=new ThreadInterfaceImplA();
        Runnable targetB=new ThreadInterfaceImplB();

        threadobjA=new Thread(targetA);
        threadobjB=new Thread(targetB);

        threadobjA.start();
        threadobjB.start();
    }
}


package ELEVEN;

import java.util.ArrayList;
import java.util.List;

public class ThreadSynch implements Runnable{
    static List<String> list=new ArrayList<String>();
    public synchronized void add() throws InterruptedException{
        String name=Thread.currentThread().getName();
        for(int i=0;i<5;i++){
            list.add(name);
            Thread.sleep(200);
        }
    }
    public void run(){
        try{
            add();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

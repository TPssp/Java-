package ELEVEN;

public class myThread {
    static ThreadClass1 threadClass1;
    static ThreadClass2 threadClass2;
    public static void main(String[] args){
        threadClass1=new ThreadClass1();
        threadClass2=new ThreadClass2();
        threadClass1.start();
        threadClass2.start();
    }
}

class ThreadClass1 extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("You are students");
            try{
                sleep(300);
            }catch (InterruptedException e){}
        }
    }
}
class ThreadClass2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("I'm a teacher");
            try{
                sleep(500);
            }catch (InterruptedException e){}
        }
    }
}
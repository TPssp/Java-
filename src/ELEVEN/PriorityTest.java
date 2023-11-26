package ELEVEN;

public class PriorityTest {
    public static void main(String[] args){
        Thread one=new WorkThread("线程1",Thread.NORM_PRIORITY);
        Thread two=new WorkThread("线程2",4);
        Thread three=new WorkThread("线程3",8);
        Thread four=new WorkThread("线程4",Thread.NORM_PRIORITY);
        one.start();
        two.start();
        three.start();
        four.start();
    }
}

class WorkThread extends Thread{
    private String name;
    public WorkThread(String name,int priority){
        this.name=name;
        if(priority>10||priority<=0){
            System.out.println("1-10之间！");
            this.setPriority(NORM_PRIORITY);
        }else {
            this.setPriority(priority);
        }
    }
    public void run(){
        System.out.println(name+"的优先级为"+this.getPriority());
        for(int i=0;i<5;i++){
            System.out.println(name+"正在打印"+i);
        }
    }
}

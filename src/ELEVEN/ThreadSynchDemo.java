package ELEVEN;

public class ThreadSynchDemo {
    public static void main(String[] args) throws InterruptedException{
        ThreadSynch t1=new ThreadSynch();
        ThreadSynch t2=new ThreadSynch();
        ThreadSynch t3=new ThreadSynch();
        Thread ta=new Thread(t1,"A");
        Thread tb=new Thread(t2,"B");
        Thread tc=new Thread(t2,"C");
        ta.start();
        tb.start();
        tc.start();

        ta.join();
        tb.join();
        tc.join();
        System.out.println(ThreadSynch.list.size()); // 检查总元素数
        System.out.println(ThreadSynch.list);

    }
}

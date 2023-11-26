package ELEVEN;

public class ThreadInterfaceImplA implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("You are students");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
    }
}

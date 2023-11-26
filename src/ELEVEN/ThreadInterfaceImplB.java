package ELEVEN;

public class ThreadInterfaceImplB implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I'm a teacher");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

package FIVE;

public class ValueTransferDemo {
    public static void change(int x){
        x=20;
        System.out.println("被调用方法：x="+x);
    }
    public static void main(String[] args){
        int x=10;
        change(x);
        System.out.println("调用方法：x="+x);
    }
}

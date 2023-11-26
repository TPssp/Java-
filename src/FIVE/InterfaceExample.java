package FIVE;

public class InterfaceExample {
    public static void main(String[] args) {
        StackStorage s=new StackStorage();
        s.put("harbin");
        s.put("institute");
        s.put(2);
        s.put(3.5f);
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}

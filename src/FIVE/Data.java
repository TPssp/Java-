package FIVE;

public class Data {
    public static void main(String[] args){
        Data obj1=new Data();
        Data obj2=new Data();
        System.out.println(obj1.equals(obj2));
        Data obj3=obj1;
        System.out.println(obj1.equals(obj3));
    }
}

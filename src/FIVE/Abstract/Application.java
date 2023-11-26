package FIVE.Abstract;

public class Application {
    public static void main(String[] args){
        Geometry bottom=new Circle(3);
        Pillar pillar=new Pillar(bottom,5);
        System.out.println(pillar.getVolume());
    }
}

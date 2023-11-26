package EX_A;

public class Test {
    public static void main(String[] args){
        Geometry circle=new Circle(2.0);
        Geometry rectangle=new Rectangle(3,4);
        Pillar P1=new Pillar(circle,5);
        Pillar P2=new Pillar(rectangle,10);
        System.out.println(P1.getVolume());
        System.out.println(P2.getVolume());
    }
}

package EX_A;

public class Circle extends Geometry{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}

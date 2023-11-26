package FIVE.Abstract;

public class Circle extends Geometry{
    double r;
    public Circle(double r){
        this.r=r;
    }

    public double getArea(){
        return Math.PI*r*r;
    }
}

package EX_A;

public class Rectangle extends Geometry{
    private double height,width;
    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    public double getArea(){
        return height*width;
    }
}

package FIVE;

public class Rectangle {
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public Rectangle(){
        this.length=1;
        this.width=2;
    }

    public double getArea(){
        double area=length*width;
        return area;
    }

    public static void main(String[] args){
        Rectangle rectangle=new Rectangle(10,5);
        Rectangle rectangle2=new Rectangle();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle2.getArea());
    }
}

package FIVE;

public class Point {
    double x;
    public Point(){}
    public Point(double x){
        this.x=x;
    }
    public double distance(){
        return Math.sqrt(x*x);
    }

    public static class Point2D extends Point{
        double y;
        public Point2D(){}
        public Point2D(double x,double y){
            this.x=x;
            //super(x);
            this.y=y;
        }
        public double distance(){
            return Math.sqrt(x*x+y*y);
        }
        public double distance1D(){
            return super.distance();
        }
    }

    public class Test{
        public static void main(String[] args){
            Point2D p1=new Point2D(3,4);
            System.out.println(p1.distance());
            System.out.println(p1.distance1D());
        }
    }
}

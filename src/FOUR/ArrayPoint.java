package FOUR;

import java.awt.*;

public class ArrayPoint{
    int x,y;
    public ArrayPoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args){
        Point[] point=new Point[3];
        point[0]=new Point(10,20);
        point[1]=new Point(30,40);
        point[2]=new Point(20,30);
        System.out.println(point[0].getX()+" "+point[0].getY());
        System.out.println(point[1].getX()+" "+point[1].getY());
        System.out.println(point[2].getX()+" "+point[2].getY());
        System.out.println(point.length);
    }

}



package FIVE.Abstract;

public class Pillar {
    Geometry bottom;
    double height;
    Pillar(Geometry bottom,double height){
        this.bottom=bottom;
        this.height=height;
    }
    public double getVolume(){
        return bottom.getArea()*height;
    }

}

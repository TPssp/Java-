package EX_A;

public class Pillar {
    Geometry bottom;
    double height;
    public Pillar(Geometry bottom,double height){
        this.bottom=bottom;
        this.height=height;
    }
    public double getVolume(){
        return bottom.getArea()*height;
    }
}

package hw8;
import java.lang.*;

public class Form {
    double computeArea(){
        return 0;
    }

    double computeVolume(){
        return 0;
    }
    public static void main(String[] args){
        Point point1 = new Point();
        point1.setPoint(2,3);
        System.out.println(point1.toString());
    }
}
class Point{
    protected int x;
    protected int y;
    
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    
    public Point(int a, int b){
        this.x = a;
        this.y = b;
    }

    public void setPoint(int a, int b){
        this.x = a;
        this.y = b;
    }
    public String toString(){
        return Integer.toString(x) + " " + Integer.toString(y);
    }
    
}

class Circle{
    protected int radius;
    Point p = new Point();
    public Circle(){

    }
    public Circle(int r, int a, int b){
        this.radius=r;
        p.setPoint(a,b);
    }
    public void setRadius(int r){
        this.radius = r;
    }
    public String toString(){
        return Integer.toString(this.radius) + " " + p.toString();
    }
}

class Cylinder{
    private int height;
    Point pnt = new Point();
    Circle crc = new Circle();
    public Cylinder(){
        this.height = 0;
    }
    public Cylinder(int h, int r, int a, int b){
        this.height = h;
        pnt.setPoint(a,b);
        crc.setRadius(r);
    }
    public void setHeight(int h){
        this.height = h;
    }
    public String toString(){
        return Integer.toString(this.height) + " " + pnt.toString() + " " + crc.toString();
    }
}

class FormTest{
    public static void main(String[] args){
        
    }
}
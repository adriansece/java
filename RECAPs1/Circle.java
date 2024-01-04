import java.lang.Math;
public class Circle{
    double pi = 3.14;
    public double getArea(int x, int y, double r){ //A=pir^2
        double area=1;
        area = this.pi * Math.pow(r, 2);
        return area;
    }
    public double getCircumference(int x, int y, double r){ //2pir
        double circumference = 1.0;
        circumference = 2 * this.pi * r;
        return circumference;

    }
    public static void main(String[] args){
    Circle a= new Circle();
    System.out.println(a.getArea(1, 2 ,4));
    System.out.println(a.getCircumference(1, 2 ,4));

        
    }
}
    


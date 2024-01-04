public class circle
{
    static double area;
    static double circumference;

    public static double getArea()
    {   
        return area;
    }
    public static double getCircumference()
    {
        return circumference;
    }
    public static void main(String[] args)
    {
        int x = 2;
        int y = 3;
        double r = 4;

        area = 3.14 * r*r;
        circumference = (2*r) * 3.14;

        System.out.println("The area of the circle is: " + getArea());
        System.out.println("The circumference of the circle is: " + getCircumference());
    }
}
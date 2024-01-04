public class Distance{
    public static double distance(double x1, double y1, double x2, double y2){
        int res;
        res = sqrt(pow((x2-x1),2) + pow((y2-y1),2));
        return res;
    }
    
    
    private static int sqrt(int i) {
        return 0;
    }

    private static int pow(double d, int i) {
        return 0;
    }

    public static void main(String[] args){
        System.out.println(distance(0,0,4,5));
    }

}
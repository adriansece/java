package exam;
public class Bottle {
    private int day;
    private double capacity;
    private double quantity;
    private double price;
    public Bottle( int d, double c, double p){
        this.day=d;
        this.capacity=c;
        this.price=p;
        this.quantity=0;
    }
    public Bottle(int d, double p){
        this.day=d;
        this.price=p;
        this.capacity=1;
        this.quantity=0;
    }
    public double getPrice(){
        return this.price;
    }
    public int getDay(){
        return this.day;
    }
}

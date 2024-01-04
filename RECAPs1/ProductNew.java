import java.util.Scanner;
public class ProductNew{
    private String product;
    private double price;
    public ProductNew(String productName, double productPrice){
        product = productName;
        price = productPrice;
    }
    public void displayProduct(){
        System.out.println("Product: "+this.product+": price of product is "+this.price);
    }
    public double getPrice(){
    return price;
    }
    public void setPrice(double newprice){
        price = newprice;
    }
    public double getPriceInRON(){
        return (price*1000);
    }
    public void setPriceInRON(double newpriceRON){
        newpriceRON = price*1000;
    }
    public static void main(String[] args){

        ProductNew prod1 = new ProductNew("apa", 30000);
        ProductNew prod2 = new ProductNew("balsam", 42500);

        prod1.displayProduct();
        prod2.displayProduct();

        prod1.setPrice(40250);
        prod2.setPrice(52750);

        System.out.println("After adding 10.25RONs to prices: ");
        prod1.displayProduct();
        prod2.displayProduct();

        System.out.println("New product price in RONs: ");
        System.out.println(prod1.getPriceInRON());
        System.out.println(prod2.getPriceInRON());



;

    }

}
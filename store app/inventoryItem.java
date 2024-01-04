package finalExam;

public class inventoryItem extends shop {
    private int id;
    private String productName;
    private double price;
    private int stock;

    public inventoryItem(int id, String productName, double price, int stock)
    {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public int getId()
    {
        return id;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public int getStock()
    {
        return stock;
    }

    @Override
    public String toString()
    {
        return "product id: " + id + "\nproduct name: " + productName + "\nproduct price: " + price + "\nproducts in stock: " + stock;
    }

    public static void main(String[] args)
    {
        inventoryItem ciocolata = new inventoryItem(1, "ciocolata", 5, 40);
        ciocolata.toString();
    }
}

public class Product {
	private int id;
	private String name;
	private double price;
	private int amount;

	public Product(int id, String name, double price, int amount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}

	public void removeQty(int qty) {
		amount -= qty;
	}

	public void addQty(int qty) {
		amount += qty;
	}
}

public class Seller {
	private Shop shop;

	public Seller() {
		shop = new Shop();
	}

	public Shop getShop() {
		return shop;
	}

	public static void main(String[] args) {
		Seller seller = new Seller();
		Shop shop = seller.getShop();
		boolean success = shop.orderFromDistributor("Carne", 5);
		if (success) {
			System.out.println("Carne ordered successfully");
		} else {
			System.out.println("Error: not enough stock for Carne");
		}
		success = shop.orderFromDistributor("Oua", 5);
		if (success) {
			System.out.println("Oua ordered successfully");
		} else {
			System.out.println("Error: not enough stock for Oua");
		}
		success = shop.orderFromDistributor("Lapte", 10);
		if (success) {
			System.out.println("Lapte ordered successfully");
		} else {
			System.out.println("Error: not enough stock for Lapte");
		}
		shop.writeStockToFile();
	}
}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Shop {
	private Distributor distributor;
	private ArrayList<Product> stock;

	public Shop() {
		distributor = new Distributor();
		stock = new ArrayList<>();
	}

	private void addProduct(Product product) {
		for (Product p : stock) {
			if (p.getName().equals(product.getName())) {
				p.addQty(product.getAmount());
				return;
			}
		}
		stock.add(product);
	}

	public boolean orderFromDistributor(String name, int amount) {
		ArrayList<Product> distributorStock = distributor.getStock();
		for (Product p : distributorStock) {
			if (p.getName().equals(name)) {
				if (p.getAmount() >= amount) {
					addProduct(new Product(p.getId(), name, p.getPrice(), amount));
					distributor.removeFromStock(name, amount);
					return true;
				}
				return false;
			}
		}
		return false;
	}

	public ArrayList<Product> getStock() {
		return stock;
	}

	public void writeStockToFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("shopStock.txt"));
			for (Product p : stock) {
				String str = p.getId() + "," + p.getName() + "," + p.getPrice() + "," + p.getAmount() + "\n";
				writer.write(str);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

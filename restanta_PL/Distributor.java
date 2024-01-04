import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Distributor {
	private ArrayList<Product> stock;

	public Distributor() {
		try {
			stock = new ArrayList<>();
			BufferedReader reader = new BufferedReader(new FileReader("stock.txt"));
			String line = reader.readLine();
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, ",\n");
				int id = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
				double price = Double.parseDouble(st.nextToken());
				int amount = Integer.parseInt(st.nextToken());
				Product product = new Product(id, name, price, amount);
				stock.add(product);
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Product> getStock() {
		return stock;
	}

	public void removeFromStock(String name, int amount) {
		for (Product product : stock) {
			if (name.equals(product.getName())) {
				product.removeQty(amount);
				if (product.getAmount() == 0) {
					stock.remove(product);
				}
				break;
			}
		}
	}
}

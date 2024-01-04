package finalExam;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class warehouse {
    private ArrayList<inventoryItem> inventory;

    public warehouse readInventoryFile(File inputFile) throws FileNotFoundException
    {
        warehouse warehouse1 = new warehouse();
        Scanner in = new Scanner(inputFile);
        while(in.hasNext())
        {
            int id = in.nextInt();
            String productName = in.nextLine();
            double price = in.nextDouble();
            int stock = in.nextInt();

            inventoryItem chocolate = new inventoryItem(1, "chocolate", 6, 30);
            warehouse1.addItem(chocolate);
        }
    }
    public warehouse()
    {
        inventory = new ArrayList<>();
    }
    
    public void addItem(inventoryItem item)
    {
        inventory.add(item);
    }

    private int findHelper(int id)
    {
        int index = 0;
        while(index < inventory.size())
        {
            if(id == inventory.get(index).getId())
                return index;
            index++;
        }
        return -1;
    }

    public inventoryItem removeItem(int id)
    {
        int index = findHelper(id);
        return inventory.remove(index);
    }

    public void updateItemQuantity(int id, int stock)
    {
        int index = findHelper(id);
        inventory.get(index).setStock(stock);
    }

    public void updateItemPrice(int id, double price)
    {
        int index = findHelper(id);
        inventory.get(index).setPrice(price);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < inventory.size() ; i++)
        {
            sb.append(inventory.get(i).toString()).append(", ");
        }
        return this.inventory.toString();
    }


}

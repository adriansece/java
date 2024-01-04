package lab6redo;

public class fleetTest {

    public void main(String[] args)
    {
        fleet f1 = new fleet (100, 300, 15, 250, 600, 20);
        System.out.println("Average consumption for fleet= " + f1.averageConsumption());
    }
}

package lab6redo;

public class carTest {
    
    public void main(String[] args)
    {
        double startKm1 = 100;
        double endKm1 = 200;
        double liters1 = 10;

        double startKm2 = 250;
        double endKm2 = 400;
        double liters2 = 15;

        car car1 = new car(startKm1, endKm1, liters1);
        car car2 = new car(startKm2, endKm2, liters2);

        System.out.println("car 1 consumption= " + car1.computeConsumption());
        System.out.println("car 2 consumption= " + car2.computeConsumption());
    }
}

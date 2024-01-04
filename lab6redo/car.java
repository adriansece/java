package lab6redo;

public class car {
    private double startKm;
    private double endKm;
    private double liters;

    public car(double startOdo, double endOdo, double litersUsed)
    {
        this.startKm = startOdo;
        this.endKm = endOdo;
        this.liters = litersUsed;
    }   

    public double computeConsumption()
    {
        double x;
        x = liters / (endKm - startKm);
        return x;
    }


}

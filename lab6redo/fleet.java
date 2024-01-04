package lab6redo;

public class fleet {
    
    private car town;
    private car suv;

    public fleet(double Car1StartOdo, double Car1EndOdo, double Car1Liters,
double Car2StartOdo, double Car2EndOdo, double Car2Liters)
    {
        this.town = new car(Car1StartOdo, Car1EndOdo, Car1Liters);
        this.suv = new car(Car2StartOdo, Car2EndOdo, Car2Liters);
    }

    public double averageConsumption()
    {
        return (town.computeConsumption() + suv.computeConsumption())/2;
    }
}

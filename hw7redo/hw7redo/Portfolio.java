package hw7redo;
public class Portfolio 
{
    Share shares;
    int noShares;
    double computeSum = 0;
    double sValue;

    void addShare(Share s)
    {
        sValue = s.value;
        computeSum = computeSum + sValue;
    }

}

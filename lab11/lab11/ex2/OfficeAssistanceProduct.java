package lab11.lab11.ex2;

public class OfficeAssistanceProduct {
    
    private int code;
    static int comissionPercent;
    private long costPrice;

    OfficeAssistanceProduct(int code, long costPrice)
    {
        this.code = code;
        this.costPrice = costPrice;
    }

    public int getCode()
    {
        return code;
    }
    public long getCostPrice()
    {
        return costPrice;
    }

    public static void setCommision(int percent)
    {
        comissionPercent = percent;
    }

    public long computeSellingPrice()
    {
        return (this.costPrice - comissionPercent);   
    }

    public String toString()
    {
        return("Product code: " + code + "\nCost price: " + costPrice + "\nCommision percentage: " + comissionPercent);
    }
}

package lab11.lab11.ex2;

public class Printer extends OfficeAssistanceProduct{
    
    static int VAT;

    public Printer(int code, long costPrice)
    {
        super(code, costPrice);

    }

    public static void setVAT(int vat)
    {
        VAT = vat;
    }
}

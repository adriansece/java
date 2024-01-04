package lab11.lab11.ex2;

public class TestShop extends OfficeAssistanceProduct{
    private static final Object[] Array = null;
    public TestShop(int code, long costPrice)
    {
        super(code, costPrice);
    }
    static public void main(String[] args)
    {
        OfficeAssistanceProduct arr[] = new OfficeAssistanceProduct[5];
        arr[0] = new Printer(13, 150);
        System.out.println("printer code: " + arr[0].getCode() + " cost price: " + arr[0].getCostPrice());
        
        arr[1] = new Computer(17, 750);
        System.out.println("computer code: " + arr[1].getCode() + " cost price: " + arr[1].getCostPrice());

        arr[2] = new CopyMachine (7, 200);
        System.out.println("copy machine code: " + arr[2].getCode() + " cost price: " + arr[2].getCostPrice());

        Computer.setVAT(10);
        Printer.setVAT(15);
        CopyMachine.setVAT(20);

        

        OfficeAssistanceProduct.setCommision(10);


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("Cheackout price: ");
        System.out.println("Printer price: " + Printer.computeSellingPrice());
        System.out.println("Computer price: " + Computer.computeSellingPrice());
        System.out.println("Copy Machine price: " + CopyMachine.computeSellingPrice());

    }
    
}

package lab6redo;

public class account {
    
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public account(String accNumber, String accHolder, double bal)
    {
        this.accountNumber = accNumber;
        this.accountHolder = accHolder;
        this.balance = bal;
    }

    public double getBalance()
    {
        return balance;
    }

    public void processDeposit(double amount)
    {
        balance = balance + amount;
    }

    public void processCheck(double amount)
    {
        
        if(balance < 10000)
        {
            balance = balance - 15;
        }
        balance = balance - amount;
    }
}

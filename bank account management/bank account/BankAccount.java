package lab11.lab11;


public class BankAccount {

    static double balance;
    static String owner;
    int id;
    int idCurrentAccount = 1;

    public BankAccount(String owner)
    {
        this.owner = owner;
    }

    public BankAccount(double balance, String owner)
    {

    }

    public void deposit(double sum)
    {
        balance = balance + sum;
    }

    public void withdraw(double sum)
    {
        balance = balance - sum;
    }

    public static double getBalance()
    {
        return balance;
    }

    public static String getOwner()
    {
        return owner;
    }

    public int getId()
    {
        return id;
    }

    public String toString()
    {
        return("Balance: " + balance + "\nOwner: " + owner + "\nAccount id: " + id + "\nCurrent account id: " + idCurrentAccount);
    }

    public void endOfMonth()
    {
        
    }
}

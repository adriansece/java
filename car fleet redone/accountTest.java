package lab6redo;

public class accountTest {
    
    public void main(String[] args)
    {
        account account1 = new account("5a6b7c8d", "Adrian", 10000);
        account account2 = new account("1a2b3c4d", "Alexandru", 10000);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        account1.processDeposit(2000);
        account2.processCheck(1500);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}

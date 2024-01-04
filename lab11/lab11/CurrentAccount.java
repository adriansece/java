package lab11.lab11;

import java.util.Calendar;

public class CurrentAccount {
    
    int transactionNo;
    int FREE_TRANSACTIONS;
    double TRASACTION_COST;

    CurrentAccount(String owner, double balance, int transNr, double transCost)
    {
        owner = BankAccount.getOwner();
        balance = BankAccount.getBalance();
    }


    public static void dischargeExpenses()
    {

    }

    public String toString()
    {
        return("\nTransaction no.: " + transactionNo + "\nFree transactions: " + FREE_TRANSACTIONS + "\nTransaction cost: " + TRASACTION_COST);
    }

    public void deposit(double sum)
    {
        BankAccount.balance = BankAccount.balance + sum;
    }

    public void withdraw(double sum)
    {
        BankAccount.balance = BankAccount.balance - sum;
    }

    public void endOfMonth() {
        Calendar cal = Calendar.getInstance();
        int currentMonth = cal.get(Calendar.MONTH);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        int nextDayMonth = cal.get(Calendar.MONTH);
        if (currentMonth != nextDayMonth) 
        {
            CurrentAccount.dischargeExpenses();
        }
}
}


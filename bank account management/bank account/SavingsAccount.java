package lab11.lab11;

import java.util.Calendar;
public class SavingsAccount {

    double interestRate;

    public SavingsAccount(String owner)
    {
        owner = BankAccount.owner;
    }

    public SavingsAccount(double balance, String owner, double interestRate)
    {
        balance = BankAccount.balance;
        owner = BankAccount.owner;

    }

    public void applyInterest()
    {
        BankAccount.balance = BankAccount.balance - interestRate;
    }

    public double getInterest()
    {
        return interestRate;
    }

    public String toString()
    {
        return("\nbalance: " + BankAccount.balance + "\nOwner: " + BankAccount.owner + "\nInterest rate: " + interestRate);
    }

    public void endOfMonth() {
        Calendar cal = Calendar.getInstance();
        int currentMonth = cal.get(Calendar.MONTH);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        int nextDayMonth = cal.get(Calendar.MONTH);
        if (currentMonth != nextDayMonth) {
        applyInterest(); }
    }

}

import java.util.*;
class BankAccount 
{
    private double balance;
    boolean deposit(double amount)
    {
        if(amount <= 0) return false;
        balance += amount;
        return true;
    }

    double getBalance()
    {
        return balance;
    }

}


class BankAccountDetails
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount you want to deposit: ");

        if(!sc.hasNextDouble()){
            System.out.println("Invalid Input! Please enter a valid numerical amount.");
            sc.close();
            return;
        }

        double depositAmount = sc.nextDouble();
        BankAccount account = new BankAccount();
  
        if(account.deposit(depositAmount)){
            System.out.println("Successfully deposited: $" + depositAmount);
            System.out.println("Total balance: $" + account.getBalance());
        }

        else 
        {
            System.out.println("Invalid Input! Please enter amount greater than zero.");
        }               
        sc.close();        
    }
}
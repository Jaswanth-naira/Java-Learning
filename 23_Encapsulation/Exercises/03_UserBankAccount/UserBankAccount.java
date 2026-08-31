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

     boolean withdraw(double amount)
     {
        if(amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
     }

     double getBalance()
     {
         return balance;
     }
     
}

class UserBankAccount
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the deposit amount: ");

    if (!sc.hasNextDouble()){
        System.out.println("Invalid Input!!! Please enter a valid numerical data.");
        sc.close();
        return;
    }


    double depositAmount = sc.nextDouble();

    System.out.print("Enter the withdrawal amount: ");

    if (!sc.hasNextDouble()){
        System.out.println("Invalid Input!!! Please enter a valid numerical data.");
        sc.close();
        return;
    }
    
    
    double withDrawalAmount = sc.nextDouble();

    BankAccount account = new BankAccount();
    
    if (account.deposit(depositAmount)){
         System.out.printf("Amount has been deposited successfully $%.2f%n", depositAmount);
         System.out.printf("Current balance after successfull deposit $%.2f%n", account.getBalance());
    }
    else {
         System.out.println("Deposit Failed!!!Please enter amount greater than zero.");
    }

    if(withDrawalAmount <= 0)
        {
            System.out.println("Withdrawal failed. Please enter an amount greater than zero.");
        }
    else if(account.withdraw(withDrawalAmount))
        {
            System.out.printf("Withdrawn: $%.2f%n", withDrawalAmount);
            System.out.printf("Balance after withdrawal: $%.2f%n", account.getBalance());
        }
    else
        {
            System.out.printf("Withdrawal failed. Insufficient balance: $%.2f%n", account.getBalance());
        }
    
    
     
    sc.close();
    }
}
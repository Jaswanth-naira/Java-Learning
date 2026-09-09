import java.util.Scanner;
class BankAccount
{
     private String accountNumber;
     private double balance;

     boolean setAccountNumber(String accNum)
     {
          if(accNum == null || accNum.trim().isEmpty()) return false;
          accountNumber = accNum;
          return true;
     }

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

     String getAccountNumber()
     {
        return accountNumber;
     }
     
     
     double getBalance()
     {
        return balance;
     }


}
class AccountDetails 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        
        
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();
        
        if(!account.setAccountNumber(accountNumber)){
            System.out.println("Account number cannot be blank.");
            scanner.close();
            return;
        }

        System.out.println("Account created. Current Balance: $ " + account.getBalance());

        System.out.print("Enter the amount you would like to desposit: ");
        
        if(!scanner.hasNextDouble()){
            System.out.println("Invalid Input! Please enter a valid number.");
            scanner.close();
            return;
        }
        
        double depositMoney = scanner.nextDouble();

        if(!account.deposit(depositMoney)){
            System.out.println("Deposit failed.Please enter amount greater than 0.");
        }

        else{
        System.out.println("Deposit successful. New balance: $" + account.getBalance());
        }

        System.out.print("Enter the amount you would like to withdraw: ");

        if(!scanner.hasNextDouble()){
            System.out.println("Invalid Input! Please enter a valid number.");
            scanner.close();
            return;
        }

        double withdrawMoney = scanner.nextDouble();
        
        if(!account.withdraw(withdrawMoney))
        {
            if(withdrawMoney < 0){
                System.out.println("Please enter amount greater than 0.");
            }

            else{
                System.out.println("withdrawal failed. Insufficient funds.");
            }
        }

       else
       {
        System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
       }

        System.out.println();
        System.out.println("--- FINAL ACCOUNT STATUS ---");
        System.out.println("Account: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
             
    }
}
import java.util.Scanner;

class BankAccount 
{
    private double balance;
    private int noOfSuccessfulTransactions;
    
    boolean setInitialBalance(double initialAmount)
    {
         if(initialAmount < 0) return false;
         balance = initialAmount;
         return true;
    }

    boolean deposit(double amount)
    {
        if(amount <=0 ) return false;
        balance += amount;
        noOfSuccessfulTransactions++;
        return true;
    }

    boolean withdraw(double amount)
    {
         if(amount <= 0) return false;
         if (amount > balance) return false;
         balance -= amount;
         noOfSuccessfulTransactions++;
         return true;
    }

    double getBalance()
    {
         return balance;
    }

    int getNoOfSuccessfulTransactions()
    {
         return noOfSuccessfulTransactions;
    }


}

class AccountDetails 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter initial balance amount: ");
        
        if(!scanner.hasNextDouble()){
            System.out.println("Invalid Input! Please enter a valid number.");
            scanner.close();
            return;
        }

        

        double initialAmount = scanner.nextDouble();
        scanner.nextLine();
        if(!account.setInitialBalance(initialAmount))
        {
            System.out.println("Initial Balance cannot be negative.");
            scanner.close();
            return;
        }
        
        
        int noOfAttempts = 3;

        for(int i=1; i <= noOfAttempts; i++)
        {
        
              System.out.print("Please choose whether you want to do cash withdrawal or cash deposit (withdrawal/deposit): ");
      
              String response = scanner.nextLine().trim();
      
              if(!response.equalsIgnoreCase("withdrawal") && !response.equalsIgnoreCase("deposit"))
              {
                  System.out.println("Please choose either cash withdrawal or cash deposit.");
              }

              else if(response.equalsIgnoreCase("deposit"))
              {
                   System.out.printf("Your current balance: $%.2f%n", account.getBalance());
                   System.out.print("Please enter the amount you would like to deposit in your account $: ");
                   if(!scanner.hasNextDouble()){
                      System.out.println("Please enter a valid number.");
                      scanner.nextLine();
                      continue;
                   }

                   double depositMoney = scanner.nextDouble();
                   scanner.nextLine();
                   if(account.deposit(depositMoney)){
                     System.out.printf("Money Deposited $%.2f%n", depositMoney);
                     System.out.printf("Total Balance: $%.2f%n", account.getBalance());
                     System.out.println("Displaying no of successful transactions: " + account.getNoOfSuccessfulTransactions());
                   }
                  
                  else{
                    System.out.println("Please enter amount greater than 0.");
                    continue;
                  }
              }

              else if(response.equalsIgnoreCase("withdrawal"))
              {
                   
                   System.out.printf("Your current balance: $%.2f%n", account.getBalance());
                   System.out.print("Please enter the amount you would like to withdraw from your account $: ");
 
                   if(!scanner.hasNextDouble()){
                      System.out.println("Please enter a valid number.");
                      scanner.nextLine();
                      continue;
                   }
                   double withdrawalAmount = scanner.nextDouble();
                   scanner.nextLine();
                   if(account.withdraw(withdrawalAmount)){
                     System.out.printf("Money withdrawn $%.2f%n", withdrawalAmount);
                     System.out.printf("Total balance: $%.2f%n", account.getBalance());
                     System.out.println("Displaying no of successful transactions: " + account.getNoOfSuccessfulTransactions());
                   }
                  
                  else if(withdrawalAmount > 0 ){
                    System.out.println("Transaction declined! Insufficient balance.");
                  }
                  else 
                  {
                     System.out.println("Withdrawal unsuccessful. Enter a positive amount within your available balance.");
                  }
              }
        

        }

        System.out.printf("%nFinal balance: $%.2f%n", account.getBalance());
        System.out.println("Successful transactions: " + account.getNoOfSuccessfulTransactions());
        scanner.close();         
    
    }
}
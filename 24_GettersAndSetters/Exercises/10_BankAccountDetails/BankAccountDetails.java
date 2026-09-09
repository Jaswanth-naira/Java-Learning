import java.util.Scanner;
class BankAccount
{
     private String accountNumber;
     private double balance;

     boolean setAccountNumber(String userAccountNumber)
     {
          if(userAccountNumber == null || userAccountNumber.trim().isEmpty()) return false;
          accountNumber = userAccountNumber;
          return true;
     }

     boolean deposit(double amount)
     {
          if(amount < 0) return false;
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

     boolean transferTo(BankAccount targetAccount, double amount)
     {
          if(withdraw(amount)){
               targetAccount.deposit(amount);
               return true;
          }
          return false;
     }


}
class BankAccountDetails 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        BankAccount userAccountA = new BankAccount();
        BankAccount userAccountB = new BankAccount();

        System.out.print("--- SETUP ---\n");

        System.out.print("Enter Account A number: ");

        String accountNumberOfA = scanner.nextLine();

        if(!userAccountA.setAccountNumber(accountNumberOfA)){
          System.out.println("Account number cannot be left blank.");
          scanner.close();
          return;
        }

        System.out.print("Enter account A initial deposit: ");

        if(!scanner.hasNextDouble()){
          System.out.println("Please enter a valid number.");
          scanner.close();
          return;
        }

        double depositMoney = scanner.nextDouble();

        if(!userAccountA.deposit(depositMoney)){
          System.out.println("Please enter amount greater than 0.");
          scanner.close();
          return;
        }

        System.out.println("Account A Balance: $" + userAccountA.getBalance());
        scanner.nextLine();

        System.out.print("Enter Account B number: ");

        String accountNumberOfB = scanner.nextLine();

        if(!userAccountB.setAccountNumber(accountNumberOfB)){
          System.out.println("Account number cant be left blank.");
          scanner.close();
          return;
        }

         System.out.print("Enter account B initial deposit: ");
       
        depositMoney = scanner.nextDouble();

        if(!userAccountB.deposit(depositMoney)){
          System.out.println("Please enter amount greater than 0.");
          scanner.close();
          return;
        }

        System.out.println("Account B Balance: $" + userAccountB.getBalance());

        System.out.println();
        System.out.print("\n--- TRANSFERS ---");
        System.out.println();
        System.out.print("Enter amount transfer from A to B: ");

        if(!scanner.hasNextDouble()){
          System.out.println("Please enter a valid number.");
          scanner.close();
          return;
        }

        double transferAmount = scanner.nextDouble();
        
        if(!userAccountA.transferTo(userAccountB, transferAmount)){
          System.out.println("Transfer failed! Insufficient funds.");
        }    
        
        System.out.println("Account A Balance: $ " + userAccountA.getBalance());
        System.out.println("Account B Balance: $ " + userAccountB.getBalance());
     


        System.out.println();
        System.out.print("\nEnter amount transfer from A to B: ");
        if(!scanner.hasNextDouble()){
          System.out.println("Please enter a valid number.");
          scanner.close();
          return;
        }
        transferAmount = scanner.nextDouble();
        
        if(!userAccountA.transferTo(userAccountB, transferAmount)){
          System.out.println("Transfer failed! Insufficient funds.");
        }    
         System.out.println("Account A Balance: $ " + userAccountA.getBalance());
         System.out.println("Account B Balance: $ " + userAccountB.getBalance());
     


    }
}
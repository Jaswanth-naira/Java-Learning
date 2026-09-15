import java.util.Scanner;
class BankAccount 
{
    private double balance;
    BankAccount(double balance)
    {
         if(balance < 0){
            this.balance = 0.0;
            return;
         }
        this.balance = balance;
    }

    double getBalance()
    {
        return balance;
    }
}

class UserAccount
{
    public static void main(String args[])
    {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter initial amount you would like to deposit: ");

         if(!scanner.hasNextDouble()){
            System.out.print("Invalid Input! Please enter a valid number.");
            scanner.close();
            return;
         }

         double amount = scanner.nextDouble();
         BankAccount account = new BankAccount(amount);
         System.out.println(account.getBalance());
    }
}
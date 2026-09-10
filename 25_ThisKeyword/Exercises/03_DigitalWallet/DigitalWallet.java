import java.util.Scanner;
class Wallet 
{
    private String name;
    private double balance;

    boolean setName(String name)
    {
        if(name == null || name.trim().isEmpty()) return false;
        this.name = name.trim();
        return true;
    }

    boolean setInitialBalance(double balance)
    {
        if(balance < 0 ) return false;
        this.balance = balance;
        return true;
    }

    String getName()
    {
        return name;
    }

    double getBalance()
    {
        return balance;
    }

    boolean transferTo(Wallet receiver, double amount)
    {
        if(receiver == null|| amount > this.balance || amount <= 0 || receiver == this) return false;
        this.balance = this.balance - amount;
        receiver.balance = receiver.balance + amount;
        return true;
    }

}



class DigitalWallet
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Wallet owner = new Wallet();
        Wallet receiver = new Wallet();

        System.out.print("Enter owner's name: ");

        String ownerName = scanner.nextLine();

        if(!owner.setName(ownerName)){
            System.out.println("Name cannot be left blank.");
            scanner.close();
            return;
        }

        System.out.print("Enter owner's wallet balance: ");

        if(!scanner.hasNextDouble()){
            System.out.println("Please enter a valid number.");
            scanner.close();
            return;
        }

        double balance = scanner.nextDouble();
        scanner.nextLine();
        
        if(!owner.setInitialBalance(balance)){
            System.out.println("Balance cannot be set negative.");
            scanner.close();
            return;
        }
              
       System.out.print("Enter receiver name: ");
       String receiverName = scanner.nextLine();

        if(!receiver.setName(receiverName)){
            System.out.println("Name cannot be left blank.");
            scanner.close();
            return;
        }

        System.out.print("Enter receiver wallet balance: ");

        if(!scanner.hasNextDouble()){
            System.out.println("Please enter a valid number.");
            scanner.close();
            return;
        }

        balance = scanner.nextDouble();
        
        if(!receiver.setInitialBalance(balance)){
            System.out.println("Balance cannot be set negative.");
            scanner.close();
            return;
        }

        System.out.print("Enter the amount you would like to transfer: ");

        if(!scanner.hasNextDouble())
        {
            System.out.println("Please enter a valid number.");
            scanner.close();
            return;
        }

        double transferAmount = scanner.nextDouble();
       
        boolean result = owner.transferTo(receiver,transferAmount);

        if(!result){
            if(transferAmount <= 0){
                System.out.println("Transfer amount must be greater than 0.");
            }
            else{
                System.out.println("Transfer failed! Insufficient balance of owner's wallet.");
            }
        }
        else{
            System.out.printf("%s balance: $%.2f%n", owner.getName(), owner.getBalance());
            System.out.printf("%s balance: $%.2f%n", receiver.getName(), receiver.getBalance());
        }
        scanner.close();
    
    }
}
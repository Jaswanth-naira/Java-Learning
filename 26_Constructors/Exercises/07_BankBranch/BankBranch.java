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

class Customer
{
    private String name;
    private BankAccount account;

    Customer()
    {
        this("Unknown",0.0);
    }
    Customer(String name, double deposit)
    {
         this.name = name;
         this.account = new BankAccount(deposit);    
    }

    Customer(String name)
    {
         this(name,0.0);
    }

    String getName()
    {
        return name;
    }

    double getBalance()
    {
        return account.getBalance();
    }

}
class BankBranch 
{
    public static void main(String[] args)
    {
        Customer premium = new Customer("Bruce",5000.0);
        Customer standard = new Customer("Clark");
        
        System.out.println("Customer: " + premium.getName() + " | " + "Balance: " + premium.getBalance());
        System.out.println("Customer: " + standard.getName() + " | " + "Balance: " + standard.getBalance());
       
    }
}
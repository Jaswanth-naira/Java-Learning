import java.util.*;
class Account 
{
    int accNo;
    String holderName;
    double balance;

    void acceptDetails(Scanner sc)
    {
        System.out.println("\nEnter user account details here:");
        System.out.print("Enter user accountnumber: ");
        accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder name: ");
        holderName = sc.nextLine();

        System.out.print("Enter user account balance: ");
        balance = sc.nextDouble();
        
    }

    void  findAndPrintAccountDetails(Account[] arr,Scanner sc)
    {
          System.out.print("\nEnter user account number you want to fetch details: ");
          int userAccountNo = sc.nextInt();
          boolean found = false;
          for(int i=0;i<arr.length;i++)
          {
              if(userAccountNo == arr[i].accNo)
              {
                   System.out.println("\n-------------Printing Account Details------------ ");
                   System.out.println("User account number: "+arr[i].accNo);
                   System.out.println("Account holder name: "+arr[i].holderName);
                   System.out.println("User account balance: "+arr[i].balance);
                   found = true;
                   break;
              }
          }
          if(!found)
          {
             System.out.println("No Account Details found");
          }     
    }
}
class AccountDetails 
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of an array: ");
         int size = sc.nextInt();

         if(size > 0)
         {
                Account[] arr = new Account[size];
                for(int i=0;i<arr.length;i++)
                {
                      arr[i] = new Account();
                      arr[i].acceptDetails(sc);
                }
                
               Account obj = new Account();
               obj.findAndPrintAccountDetails(arr,sc);
         }
         else 
         {
              System.out.println("Please enter size greater than 0.");
         }
     }
}
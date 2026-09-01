import java.util.*;

class UserAccount 
{
      private String password;

      boolean setPassword(String userPassword)
      {
          if(userPassword == null || userPassword.trim().isEmpty())  return false;
          if( userPassword.length() < 8) return false;
          password = userPassword;
          return true;
      }
      
}

class UserAccountDetails
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter a password: ");

         String userPassword = sc.nextLine();

         UserAccount account = new UserAccount();
         

         if(account.setPassword(userPassword))
         {
             System.out.println("Password has been set.");
         }

         else if(userPassword.trim().isEmpty())
         {
            System.out.println("Invalid Input! Password cannot be blank.");
         }

         else 
         {
             System.out.println("Password must be 8 characters long.");
         }
         
         sc.close();
    }        
    
}
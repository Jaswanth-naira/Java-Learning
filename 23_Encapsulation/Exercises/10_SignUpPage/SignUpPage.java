import java.util.Scanner;

class UserProfile
{
    private String userName;
    private String userEmail;
    private int userAge;
    
    boolean setName(String name)
    {
        if( name == null || name.trim().isEmpty()) return false;
        userName = name.trim();
        return true;
    }

    boolean setEmail(String email)
    {
        if(email == null || email.trim().isEmpty() || !email.contains("@")) return false;
        userEmail = email.trim();
        return true;
    }

    boolean setAge(int age)
    {
         if(age < 18 || age > 120) return false;
         userAge = age;
         return true;
    }

    String getName()
    {
        return userName;
    }

    String getEmail()
    {
        return userEmail;
    }

    int getAge()
    {
         return userAge;
    }

    boolean isProfileComplete()
    {
         return userName != null && userEmail != null  && userAge != 0;
    }



}
class SignUpPage 
{
     public static void main(String args[])
     {
         Scanner scanner = new Scanner(System.in);
         UserProfile profile = new UserProfile();  

         System.out.print("Enter user name: ");
         String name = scanner.nextLine();

         System.out.print("Enter user email: ");
         String email = scanner.nextLine();
         
         profile.setName(name);
         profile.setEmail(email);

         System.out.print("Enter user's age: ");

         if(scanner.hasNextInt()){
            int age = scanner.nextInt();
            profile.setAge(age);
         }
         else{
            scanner.nextLine();
         }
               
                
         if(profile.isProfileComplete()){
            System.out.println("\n-----DISPLAYING USER LOGIN DETAILS: ");
            System.out.println("Name: " + profile.getName());
            System.out.println("Email: " + profile.getEmail());
            System.out.println("Age: " + profile.getAge());
         }

         else{
            System.out.println("Profile is incomplete");
         }
             

         scanner.close();    
     }
}
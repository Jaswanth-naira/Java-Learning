import java.util.*;
class PasswordChecker 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String str = sc.next();
        int length = str.length();
        boolean hasDigit = str.matches(".*\\d.*");
        if(length >= 8 && hasDigit)
        {
            System.out.println("Strong password");
        }
        else 
        {
            System.out.println("Weak password");
        }
    }
}
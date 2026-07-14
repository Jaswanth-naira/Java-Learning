import java.util.*;
class ValidAge 
{
    public static boolean isValidAge(int age)
    {
            boolean result = (age > 0 && age <= 120);
            return result;
    }
        
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        boolean result = isValidAge(age);
        System.out.println(result);
        sc.close();
    }
}
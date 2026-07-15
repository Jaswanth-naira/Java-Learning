import java.util.*;
class CaseSensitive 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any letter: ");
        char ch = sc.next().charAt(0);
        boolean hasUpperCase = Character.isUpperCase(ch);
        if(hasUpperCase)
        {
            System.out.println("Uppercase");
        }
        else 
        {
            System.out.println("Lowercase");
        }

    }
}
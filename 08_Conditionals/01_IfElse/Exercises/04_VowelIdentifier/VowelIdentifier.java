import java.util.*;
class VowelIdentifier
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Vowel: ");
        char ch = sc.next().charAt(0);
        char lowerCh = Character.toLowerCase(ch);
        /*if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u' )
        {
            System.out.println("Vowel");
        }
        */
         if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u')
         {
            System.out.println("Vowel");
         }
        else
        {
            System.out.println("Not a Vowel");
        }
    }
}
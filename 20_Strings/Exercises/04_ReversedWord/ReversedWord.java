import java.util.*;
class ReversedWord 
{
     String reverseString(String str)
     {
         String word = "";
         for(int i = 0; i < str.length(); i++)
         {
              char letter = str.charAt(str.length() - i - 1);
              word + letter;
              
         }

         return word;
     }
     
     
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String str = sc.nextLine();

        if(str.isEmpty())
        {
            System.out.println("Please enter valid input");
            return;
        }
        ReversedWord obj = new ReversedWord();
        String reversedWord = obj.reverseString(str);
        System.out.println("The reversed word : " + reversedWord);
     }
}
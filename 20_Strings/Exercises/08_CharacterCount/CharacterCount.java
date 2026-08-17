import java.util.*;
class CharacterCount 
{
    void countCharacters(String str)
    {
        int noOfLetters = 0;
        int noOfDigits = 0;
        int noOfOthers = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isLetter(str.charAt(i))){
                noOfLetters = noOfLetters + 1;
            }
            else if (Character.isDigit(str.charAt(i))){
                noOfDigits = noOfDigits + 1;
            }
            else{
                noOfOthers = noOfOthers + 1;
            }
        }
        
        System.out.println("No of letters in text: " + noOfLetters);
        System.out.println("No of digits in text: " + noOfDigits);
        System.out.println("Neither a letter nor a digit in text: " + noOfOthers);
    }
    
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter any text: ");
         String str = sc.nextLine();

         if(str.isEmpty())
         {
             System.out.println("Invalid!!Please enter some text: ");
             return;
         }

         CharacterCount obj = new CharacterCount();

         obj.countCharacters(str);
    }
}
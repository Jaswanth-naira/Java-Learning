import java.util.*;
class InputString 
{
    
    int getLength(String word)
    {
        return word.length();
    }

    char getLastCharacter(String word)
    {
          return word.charAt(word.length()-1);
          
    } 
    
    
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter any word: ");
         String word = sc.nextLine();

         if(!word.matches("[a-zA-Z]+"))
         {
            System.out.println("Please enter any valid input string");
            return;   
         }

          InputString obj = new InputString();

          int lengthOfWord = obj.getLength(word);
          char lastCharacter = obj.getLastCharacter(word);
  
          System.out.println("The length of word is : " + lengthOfWord);
          System.out.println("The last character of the word is: " + lastCharacter);
    }
}
import java.util.*;
class CharacterRemover 
{
    String removeAllOccurrences(String inputText, char character)
    {
        StringBuilder sb = new StringBuilder(inputText);

        for(int i = sb.length()-1; i >=0; i--)
        {
            if(sb.charAt(i) == character) sb.deleteCharAt(i);
        }   
        return sb.toString();
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputText = sc.nextLine();
        
         if(inputText.trim().isEmpty())
        {
            System.out.print("Invalid Input!!! Please enter some text. ");
            sc.close();
            return;
        }
        
        System.out.print("Enter any character: ");
        String characterInput = sc.next(); 
        if(characterInput.length() != 1)
        {
            System.out.println("Invalid!!! Please enter a single character.");
            sc.close();
            return;
        }
        
        char character = characterInput.charAt(0);


        CharacterRemover remover = new CharacterRemover();
        String finalText = remover.removeAllOccurrences(inputText,character);

        System.out.println("Result: " + finalText);
        sc.close();
    }
}
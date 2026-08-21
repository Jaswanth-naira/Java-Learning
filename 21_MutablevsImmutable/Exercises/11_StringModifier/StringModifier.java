import java.util.*;
class StringModifier 
{
    void showOriginalAndModifiedWords(String originalWord)
    {
         String modifiedWord = originalWord;

         modifiedWord += " (Modified)";

         System.out.println("Original Word: " + originalWord);
         System.out.println("Modified Word: " + modifiedWord);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input here: ");
        String userInput = sc.nextLine();

        if(userInput.trim().isEmpty())
        {
            System.out.print("Invalid!!!Please enter some text.");
            sc.close();
            return;
        }

        StringModifier modifier = new StringModifier();
        modifier.showOriginalAndModifiedWords(userInput);
        sc.close();
    }
}
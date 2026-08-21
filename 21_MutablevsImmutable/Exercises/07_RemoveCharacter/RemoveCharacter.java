import java.util.*;
class RemoveCharacter 
{
    String removeCharacter(String inputText, char ch)
    {
         String cleanedText = "";
         for(int i = 0; i < inputText.length(); i++)
         {
             if(inputText.charAt(i) != ch) cleanedText = cleanedText + inputText.charAt(i);
         }
         return cleanedText;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String inputText = sc.nextLine();

        if(inputText.isEmpty()){
            System.out.print("Invalid!!!Please enter some text");
            sc.close();
            return;
        }

        System.out.print("Enter character to remove: ");
        String characterInput = sc.next();
        if(characterInput.length()!= 1)
        {
            System.out.print("Invalid!!! Please enter single character.");
            sc.close();
            return;
        }
 
        char ch = characterInput.charAt(0);
        

        RemoveCharacter obj = new RemoveCharacter();
        String cleanedText = obj.removeCharacter(inputText,ch);

        System.out.print(cleanedText);
        sc.close(); 
    }
}
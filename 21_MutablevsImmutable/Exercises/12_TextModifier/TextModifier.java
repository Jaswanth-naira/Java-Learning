import java.util.*;
class TextModifier 
{
    String removeSpaces(String text)
    {
        String result = "";

        for(int i = 0; i < text.length(); i++)
        {
              char currentChar = text.charAt(i);
              if(currentChar!= ' ') result += currentChar;
        }

        return result;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter text here: ");
        String originalText = sc.nextLine();

        if(originalText.trim().isEmpty())
        {
            System.out.print("Invalid!!! Please enter some text.");
            sc.close();
            return;
        }
       
        TextModifier modifier = new TextModifier();
        String modifiedText = modifier.removeSpaces(originalText);

        System.out.println("Printing text: " + originalText);
        System.out.println("Printing text (whitespaces removed): " + modifiedText);
        sc.close();
    }
}
import java.util.*;
class ReverseString 
{
    String reverse(String inputText)
    {
        String reversedResult = "";
        for(int i = inputText.length()-1; i >= 0; i--)
        {
               reversedResult +=  inputText.charAt(i);
        }

        return reversedResult;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text here: ");
        String inputText = sc.nextLine();

        if(inputText.trim().isEmpty())
        {
            System.out.print("Invalid!!Please enter some text.");
            sc.close();
            return;
        }

        ReverseString obj = new ReverseString();
        String finalText = obj.reverse(inputText);
        System.out.println(finalText);

        sc.close();

    }
}
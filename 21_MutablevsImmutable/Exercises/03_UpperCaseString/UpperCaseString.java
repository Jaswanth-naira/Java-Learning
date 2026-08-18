import java.util.*;
class UpperCaseString
{
    void attemptUpperCase(String inputTextString)
    {
         inputTextString.toUpperCase();
         System.out.println("Inside method: " + inputTextString);
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text here: ");
        String inputTextString = sc.nextLine();

        if(inputTextString.trim().isEmpty())
        {
            System.out.print("Invalid!!Please enter some text.");
            sc.close();
            return;
        }

        UpperCaseString obj = new UpperCaseString();
        obj.attemptUpperCase(inputTextString);

        System.out.println("Printing the text in main: " + inputTextString);

        sc.close();

    }
}
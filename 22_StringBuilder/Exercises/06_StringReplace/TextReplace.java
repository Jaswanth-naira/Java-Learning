import java.util.*;
class TextReplace 
{
    String replaceTextPortion(String inputText, int startIndex, int endIndex, String newText)
    {
           StringBuilder sb = new StringBuilder(inputText);
           sb.replace(startIndex,endIndex,newText);
           return sb.toString();       
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputText = sc.nextLine();

        if(inputText.trim().isEmpty()){
            System.out.println("Invalid Input!!! Please enter some text. ");
            sc.close();
            return;
        }

        System.out.println("Displaying input length you entered: " + inputText.length());

        System.out.print("Enter start index (0-based): ");
        int startIndex = sc.nextInt();

        System.out.print("Enter end index (0-based, exclusive): ");
        int endIndex = sc.nextInt();
        sc.nextLine();

        if(startIndex < 0 || endIndex < startIndex || startIndex > inputText.length() || endIndex > inputText.length()){
            System.out.println("Please enter valid indices between 0 and " + inputText.length() + ".");
            sc.close();
            return;
        }
        System.out.print("Enter replacement Text: ");
        String newText = sc.nextLine();

        if(newText.trim().isEmpty()){
            System.out.print("Please enter text to replace original input. ");
            sc.close();
            return;
        }        
        TextReplace replacer = new TextReplace();
        String modifiedText = replacer.replaceTextPortion(inputText,startIndex,endIndex,newText);

        System.out.println("Printing text after modification: " + modifiedText);
        sc.close();
        
    }
}
import java.util.*;
class ExclamationFormatter
{
     void addExclamationMarks(String str)
     {
          str = str + "!!!";
          System.out.println("string inside method: " +  str);
     }
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text here: ");

        String userInput = sc.nextLine();

        if(userInput.trim().isEmpty())
        {
            System.out.print("Please enter valid text.");
            return;
        }

        ExclamationFormatter obj = new ExclamationFormatter();
        obj.addExclamationMarks(userInput);
        System.out.println("String inside the main method : " + userInput);

        
     }
}
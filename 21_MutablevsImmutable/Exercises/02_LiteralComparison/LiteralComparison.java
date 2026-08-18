import java.util.*;
class LiteralComparison 
{
       void compareLiteral(String userInput)
       {

            System.out.println("Output for == " +
              (userInput == "java" ? "Both are equal" : "Both are not equal"));
                   

            System.out.println("Output for .equals() " +
            (userInput.equals("java") ? "Both are equal" : "Both are not equal"));
            
       }
       
       public static void main(String args[])
       {
           Scanner sc = new Scanner(System.in);

           System.out.print("Enter text here: ");

           String userInput = sc.nextLine();

           if(userInput.isEmpty())
           {
             System.out.print("Inavlid!!!Please enter some text.");
             return;
           }
           
           LiteralComparison obj = new LiteralComparison();
           obj.compareLiteral(userInput);
           sc.close();

       }
}
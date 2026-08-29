import java.util.*;
class RepeatedString
{
    void appendFiveTimes(String userInput)
    {
         StringBuilder sb = new StringBuilder();
         for(int i = 1 ; i <= 5; i++)
         {
             sb.append(userInput);
             System.out.println("Iteration " + i + ":");
             System.out.println(" Length: " + sb.length());
             System.out.println(" Capacity: " + sb.capacity());
         }
    }
    
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
                 
         System.out.print("Enter a word: ");

         String userInput = sc.nextLine();

         if(userInput.trim().isEmpty())
         {
            System.out.println("Invalid Input!!! Please enter a valid input.");
            sc.close();
            return;
         }

         RepeatedString appender = new RepeatedString();
         appender.appendFiveTimes(userInput);
         sc.close();
         
    }
}
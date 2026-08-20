import java.util.*;
class WordComparison
{
    boolean isSameObject(String firstText, String secondText)
    {
         return firstText == secondText;
    }

    boolean isSameContent(String firstText,String secondText)
    {
          return firstText.equals(secondText);
    }
    
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter text 1: ");
         String firstText = sc.nextLine();

         System.out.print("Enter text 2: ");
         String secondText = sc.nextLine();
         
         
         if(firstText.isEmpty() || secondText.isEmpty())
         {
            System.out.print("Invalid!!!Please enter some text.");
            sc.close();
            return;
         }

         WordComparison obj = new WordComparison();
         
         boolean objectResult = obj.isSameObject(firstText, secondText);
         boolean contentResult = obj.isSameContent(firstText, secondText);


         System.out.println("Same object in memory: " + objectResult);
         System.out.println("Same contents: " + contentResult); 

         sc.close();
    }
} 

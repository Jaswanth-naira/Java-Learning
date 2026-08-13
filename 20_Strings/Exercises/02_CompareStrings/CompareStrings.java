import java.util.*;
class CompareStrings 
{
    boolean areStringsEqual(String str1, String str2)
    {
        return str1.equals(str2);
    }
    
    
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter first string: ");
         String str1 = sc.nextLine();

         System.out.print("Enter second string: ");
         String str2 = sc.nextLine();

         if(!str1.matches("[a-zA-Z]+") || !str2.matches("[a-zA-Z]+"))
         {
              System.out.println("Please enter valid input string.");
              return;    
         }  
           
        CompareStrings obj = new CompareStrings();

        if(obj.areStringsEqual(str1,str2)){
            System.out.println("Both Strings are equal");
        }
        else {
           System.out.println("Both Strings are not equal");
        }
         
    }

}
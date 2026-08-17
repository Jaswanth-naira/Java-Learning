import java.util.*;
class AlternatingCaseUtils 
{
    String toAlternatingCase(String str)
    {
        String alternatingCaseString = "";
        boolean makeUpper  = true;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            
             if(Character.isLetter(ch)){
                 if(makeUpper){
                    ch = Character.toUpperCase(ch);
                 }
                 else {
                    ch = Character.toLowerCase(ch);
                 }

               makeUpper = !makeUpper;                  
                 
              } 

              alternatingCaseString = alternatingCaseString + ch;
            
        }

        return alternatingCaseString;
    }
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter any sentence: ");
         String str = sc.nextLine();
 
        if (str == null || str.trim().isEmpty()) {
            System.out.print("Please enter a valid input");
            sc.close();
            return;
        }
         
         AlternatingCaseUtils obj = new AlternatingCaseUtils();
         String alternativeCase = obj.toAlternatingCase(str);
         System.out.println("Alternating Case : " + alternativeCase);
    }
}
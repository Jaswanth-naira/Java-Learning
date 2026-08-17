import java.util.*;

class WordFormatter
{    
    String toTitleCase(String str)
       {
           boolean capitalizeNext = true;
           String result = "";
       
           for(int i = 0; i < str.length(); i++)
           {
               char ch = str.charAt(i);
       
               if(!Character.isLetter(ch)){
                   result = result + ch;
                   capitalizeNext = true;
               }
               else if(capitalizeNext){
                   result = result + Character.toUpperCase(ch);
                   capitalizeNext = false;
               }
               else{
                   result = result + ch;
               }
           }
           return result;
       }
    
           
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text here: ");

        String str = sc.nextLine();

        WordFormatter obj = new WordFormatter();
        String formattedText = obj.toTitleCase(str);
        System.out.print(formattedText);
    }
} 

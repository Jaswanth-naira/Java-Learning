import java.util.*;
class NoOfWords 
{
    int countWords(String str)
    {
         if(str == null || str.isEmpty()){
             return 0;
         }
         
         boolean inWord = false;
         int count = 0;
         
         for(int i = 0; i < str.length(); i++)
         {
             char ch = str.charAt(i);

             if(!Character.isWhitespace(ch)){
                  if(!inWord)
                  {
                      count = count + 1;
                      inWord = true;
                  }
             }
             else {
                  inWord = false;
             }
         }
        return count;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any sentence: ");
        String str = sc.nextLine();

        NoOfWords obj = new NoOfWords();
        int wordCount = obj.countWords(str);
        System.out.println("The total count of words in the sentence : " + wordCount);
    }
}
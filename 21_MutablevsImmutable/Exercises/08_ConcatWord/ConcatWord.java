import java.util.*;
class ConcatWord 
{
    void doubleWord(String word)
    {
        word = word.concat(word);
        System.out.println("Printing word after concatenation. " + word);
        
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your word here: ");
        String word = sc.nextLine();

        if(word.trim().isEmpty())
        {
            System.out.print("Invalid!!! Please enter word.");
            sc.close();
            return;
        }
      
        ConcatWord obj = new ConcatWord();
        obj.doubleWord(word);

        System.out.println("Printing word after method call: " + word);
        sc.close();
    }
}
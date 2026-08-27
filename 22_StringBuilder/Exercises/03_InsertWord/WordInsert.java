import java.util.*;
class WordInsert 
{
    String insertWordAtStart(String text, String word)
    {
        StringBuilder sb = new StringBuilder(text);
        sb.insert(0, word + " ");
        return sb.toString();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        System.out.print("Enter word you would like to insert: ");
        String word = sc.nextLine();

        if(text.trim().isEmpty() || word.trim().isEmpty())
        {
            System.out.print("Invalid input!!! Please enter valid input.");
            sc.close();
            return;
        }

        WordInsert inserter = new WordInsert();
        String updatedText = inserter.insertWordAtStart(text,word);
        System.out.println("Text after inserting word at beginning: " + updatedText);
        sc.close();
    }
}

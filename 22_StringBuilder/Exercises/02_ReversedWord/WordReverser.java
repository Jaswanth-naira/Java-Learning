import java.util.*;
class WordReverser 
{
    String reverse(String originalWord)
    {
         StringBuilder sb  = new StringBuilder(originalWord);
         return sb.reverse().toString();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String originalWord = sc.nextLine();

        if(originalWord.trim().isEmpty())
        {
            System.out.print("Invalid!!!Please enter some text.");
            sc.close();
            return;
        }

        WordReverser reverser = new WordReverser();
        String finalWord = reverser.reverse(originalWord);

        System.out.println("Printing the reversed word: " + finalWord);
        sc.close();
    }
}
import java.util.*;
class RepetitionOfLetter 
{
    int countOccurrencesOfA(String inputText)
    {
        int count = 0;
        for(int i = 0; i < inputText.length(); i++)
        {
              if(inputText.charAt(i) == 'a') count++;
        }

        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String inputText = sc.nextLine();

        if(inputText.trim().isEmpty())
        {
            System.out.print("Invalid!! Please enter some text. ");
            sc.close();
            return;
        }

        RepetitionOfLetter repetitionCounter = new RepetitionOfLetter();
        int totalCount = repetitionCounter.countOccurrencesOfA(inputText);
        System.out.print("The no of times letter 'a' present in text: " + totalCount);
        sc.close();
    }
}
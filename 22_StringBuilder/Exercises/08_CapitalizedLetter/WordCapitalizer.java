import java.util.*;
class WordCapitalizer
{
    String capitalizeEachWord(String userInput)
    {
          StringBuilder resultBuilder = new StringBuilder(userInput.length());

          boolean waitingForLetter = true;

          for(int i = 0 ; i < userInput.length(); i++)
          {
               char currentChar = userInput.charAt(i);

               if (Character.isWhitespace(currentChar)){
                  waitingForLetter = true;
                  resultBuilder.append(currentChar);
               } else if(waitingForLetter && Character.isLetter(currentChar)){
                  resultBuilder.append(Character.toUpperCase(currentChar));
                  waitingForLetter = false;
               } else {
                  resultBuilder.append(currentChar);
               }
          }
          
          return resultBuilder.toString();
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = sc.nextLine();

        if(userInput.trim().isEmpty()){
            System.out.println("Invalid Input!!!Please enter a valid input.");
            sc.close();
            return;
        }

        WordCapitalizer firstLetterCapitalizer = new WordCapitalizer();
        String capitalizedSentence = firstLetterCapitalizer.capitalizeEachWord(userInput);
        System.out.println("Printing the modified text: " + capitalizedSentence);
        sc.close();
    }
}
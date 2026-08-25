import java.util.*;
class ExclamationAppender
{     
      void appendExclamationMarks(StringBuilder sb)
      {
        sb.append("!!!");
        System.out.println("Inside method: " + sb);
      }
      
      public static void main(String args[])
      {
           Scanner sc = new Scanner(System.in);

           System.out.print("Enter the text: ");
           String inputWord = sc.nextLine();

           if(inputWord.trim().isEmpty()){
                System.out.print("Invalid Input!!! Please enter some text.");
                sc.close();
                return;  
           }
           
           StringBuilder word = new StringBuilder(inputWord);
           ExclamationAppender appender = new ExclamationAppender();
           appender.appendExclamationMarks(word);

           System.out.println("Back in main : " + word);
           sc.close();
      }
}
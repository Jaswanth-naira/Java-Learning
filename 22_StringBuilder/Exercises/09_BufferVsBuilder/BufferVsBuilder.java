import java.util.*;
class BufferVsBuilder 
{
    void appendAndDisplay(String word)
    {
        StringBuilder builder = new StringBuilder("Builder Result: ");
        StringBuffer buffer = new StringBuffer("Buffer Result: ");

        builder.append(word);
        buffer.append(word);

        System.out.println(builder);
        System.out.println(buffer);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input word: ");
        String word = sc.nextLine();
        
        if(word.trim().isEmpty())
        {
            System.out.print("Invalid input!!! Please enter a valid input.");
            sc.close();
            return;
        }

        BufferVsBuilder appender = new BufferVsBuilder();
        appender.appendAndDisplay(word);
        sc.close();
    }
}
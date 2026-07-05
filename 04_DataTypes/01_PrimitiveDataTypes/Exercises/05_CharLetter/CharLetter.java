import java.util.*;
class CharLetter 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter letter 1: ");
        int input1 = sc.nextInt();
        char firstLetter = (char) input1;

        System.out.println("Enter letter 2: ");
        int input2 = sc.nextInt();
        char secondLetter = (char) input2;

        System.out.println("Enter letter 3: ");
        int input3 = sc.nextInt();
        char thirdLetter = (char) input3;

        System.out.println("Enter letter 4: ");
        int input4 = sc.nextInt();
        char fourthLetter = (char) input4;

        System.out.println(firstLetter);
        System.out.println(secondLetter);
        System.out.println(thirdLetter);
        System.out.println(fourthLetter);
        
        /*
        char ch = 65;
        System.out.println(ch);

        Even though you assign a plain integer (65, 97, 98, 122) to a char variable — with no casting syntax at all — Java allows it directly. This is because:
        char is internally just a 16-bit unsigned integer representing a Unicode code point.As long as the number fits within char's range
        (0 to 65535) and is a compile-time constant (like a literal 65), Java automatically treats it as valid — no explicit cast needed.
        When you println() a char, Java doesn't print the number — it prints the character that number maps to in the Unicode/ASCII table.1
        */
    }
}
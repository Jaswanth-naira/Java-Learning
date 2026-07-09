import java.util.*;
class CharToIntConversion 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");

        char ch = sc.next().charAt(0);
        int input = ch;   
        System.out.println(input);   // prints 90 unicode value
        

    }
}
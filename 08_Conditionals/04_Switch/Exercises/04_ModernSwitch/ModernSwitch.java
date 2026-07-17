import java.util.*;
class ModernSwitch 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks from 0 to 100: ");
        int marks = sc.nextInt(); 
        String result = switch(marks) {
            default -> {
                int category = marks /10;

                yield switch(category)
                {
                    case 10,9 -> "A";
                    case 8    -> "B";
                    case 7    -> "C";
                    case 6    -> "D";
                    default   -> "F";
                };
            }
        };
      System.out.println("Grade: "+result);        
    }
}   
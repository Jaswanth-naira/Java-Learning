import java.util.*;
class Day 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the day: ");
        String dayName = sc.next();

        switch(dayName)
        {
             case "Monday":
             case "Tuesday":
             case "Wednesday":
             case "Thursday":
             case "Friday": System.out.println("Weekday");
                            break;
             case "Saturday":
             case "Sunday": System.out.println("Weekend");
             
        }
    }
}
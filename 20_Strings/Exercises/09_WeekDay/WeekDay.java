import java.util.*;
class WeekDay 
{
    String getWeekDayName(int dayNumber)
    {
          String[] allDays = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"}; 
          
          return allDays[(dayNumber - 1) % 7];
    }
    
    
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

         System.out.print("Please enter daynumber in a month (1- 31): ");
         int dayNumber = sc.nextInt();
         sc.nextLine();
         
         if(dayNumber <= 0 || dayNumber > 31)
         {
            System.out.println("Invalid day Number!!! Please a enter valid day in a month");
            return;
         }

         WeekDay obj = new WeekDay();
         String nameOfDay = obj.getWeekDayName(dayNumber);
         System.out.println("Weekday name is: " + nameOfDay);
        
    }
}
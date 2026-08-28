import java.util.*;
class NumberSeries 
{
    String buildNumberSeries(int number)
    {
       StringBuilder sb = new StringBuilder();  
       
       for(int i = 1; i <= number; i++)
       {
           if(sb.length() > 0) sb.append(",");
           sb.append(i);
       }
       return sb.toString();
    }
    
    
    public static void main(String args[])
    {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter a number: ");

          int number = sc.nextInt();
          
          if(number < 1)
          {
             System.out.println("Invalid range!!! Please enter a valid input.");
             sc.close();
             return;
          }

          NumberSeries seriesBuilder = new NumberSeries();
          String series = seriesBuilder.buildNumberSeries(number);
          System.out.println(series); 
          sc.close();
    }
}
import java.util.*;
class TemperatureConversion 
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the temperature in celsius: ");
         double celsius = sc.nextDouble();
         double value =(celsius*9/5)+32;
         System.out.println(value);
    }
}
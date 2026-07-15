import java.util.*;
class WeightCalculator 
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the bmi: ");
      double input = sc.nextDouble();

      if (input < 18.5)
      {
        System.out.println("Underweight");
      }
      else if (input <= 24.9)
      {
        System.out.println("Normal");
      }
      else if (input <= 29.9)
      {
        System.out.println("Overweight");
      }
      else 
      {
        System.out.println("Obese");
      }
    }
}
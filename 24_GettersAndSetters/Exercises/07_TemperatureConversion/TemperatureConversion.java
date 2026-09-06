import java.util.Scanner;
class Temperature 
{
    private double celsius;

    boolean setCelsius(double c)
    {
         if(c < -273.15) return false;

         celsius = c;
         return true;
    }


    boolean setFahrenheit(double f)
    {
          if(f < -459.67) return false;
          
          celsius = (f - 32) * 5/9;
          return true;
    }

    double getCelsius()
    {
        return celsius;
    }

    double getFahrenheit()
    {
        return (getCelsius()*9/5) + 32;
    }
}
class TemperatureConversion 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Temperature temperature = new Temperature();

        
        System.out.print("Enter temperature : ");
    
        if(!scanner.hasNextDouble()){
            System.out.print("Invalid Input! Please enter a valid numerical data.");
            scanner.close();
            return;
        }

        double celsius = scanner.nextDouble();
        
        if(!temperature.setCelsius(celsius)){
            System.out.println("Temperature cannot be below under -273.15℃");
            scanner.close();
            return;
        } 
        
        System.out.println("\n------DISPLAYING TEMPERATURE IN CELSIUS TO FAHRENHEIT------"); 
        System.out.printf("celsius: %.2f\u00B0C%n", temperature.getCelsius());
        System.out.printf("Fahrenheit: %.2f\u00B0F%n", temperature.getFahrenheit());

        System.out.println();
        System.out.print("Enter temperature in fahrenheit: ");
        
        if(!scanner.hasNextDouble()){
            System.out.print("Invalid Input! Please enter a valid numerical data.");
            scanner.close();
            return;
        }

        double fahrenheit = scanner.nextDouble();
        
        if(!temperature.setFahrenheit(fahrenheit)){
            System.out.println("Temperature cannot be below under -459.67℉");
            scanner.close();
            return;
        }

         System.out.println("\n------DISPLAYING TEMPERATURE IN FAHRENHEIT TO CELSIUS------"); 
         System.out.printf("Fahrenheit: %.2f\u00B0F%n", temperature.getFahrenheit());
         System.out.printf("celsius: %.2f\u00B0C%n", temperature.getCelsius());
        
    }
}
package app;
public class FahrenheitSensor implements TemperatureSensor 
{
      private final int fahrenheit; 

      private static final int FREEZING_F = 32;
      private static final int C_PARTS = 5;
      private static final int F_PARTS = 9;
     
      public FahrenheitSensor(int fahrenheit)
      {
          this.fahrenheit = fahrenheit;
      }

      @Override
      public int celsius()
      {
         return (fahrenheit - FREEZING_F) * C_PARTS / F_PARTS;
      }
}
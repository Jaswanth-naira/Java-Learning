package app;
import java.util.Arrays;
public class TemperatureLog 
{
    private final int[] readings;   
    public TemperatureLog(int[] readings)
    {
         if(readings == null)
         {
          this.readings = new int[0];
         }
         else 
         {
            this.readings = Arrays.copyOf(readings, readings.length);
         }
    }

    public int count(ReadingCheck check)
    {
        if(check == null)
        {
            return 0;
        }
        int matches = 0;

        for(int reading: readings)
        {
             if(check.passes(reading)) matches ++;
        }
        return matches;
    }
}
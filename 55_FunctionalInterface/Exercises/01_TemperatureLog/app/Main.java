package app;
public class Main 
{
    private static final int HOT_THRESHOLD = 25;
    public static void main(String[] args)
    {
        ReadingCheck aboveFreezing = new AboveFreezing();
        System.out.println("5 above freezing: " + aboveFreezing.passes(5));
        System.out.println("0 above freezing: " + aboveFreezing.passes(0));
        System.out.println("-3 above freezing: " + aboveFreezing.passes(-3));
        
        int[] readings = {12, -4, 0, 31, 7, -1, 25};
        TemperatureLog log = new TemperatureLog(readings);
        System.out.println("Readings above freezing: " + log.count(aboveFreezing));
        ReadingCheck hot = new ReadingCheck()
        {
            @Override 
            public boolean passes(int reading)
            {
                return reading >= HOT_THRESHOLD;
            }
        };

        System.out.println("Hot readings: " + log.count(hot));

        System.out.println("Readings below freezing: " + log.count(new ReadingCheck()
        {
            @Override
            public boolean passes(int reading)
            {
                return reading < FREEZING_POINT;
            }
        }));
    }
}
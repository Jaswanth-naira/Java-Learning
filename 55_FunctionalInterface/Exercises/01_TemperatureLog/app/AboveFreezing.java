package app;
public class AboveFreezing implements ReadingCheck 
{    
     @Override
     public boolean passes(int reading)
     {
        return reading > FREEZING_POINT;
     }
}
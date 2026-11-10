package app;
public class SmartWatch extends Device implements FitnessTracker,Rechargeable 
{
    private final int stepCount;
    private final int batteryPercent;

    private static final int STEPS_PER_CALORIE = 20;
    private static final int HOURS_PER_FULL_CHARGE = 48;

    public SmartWatch(String brand, int stepCount,int batteryPercent)
    {
        super(brand);
        this.stepCount = stepCount;
        this.batteryPercent = batteryPercent;
    }
    
    
    @Override
    public int steps()
    {
        return stepCount;
    }
    
    
    @Override
    public int caloriesBurned()
    {
       return stepCount / STEPS_PER_CALORIE;         
    }

    @Override 
    public int hoursLeft()
    {
        return batteryPercent * HOURS_PER_FULL_CHARGE / FULL_CHARGE;
    }


}
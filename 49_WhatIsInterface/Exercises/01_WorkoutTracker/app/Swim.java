package app;

public class Swim implements Workout 
{
    private final int laps;

    private static final int CALORIES_PER_LAP = 8;

    public Swim(int laps)
    {
        this.laps = laps;
    }

    @Override 
    public int calories()
    {
        return laps * CALORIES_PER_LAP;
    }
    
    @Override
    public String name()
    {
        return "Swim";
    }

}
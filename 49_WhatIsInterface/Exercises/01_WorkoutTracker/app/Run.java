package app;
public class Run implements Workout 
{
    private final int distance;
    private static final int CALORIES_PER_KM = 60;

    public Run(int distance)
    {
        this.distance = distance;
    }

    @Override
    public int calories()
    {
        return distance * CALORIES_PER_KM;
    }


    @Override
    public String name()
    {
        return "Run";
    }
}
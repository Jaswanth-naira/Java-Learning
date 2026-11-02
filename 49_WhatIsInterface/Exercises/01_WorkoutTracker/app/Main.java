package app;

public class Main 
{
    public static int totalCalories(Workout[] workouts)
    {
        int sum = 0;
        for(Workout workout: workouts)
        {
            sum += workout.calories();
        }

        return sum;
    }

    public static boolean goalReached(Workout[] workouts)
    {
        return totalCalories(workouts) >= Workout.DAILY_GOAL;
    }

    public static void main(String[] args)
    {
        Workout run = new Run(5);
        Workout swim = new Swim(20);
        int yogaCalories = 120;
        Workout yoga = new Workout() {
        @Override 
        public int calories()
        {
            return yogaCalories;
        }

        @Override 
        public String name()
        {
            return "Yoga";
        }
        };
        Workout[] today = { run, swim, yoga };
        System.out.println("Daily goal: " + Workout.DAILY_GOAL);

        for(Workout workout: today)
        {
            System.out.println(workout.name() + ": " + workout.calories());
        }

        System.out.println("Total calories: " + totalCalories(today));
        System.out.println("Goal reached: " + goalReached(today));
        Workout[] lightDay = { new Swim(10), yoga};
        System.out.println("Light day total: " + totalCalories(lightDay));
        System.out.println("Light day goal reached: " + goalReached(lightDay));
    }
}
package app;
public class Main 
{
     public static int totalSteps(StepCounter[] counters)
     {
         int sum = 0;
         for(StepCounter counter: counters)
         {
             sum += counter.steps();
         }
         return sum;
     }

    public static void main(String[] args)
    {
        SmartWatch pulse = new SmartWatch("Pulse", 8250, 65);
        SmartWatch stride = new SmartWatch("Stride", 4120, 30);

        Device device = pulse;
        StepCounter counter = pulse;
        FitnessTracker tracker = pulse;
        Rechargeable battery = pulse;

        System.out.println("Brand: " + device.getBrand());
        System.out.println("Steps: " + counter.steps());
        System.out.println("Tracker steps: " + tracker.steps());
        System.out.println("Calories: " + tracker.caloriesBurned());
        System.out.println("Hours left: " + battery.hoursLeft());

        Rechargeable strideBattery = stride;
        System.out.println("Stride hours left: " + strideBattery.hoursLeft());
        
        StepCounter[] counters = { pulse, stride};
        System.out.println("Total steps: " + totalSteps(counters));
        
    
    
    }

}
 
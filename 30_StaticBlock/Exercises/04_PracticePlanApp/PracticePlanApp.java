class PracticePlan 
{
    static private int[] defaultMinutes ={30,-10,150};
    static private int initializationCount;
    private int[] minutes;
    
    static int normalizeMinutes(int n)
    {
        if(n > 0 && n <= 120) return n;
        n = 45;
        return n;
    }

    static 
    {
        for(int i = 0; i < defaultMinutes.length; i++)
        {
            int value = normalizeMinutes(defaultMinutes[i]);
            defaultMinutes[i] = value;
        }
        initializationCount++;
    }

    PracticePlan()
    {
         minutes = new int[defaultMinutes.length];  
         for(int i = 0; i < defaultMinutes.length; i++)
         {
             minutes[i] = defaultMinutes[i];
         }      
    }

    static boolean updateDefaultMinutes(int index, int duration)
    {
          if(index >= defaultMinutes.length || index < 0 || !(duration > 0 && duration <= 120)) return false;
          defaultMinutes[index] = duration;
          return true;
    }

    boolean updateMinutes(int index, int duration)
    {   
        if(index >= minutes.length || index < 0 || !(duration > 0 && duration <= 120)) return false;
          minutes[index] = duration;
          return true;
    }

    int getMinutes(int index)
    {
        if(index < 0 || index >= minutes.length) return -1;
        return minutes[index];
    }

    static int getDefaultMinutes(int index)
    {
        if(index < 0 || index >= defaultMinutes.length) return -1;
        return defaultMinutes[index];
    }

    static int getInitializationCount()
    {
        return  initializationCount;
    }
}
class PracticePlanApp
{
    public static void main(String[] args)
    {
        System.out.println("Initial Defaults: " + PracticePlan.getDefaultMinutes(0) + ", "
         + PracticePlan.getDefaultMinutes(1) + ", " + PracticePlan.getDefaultMinutes(2));
        System.out.println("Initialization count: " + PracticePlan.getInitializationCount());
        PracticePlan first = new PracticePlan();
        System.out.println("Default update: " + PracticePlan.updateDefaultMinutes(0,60));
        PracticePlan second = new PracticePlan();
        System.out.println("first plan update: " + first.updateMinutes(1,90));
        System.out.println("Invalid default update: " + PracticePlan.updateDefaultMinutes(2,0));
        System.out.println("First: " + first.getMinutes(0) + ", " + first.getMinutes(1) + ", " + first.getMinutes(2));
        System.out.println("Second: " + second.getMinutes(0) + ", " + second.getMinutes(1) + ", " + second.getMinutes(2));
        System.out.println("Current defaults: " + PracticePlan.getDefaultMinutes(0) + ", " + PracticePlan.getDefaultMinutes(1) + ", " + 
        PracticePlan.getDefaultMinutes(2));
        System.out.println("Initialization count: " + PracticePlan.getInitializationCount());

    }
}
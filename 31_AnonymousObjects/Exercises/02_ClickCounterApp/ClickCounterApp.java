class ClickCounter 
{
    private int count;
    private static int createdCount = 0;

    ClickCounter()
    {
        this.count = 0;
        createdCount++;
    }

    int incrementAndGet()
    {
        this.count = count + 1;
        return count;
    }

     int getCount()
    {
        return count;
    }
    
    static int getCreatedCount()
    {
          return createdCount;
    } 
}
class ClickCounterApp 
{
    public static void main(String[] args)
    {
         System.out.println("Created initially: " + ClickCounter.getCreatedCount());
         System.out.println("Anonymous increment: " + new ClickCounter().incrementAndGet());
         System.out.println("Fresh counter value: " + new ClickCounter().getCount());
         System.out.println("Another anonymous increment: " + new ClickCounter().incrementAndGet());
         ClickCounter storedCounter = new ClickCounter();
         System.out.println("Stored first increment: " + storedCounter.incrementAndGet());
         System.out.println("Stored second increment: " + storedCounter.incrementAndGet());
         System.out.println("Stored counter value: " + storedCounter.getCount());
         System.out.println("Created finally: " + ClickCounter.getCreatedCount());
    }
}
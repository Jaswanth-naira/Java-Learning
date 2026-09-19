class GamePlayer
{
    private String name;
    private int remainingLives;
    private static int defaultLives = 3;
    
    GamePlayer(String name)
    {
        this.name = name;
        this.remainingLives = defaultLives;
    }

    boolean updateDefaultLives(int currentDefault)
    {
        if(!(currentDefault >=1 && currentDefault <=5)) return false;
        GamePlayer.defaultLives = currentDefault; 
        return true;
    }

    boolean removeOneLife()
    {
        if(this.remainingLives <= 0) return false;
        this.remainingLives--;
        return true;
    }

    void resetPlayerLifeToDefault()
    {
        this.remainingLives = defaultLives;
    }
   
    String getName()
    {
        return name;
    }

    int getRemainingLives()
    {
        return remainingLives;
    }

    int getPlayerDefaultLives()
    {
        return defaultLives;
    }
}
class PlayerLivesApp
{
    public static void main(String[] args)
    {
        GamePlayer first = new GamePlayer("Anika");
        GamePlayer second = new GamePlayer("Ravi");

        System.out.println("Before change: ");
        System.out.println(first.getName() + ": " + first.getRemainingLives());
        System.out.println(second.getName() + ": " + second.getRemainingLives());
        System.out.println("Life lost: " + first.removeOneLife());
        System.out.println("Default update: " + second.updateDefaultLives(5));
        GamePlayer third = new GamePlayer("Maya");
        System.out.println("Current default: " + second.getPlayerDefaultLives());
        System.out.println("After default change: ");
        System.out.println(first.getName() + ": " + first.getRemainingLives());
        System.out.println(second.getName() + ": " + second.getRemainingLives());
        System.out.println(third.getName() + ": " + third.getRemainingLives());
        first.resetPlayerLifeToDefault();
        System.out.println("After resetting " + first.getName() + ": ");
        System.out.println(first.getName() + ": " + first.getRemainingLives());
        System.out.println(second.getName() + ": " + second.getRemainingLives());
        System.out.println(third.getName() + ": " + third.getRemainingLives());

    }
}
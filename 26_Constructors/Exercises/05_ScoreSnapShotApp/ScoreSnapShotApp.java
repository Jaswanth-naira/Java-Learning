class Player
{
    private String name;
    private int score;

    Player(String name, int score)
    {
         this.name = name;
         this.score = score;
    }

    boolean updateScore(int score)
    {
        if (score < 0) return false;
        this.score = score;
        return true;
    }

    String getName()
    {
        return name;
    } 

    int getScore()
    {
        return score;
    }
}
class ScoreSnapShot 
{
     private String playerName;
     private int score;

     ScoreSnapShot(Player player)
     {
        this.playerName = player.getName();
        this.score = player.getScore();
     }

     String getName()
     {
         return playerName;
     }

     int getScore()
     {
        return score;
     }

}
class ScoreSnapShotApp 
{
    public static void main(String args[])
    {
         Player player = new Player("Anika",50);
         ScoreSnapShot firstSnapShot = new ScoreSnapShot(player);
         System.out.println("Update to 75: " + player.updateScore(75));
         ScoreSnapShot secondSnapShot = new ScoreSnapShot(player);
         System.out.println("Update to -5: " + player.updateScore(-5));
         System.out.println("Current player: " + player.getName() + ", " + player.getScore());
         System.out.println("First snapshot: " + firstSnapShot.getName() + ", " + firstSnapShot.getScore());
         System.out.println("Second snapshot: " + secondSnapShot.getName() + ", " + secondSnapShot.getScore());
 
    }
}
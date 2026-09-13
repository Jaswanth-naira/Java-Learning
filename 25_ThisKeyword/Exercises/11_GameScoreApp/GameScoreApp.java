import java.util.Scanner;
class Player 
{
    private String name;
    private int score;

   boolean setName(String name)
   {
        if(name == null || name.trim().isEmpty()) return false;
        this.name = name.trim();
        return true;
   }

   boolean setScore(int score)
   {
        if(score < 0) return false;
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

   boolean attemptPlayerConnection(Scoreboard scoreboard)
   {
       if(scoreboard == null) return false;
       return scoreboard.storePlayer(this);
   }

   Player getCurrentPlayer()
   {
       return this;
   }

}

class Scoreboard 
{
   private Player player;
   
   boolean storePlayer(Player player)
   {
       if(player == null) return false;
       this.player = player;
       return true;
   }

   String returnPlayerName()
   {
       if(player == null) return null;
       return player.getName();
   }

   int returnScore()
   {
       return player.getScore();
   }

}
class GameScoreApp
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Scoreboard scoreboard = new Scoreboard();
        System.out.print("Enter player name: ");    
        String playerName = scanner.nextLine();
        if(!player.setName(playerName))
        {
            System.out.print("player name cannot be empty.");
            scanner.close();
            return;
        }
        
        System.out.print("Enter player score: ");
        if(!scanner.hasNextInt()){
            System.out.print("Invalid Input! Please enter valid numeric data.");
            scanner.close();
            return;
        }
        int playerScore = scanner.nextInt();
        if(!player.setScore(playerScore))
        {
            System.out.print("Score cannot be negative.");
            scanner.close();
            return;
        }

       
        boolean result = player.attemptPlayerConnection(scoreboard);

        if(!result){
            System.out.println("Assignment failed.");
            scanner.close();
            return;
        }
        else{
        System.out.println("Before update: ");
        System.out.println("Player: " + scoreboard.returnPlayerName());
        System.out.println("Score: " + scoreboard.returnScore());
        }
        System.out.print("Enter new score: ");
        if(!scanner.hasNextInt()){
            System.out.println("Score update rejected.Please enter a valid integer.");
            System.out.println("Player: " + scoreboard.returnPlayerName());
            System.out.println("Score: " + scoreboard.returnScore());
            scanner.close();
            return;
        }

        int newScore = scanner.nextInt();
        
        if(!player.setScore(newScore)){
            System.out.println("Score update rejected.Score cannot be negative.");
            System.out.println("Player: " + scoreboard.returnPlayerName());
            System.out.println("Score: " + scoreboard.returnScore());
        }
        else 
        {
            System.out.println("After update: ");
            System.out.println("Player: " + scoreboard.returnPlayerName());
            System.out.println("Score: " + scoreboard.returnScore());
        }
        
        
        Player samePlayer = player.getCurrentPlayer(); 
        
        System.out.println(player == samePlayer);

        samePlayer.setScore(75);
        System.out.println(player.getScore());
        System.out.println(samePlayer.getScore());

        
        boolean scoreUpdated = player.getCurrentPlayer().setScore(90);
        System.out.println(scoreUpdated);
        System.out.println(player.getScore());
        System.out.println(samePlayer.getScore());
        scanner.close();
    }
}
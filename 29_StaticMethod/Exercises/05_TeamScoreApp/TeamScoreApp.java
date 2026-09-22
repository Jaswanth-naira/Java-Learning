class Player
{
     private String name;
     private int score;

     Player(String name, int score)
     {
         this.name = name;
         this.score = score;
     }

     boolean setScore(int incomingScore)
     {
         if(incomingScore < 0 || incomingScore > 100) return false;
         this.score = incomingScore;
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
class TeamTools 
{
    static Player findTopPlayer(Player[] players)
    {
         Player topPlayer = null;
         if(players == null)
         {
             return null;
         }
         for(int i = 0; i < players.length; i++)
         {
             if(players[i] == null) continue;
             if(topPlayer ==  null) {
                topPlayer = players[i];
             }

             else if(players[i].getScore() > topPlayer.getScore()) {
                 topPlayer = players[i];
             }
         }
        return topPlayer;
    }
    
    static boolean awardBonus(Player[] player, int bonus)
    {
        if(bonus <= 0 || bonus > 100 ||  player ==  null) return false;
        boolean foundPlayer = false;

        for(int i = 0; i < player.length; i++)
        {
            if(player[i] == null) continue;
            foundPlayer = true;

            if(player[i].getScore() + bonus > 100)
            {
                 return false;
            }

        }
        if(!foundPlayer) return false;

        for(int i = 0; i < player.length; i++)
        {
            if(player[i] ==  null) continue;
            int currentscore = player[i].getScore() + bonus;
            player[i].setScore(currentscore);
        }
        return true;

    }


}

class TeamScoreApp
{
    public static void main(String[] args)
    {
        Player first = new Player("Anika", 60);
        Player second = new Player("Ravi", 80);
        Player third = new Player("Maya", 80);
        
        Player[] player = {null,first,second,null,third};
        Player topPlayer = TeamTools.findTopPlayer(player);
        if(topPlayer != null)
        {
        System.out.println("Initial top: " + topPlayer.getName() + ", " + topPlayer.getScore());
        }
        System.out.println("Top is Ravi object: " + (topPlayer == second));
        System.out.println("Bonus 10: " + TeamTools.awardBonus(player,10));
        System.out.println("Bonus 15: " + TeamTools.awardBonus(player,15));
        System.out.println(first.getName() + ": " + first.getScore());
        System.out.println(second.getName() + ": " + second.getScore());
        System.out.println(third.getName() + ": " + third.getScore());
        System.out.println("Bonus 0: " + TeamTools.awardBonus(player,0));
        System.out.println("Ravi update: " + second.setScore(50));
        topPlayer = TeamTools.findTopPlayer(player);
        if(topPlayer != null)
        {
            System.out.println("New top: " + topPlayer.getName() + ", " + topPlayer.getScore());  
        }
        Player[] missingTeam = null;
        Player[] emptyTeam = new Player[0];
        Player[] allNullTeam = {null, null};
        System.out.println("Missing team top: " + (TeamTools.findTopPlayer(missingTeam) == null)); 
        System.out.println("Empty team top: " + (TeamTools.findTopPlayer(emptyTeam) == null));
        System.out.println("All-null team top: " + (TeamTools.findTopPlayer(allNullTeam) == null));  
        System.out.println("All-nulll team bonus: " + (TeamTools.awardBonus(allNullTeam,5)));     

    }
}
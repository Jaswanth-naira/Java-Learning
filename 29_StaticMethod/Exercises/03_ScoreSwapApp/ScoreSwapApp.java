class Player
{
    private  String name;
    private  int score;

    Player(String name,int score)
    {
        this.name = name;
        this.score = score;
    }
    boolean setScore(int incomingScore)
     {
        if(incomingScore < 0) return false;
        this.score =  incomingScore;
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

class ScoreTools 
{
     static boolean swapScores(Player playerOne, Player playerTwo)
     {
        if(playerOne == null || playerTwo == null || playerOne == playerTwo) return false;
        int playerOneScore = playerOne.getScore(); 
        int playerTwoScore = playerTwo.getScore();
        playerOne.setScore(playerTwoScore);   
        playerTwo.setScore(playerOneScore);     
        return true;

     }
}
class ScoreSwapApp
{
    public static void main(String[] args)
    {
        Player first = new Player("Anika", 40);
        Player second = new Player("Ravi", 75);
        System.out.println("Before swap: ");
        System.out.println(first.getName() + ": " + first.getScore());
        System.out.println(second.getName() + ": " + second.getScore());
        System.out.println("Swap result: " + ScoreTools.swapScores(first,second));
        System.out.println("After swap: ");
        System.out.println(first.getName() + ": " + first.getScore());
        System.out.println(second.getName() + ": " + second.getScore());
        System.out.println("Same player swap: " + ScoreTools.swapScores(first,first));
        System.out.println("Missing first player: " + ScoreTools.swapScores(null,second));
        System.out.println("Missing second player: " + ScoreTools.swapScores(first,null));
        System.out.println("Final: ");
        System.out.println(first.getName() + ": " + first.getScore());
        System.out.println(second.getName() + ": " + second.getScore());
    }
}
import java.util.Scanner;
class GamePlayer
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
        if(score < 0 ) return false;
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

    boolean hasHigherScoreThan(GamePlayer otherPlayer)
    {
        if(otherPlayer == null) return false;
        
        return this.score > otherPlayer.getScore(); 

    }
}
class HighestGameScore 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        GamePlayer playerOne = new GamePlayer();
        GamePlayer playerTwo = new GamePlayer();

        System.out.print("Enter playerOne name: ");

        String firstPlayerName = scanner.nextLine();
        
           if(!playerOne.setName(firstPlayerName)){
            System.out.println("Player name cannot be blank.");
            scanner.close();
            return;
        }
        
        System.out.print("Enter playerOne score: ");
        if(!scanner.hasNextInt()){
            System.out.print("Invalid Input! Please enter a valid number.");
            scanner.close();
            return;
        }

        int firstPlayerScore = scanner.nextInt();
        scanner.nextLine();

        if(!playerOne.setScore(firstPlayerScore)){
            System.out.println("Score cannot be negative.");
            scanner.close();
            return;
        }
       
       
        System.out.print("Enter playerTwo name: ");

        String secondPlayerName = scanner.nextLine();

        if(!playerTwo.setName(secondPlayerName)){
            System.out.println("Player name cannot be blank.");
            scanner.close();
            return;
        }

        System.out.print("Enter playerTwo score: ");

        if(!scanner.hasNextInt()){
            System.out.print("Invalid Input! Please enter a valid number.");
            scanner.close();
            return;
        }
        
        int secondPlayerScore = scanner.nextInt();
        
        if(!playerTwo.setScore(secondPlayerScore)){
            System.out.println("Score cannot be negative.");
            scanner.close();
            return;
        }
       
       boolean playerOneHasHigherScore = playerOne.hasHigherScoreThan(playerTwo);
       
       if(!playerOneHasHigherScore){
            if(playerOne.getScore() == playerTwo.getScore()){
                System.out.println("Tie");
            }
            else
            {
                 System.out.println("Winner: " + playerTwo.getName());
            }
       }
       else{
            System.out.println("Winner: " + playerOne.getName());
       }
        scanner.close();
    }
}
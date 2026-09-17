class ScoreCard
{
     private int[] scores;

     ScoreCard()
     {
         this(new int[0]);
     }

     ScoreCard(int[] scores)
     {
         int[] arr = new int[scores.length];
         this.scores = arr;
         for(int i = 0; i < scores.length; i++)
         {
              arr[i] = scores[i];
         }
     }

     ScoreCard(ScoreCard other)
     {
         this(other.scores);
     }

     int getScoreCount()
     {
        return scores.length;
     }
     
     int getScore(int index)
     {
         if(index < 0 || index >= scores.length) return -1;
         return scores[index];
     }
    
     boolean updateScore(int index, int score)
     {
        if(index < 0 || index >= scores.length || !(score >=0 && score <=100)) return false;
        scores[index] = score;
        return true;
     }

}

class ScoreCardApp 
{
    public static void main(String[] args)
    {
        int[] source = {50,60,70};
        ScoreCard empty = new ScoreCard();
        ScoreCard original = new ScoreCard(source);
        ScoreCard copy = new ScoreCard(original);        

        source[0] = 99;
        boolean firstAttempt = original.updateScore(1,80);
        System.out.println("Original update: " + firstAttempt);

        boolean secondAttempt = copy.updateScore(2,100);
        System.out.println("Copy update: " + secondAttempt);

        boolean thirdAttempt = original.updateScore(0,-5);
        System.out.println("Invalid update: " + thirdAttempt);

        System.out.println("Empty score count: " + empty.getScoreCount());
        
        System.out.print("Source: ");
        for(int i = 0; i < source.length; i++)
        {
            System.out.print(source[i] + " ");
        }
        System.out.println();
        System.out.print("Original: ");
        for(int i = 0; i < original.getScoreCount(); i++)
        {
             System.out.print(original.getScore(i) + " ");
        }
        System.out.println();
        System.out.print("Copy: ");
        for(int i = 0; i < copy.getScoreCount(); i++)
        {
            System.out.print(copy.getScore(i) + " ");
        }
        
    }
}
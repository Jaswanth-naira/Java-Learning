package exam;
public class ScoreSheet 
{
    private Integer[] scores;

    public ScoreSheet(String[] rawScores)
    {
        scores = new Integer[rawScores.length];
        for(int i = 0; i < rawScores.length; i++)
        {
            if(rawScores[i]!= null)
            {
                scores[i] = Integer.parseInt(rawScores[i]);
            }
        }
    }

    public int total()
    {
        int sum = 0;
        for(Integer score: scores)
        {
            if(score != null) sum+= score;
        }

        return sum;
    }

    public Integer highest()
    {
        Integer max = null;
        for(Integer score: scores)
        {
            if(score != null && (max == null || score > max))
            {
                max = score;
            }
        }
        return max;
    }

    public boolean sameScore(int indexA, int indexB)
    {
        if(indexA < 0 || indexA >= scores.length || indexB < 0 || indexB >= scores.length)
        {
             return false;
        }

        Integer valA = scores[indexA];
        Integer valB = scores[indexB];

        if(valA == null && valB == null)
        {
            return true;
        }

        if(valA == null || valB == null)
        {
            return false;
        }

        return valA.equals(valB);
    }
}
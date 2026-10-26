package app;

import exam.ScoreSheet;
public class Main 
{
    public static void main(String[] args)
    {
        String[] rawScores = {"72", "150", "48", "150"};
        ScoreSheet sheet = new ScoreSheet(rawScores);
        System.out.println("Total: " + sheet.total());
        System.out.println("Highest: " + sheet.highest());
        System.out.println("Scores 1 and 3 equal: " + sheet.sameScore(1,3));
        System.out.println("Scores 0 and 2 equal: " + sheet.sameScore(0,2));
        ScoreSheet emptySheet = new ScoreSheet(new String[0]);
        System.out.println("Empty total: " + emptySheet.total());
        Integer emptyHighest = emptySheet.highest();
        if(emptyHighest == null)
        {
            System.out.println("Empty highest: none");
        }
        else 
        {
            System.out.println("Empty highest: " + emptyHighest);
        }
    }
}
package app;
public class Main
{
     private static final int PRACTICAL_WEIGHT = 2;
    public static void main(String[] args)
    {
        Announcement resultsOut = () -> System.out.println("Results are out");
        Greeting wellDone = name -> System.out.println("Well done, " + name);

        resultsOut.announce();
        wellDone.greet("Asha");
        wellDone.greet("Ravi");

        MarksRule total = (theory, practical) -> theory + practical;
        MarksRule bestOf = (theory, practical) -> {
            if( theory >= practical)
            {
                return theory;
            }
            return practical;
        };

        System.out.println("Total of 62 and 30: " + total.combine(62, 30));
        System.out.println("Best of 62 and 30: " + bestOf.combine(62, 30));
        System.out.println("Best of 25 and 40: " + bestOf.combine(25, 40));  

        ReportCard card = new ReportCard(62,30);
        System.out.println("Final marks (total): " + card.finalMarks(total));
        System.out.println("Final marks (weighted): " + card.finalMarks((theory,practical) -> theory + PRACTICAL_WEIGHT * practical));

        int graceMarks = 5;
        System.out.println("Final marks (with grace): " + card.finalMarks((theory, practical) -> theory + practical + graceMarks)); 
            
    }
}
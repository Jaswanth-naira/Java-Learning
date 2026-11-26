package app;
public class ReportCard 
{
    private  int theoryMarks;
    private  int practicalMarks;

    public ReportCard(int theoryMarks, int practicalMarks)
    {
        this.theoryMarks = theoryMarks;
        this.practicalMarks = practicalMarks;
    }

    public int finalMarks(MarksRule rule)
    {
        return rule.combine(theoryMarks, practicalMarks);
    }
}
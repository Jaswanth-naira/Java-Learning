package library;
public class Book 
{
    public static final int MAX_LOAN_DAYS = 14;
    private final String title;

    public Book(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    protected int lateFeePerDay() 
    {
        return 5;
    }

 
    public final boolean isOverdue(int daysKept)
    {
        return daysKept > MAX_LOAN_DAYS;
    }

    public int lateFee(int daysKept)
    {
        if (!isOverdue(daysKept)) return 0;
        return(daysKept - MAX_LOAN_DAYS) * lateFeePerDay();
    }
}
package library;

public class ReferenceBook extends Book 
{
    public ReferenceBook(String title)
    {
        super(title);
    }

    @Override
    protected int lateFeePerDay() 
    {
        return 20;
    }
}
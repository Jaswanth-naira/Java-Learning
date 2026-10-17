package library;

public final class LoanSlip 
{
    private final Book book;
    private final int daysKept;

    public LoanSlip(Book book, int daysKept)
    {
        this.book = book;
        this.daysKept = daysKept;
    }

    public int amountDue()
    {
        return book.lateFee(daysKept);
    }
}
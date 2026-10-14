// file 1: library.core.Item.java
package library.core;
public class Item 
{
    private String title;
    protected int loanDays;
    private static int count;

    public Item(String title, int loanDays)
    {
        this.title = title;
        this.loanDays = loanDays;
        count++;
    }

    public boolean isOverdue(int daysKept)
    {
        return daysKept > loanDays;
    }
    public int getLateFee(int daysLate)
    {
        return daysLate * 2;
    }

    public String getTitle()
    {
        return title;
    }

    public static int getCount()
    {
        return count;
    }    
}
// file 2: library.media.Dvd.java
package library.media;
import library.core.Item;
public class Dvd extends Item
{
    public Dvd(String title)
    {
        super(title,7);
    }

    @Override
    public int getLateFee(int daysLate) 
    {
       return daysLate * 10;
    }

    public String getLabel()
    {
        return getTitle() + "/" + this.loanDays;
    }
}
package app;
public class BillSplitter 
{
    private int toWhole(String text)
    {
        return Integer.parseInt(text.trim());
    }

    public int share(String amountText, String peopleText)
    {
        int amount = toWhole(amountText);
        int people = toWhole(peopleText);
        return amount / people;
    }

    public int leftover(String amountText, String peopleText)
    {
        int amount = toWhole(amountText);
        int people = toWhole(peopleText);
        return amount % people;
    }

}

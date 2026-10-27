package gym;
public abstract class Membership 
{
    private final String memberName;

    public Membership(String memberName)
    {
        this.memberName = memberName;
    }

    public String getMemberName()
    {
        return memberName;
    }

    public abstract int monthlyFee();

    public int feeFor(int months)
    {
        return monthlyFee() * months;
    }
}
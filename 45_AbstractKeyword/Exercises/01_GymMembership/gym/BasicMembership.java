package gym;
public class BasicMembership extends Membership 
{
    private static final int MONTHLY_FEE = 800;
    public BasicMembership(String memberName)
    {
        super(memberName);
    }

    @Override
    public int monthlyFee()
    {
        return MONTHLY_FEE;
    }
}
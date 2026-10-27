package gym;
public class PremiumMembership extends Membership 
{
    private static final int BASE_FEE = 1500;
    private static final int FEE_PER_GUEST_PASS = 250;
    private final int guestPasses;

    public PremiumMembership(String memberName, int guestPasses)
    {
        super(memberName);
        this.guestPasses = guestPasses;
    }


    @Override 
    public int monthlyFee()
    {
        return BASE_FEE + FEE_PER_GUEST_PASS * guestPasses;
    }
}
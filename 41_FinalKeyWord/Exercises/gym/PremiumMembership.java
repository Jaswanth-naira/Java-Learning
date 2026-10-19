package gym;
public class PremiumMembership extends Membership
{
    private final int trainingSessions;

    public PremiumMembership(String name, int months,int trainingSessions)
    {
        super(name,months);
        this.trainingSessions = trainingSessions;
    }

    @Override 
    protected int getMonthlyFee()
    {
        return 1500 + (200 * trainingSessions);
    }
}
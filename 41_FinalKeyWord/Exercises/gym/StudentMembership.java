package gym;
public final class StudentMembership extends Membership
{ 
     public StudentMembership(String name, int months)
     {
          super(name,months);
     }

     @Override 
     protected int getMonthlyFee()
     {
        return 600;
     }
}
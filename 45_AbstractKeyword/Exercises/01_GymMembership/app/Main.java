package app;

import gym.Membership;
import gym.BasicMembership;
import gym.PremiumMembership;
public class Main 
{
    public static void main(String[] args)
    {
        Membership[] members =  {
                                 new BasicMembership("Asha"),
                                 new PremiumMembership("Ravi",2),
                                 new PremiumMembership("Neha",0)  
    };

       for(Membership member: members)
        {
           System.out.println(member.getMemberName() + ": " + member.monthlyFee() + " per month");
        }

        System.out.println(members[1].getMemberName() + ", 6 months: " + members[1].feeFor(6));
     }
}
    
package app;

import gym.Membership;
import gym.PremiumMembership;
import gym.StudentMembership;

public class GymApp 
{
   private static int totalRevenue(Membership[] memberships)
   {
       int sum = 0;
       for(Membership membership: memberships)
       {
            sum += membership.getTotal();
       }
       return sum;
   }

   private static Membership findLowestTotal(Membership[] memberships)
   {
        if(memberships == null || memberships.length == 0) return null;
        Membership lowest = null;
        for(Membership membership: memberships)
        {
              if(membership != null)
              {
                   if(lowest == null || membership.getTotal() < lowest.getTotal()) lowest = membership;
              }
        }

        return lowest;
   }
   
   public static void main(String[] args)
   {
        Membership[] memberships = {
                                  new Membership("Asha",3),
                                  new PremiumMembership("Ravi",12,2),
                                  new StudentMembership("Meena",6),
                                  new PremiumMembership("John",1,0),
                                  new StudentMembership("Kiran",12)
                                  };
        for(Membership membership: memberships)
        {
             System.out.println(membership.getCardCode() + " " + membership.getTotal());
        }

        System.out.println(totalRevenue(memberships));
        Membership lowestTotal = findLowestTotal(memberships);
        if(lowestTotal != null)
        {
           System.out.println(lowestTotal.getCardCode());
        }
        System.out.println(Membership.BASE_FEE);

   }

}
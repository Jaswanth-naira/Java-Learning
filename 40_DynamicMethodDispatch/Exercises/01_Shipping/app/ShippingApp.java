package app;

import shipping.Parcel;
import shipping.FragileParcel;
import shipping.ExpressParcel;

public class ShippingApp
{
    static int totalCost(Parcel[] parcels)
    {
        int total = 0;
        for(Parcel parcel: parcels)
        {
             total += parcel.cost();
        }
        return total;
    }

    static String label(Parcel parcel)
    {
        return "standard";
    }

    static String label(FragileParcel parcel)
    {
        return "fragile";
    }
    
    public static void main(String[] args)
    {
        Parcel[] parcels = { new Parcel(2), new ExpressParcel(2), new FragileParcel(3)};

        for(Parcel parcel : parcels)
        {
            System.out.println(parcel.cost());
        }

        System.out.println(totalCost(parcels));
        System.out.println(label(parcels[2]));
        System.out.println(label((FragileParcel) parcels[2]));
        
    }
}

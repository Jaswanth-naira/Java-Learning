package app;

import delivery.Parcel;
import delivery.StandardParcel;
import delivery.SameDayParcel;
import delivery.NextDayParcel;

public class Main 
{
    public static void main(String[] args)
    {
        Parcel[] parcels = {
                            new StandardParcel("P101", 3),
                            new SameDayParcel("P102", 2),
                            new NextDayParcel("P103", 5)
        };

        for(Parcel parcel: parcels)
        {
            System.out.println(parcel.getTrackingId() + ": " + parcel.totalCharge());
        }

        System.out.println(parcels[2].getTrackingId() + " base charge: " + parcels[2].baseCharge());
    }
}
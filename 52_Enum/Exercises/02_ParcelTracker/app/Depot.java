package app;

public class Depot
{
    private final Parcel[] parcels;

    public Depot(Parcel[] parcels)
    {
        this.parcels = parcels.clone();
    }

    public int countAt(Stage targetStage)
    {
        int count = 0;
        for (Parcel parcel : parcels)
        {
            if (parcel.getStage() == targetStage) 
            {
                count++;
            }
        }
        return count;
    }

    public Parcel furthestBehind()
    {
        if (parcels.length == 0)
        {
            return null;
        }
        Parcel earliest = parcels[0];
        for (int i = 1; i < parcels.length; i++)
         {
            if (parcels[i].getStage().ordinal() < earliest.getStage().ordinal()) {
                earliest = parcels[i];
          }
        }
        return earliest;
    }

    public int countCancellable()
    {
        int count = 0;
        for (Parcel parcel : parcels) 
        {
            if (parcel.canCancel())
            {
                count++;
            }
        }
        return count;
    }
}
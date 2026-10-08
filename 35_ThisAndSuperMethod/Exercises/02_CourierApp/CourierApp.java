class Parcel 
{
    private String trackingId;
    private int weightGrams;

    Parcel(String trackingId, int weightGrams)
    {
        if(trackingId == null || trackingId.trim().isEmpty())
        {
            this.trackingId = "UNTRACKED";
        }
        else
        { 
        this.trackingId = trackingId;
        }
        if(weightGrams < 1)
        {
            this.weightGrams = 1;
        }
        else 
        {
        this.weightGrams = weightGrams;
        }
    }

    Parcel(String trackingId)
    {
        this(trackingId,500);
    }

    Parcel(Parcel other)
    {
        this(other.trackingId,other.weightGrams);
    }

    boolean addWeight(int grams)
    {
        if(grams <= 0) return false;
        this.weightGrams += grams;
        return true;
    }

    String getTrackingId()
    {
        return trackingId;
    }

    int getWeight()
    {
        return weightGrams;
    }
    
    static int totalWeight(Parcel[] parcels)
    {
        if (parcels == null) return 0;
        int totalWeight = 0;
        for(Parcel items: parcels)
        {
            if(items == null) continue;
            totalWeight += items.getWeight();
        }
        return totalWeight;
    }
    
    static int countUntracked(Parcel[] parcels)
    {
        if(parcels == null) return 0;
        int untrackedParcels = 0;
        for(Parcel item: parcels)
        {
            if(item == null) continue;
            if(item.getTrackingId().equals("UNTRACKED")) 
            {
                untrackedParcels++;
            }
        }
        return untrackedParcels;
    }
}

class FragileParcel extends Parcel 
{
    private String note;

    FragileParcel(String trackingId, int weightGrams, String note)
    {
        
        super(trackingId,weightGrams);
        if(note == null || note.trim().isEmpty()) 
        {
            this.note = "Handle with care";
        }
        else 
        {
            this.note = note;
        }
    }

    FragileParcel(String trackingId)
    {
        this(trackingId, 500, "Handle with care");
    }

    String getNote()
    {
        return note;
    }
}
class CourierApp 
{
   public static void main(String[] args)
   {
        Parcel p1 = new Parcel("TRK101", 1200);
        Parcel p2 = new Parcel("TRK102");
        Parcel p3 = new Parcel("  ",0);

        System.out.println("P1: " + p1.getTrackingId() + ", " + p1.getWeight() + " g");
        System.out.println("P2: " + p2.getTrackingId() + ", " + p2.getWeight() + " g");
        System.out.println("P3: " + p3.getTrackingId() + ", " + p3.getWeight() + " g");

        Parcel copy = new Parcel(p1);
        Parcel alias = p1;
        System.out.println("Add 300 g: " + p1.addWeight(300));
        System.out.println("P1 weight: " + p1.getWeight());
        System.out.println("Alias weight: " + alias.getWeight());
        System.out.println("Copy weight: " + copy.getWeight());
        System.out.println("Copy is p1: " + (copy == p1));
        System.out.println("Alias is p1: " + (alias == p1));

        FragileParcel f1 = new FragileParcel("FRG201", 800, "Glass");
        System.out.println("F1: " + f1.getTrackingId() + ", " + f1.getWeight() + " g, " + f1.getNote());
        FragileParcel f2 = new FragileParcel("", 2000, "");
        System.out.println("F2: " + f2.getTrackingId() + ", " + f2.getWeight() + " g, " + f2.getNote());
        FragileParcel f3 = new FragileParcel("FRG203");
        System.out.println("F3: " + f3.getTrackingId() + ", " + f3.getWeight() + " g, " + f3.getNote());

         Parcel[] van = {p1, copy, f1, f2, null};
        System.out.println("Van weight: " + Parcel.totalWeight(van));
        System.out.println("Untracked in van: " + Parcel.countUntracked(van));
   }
}
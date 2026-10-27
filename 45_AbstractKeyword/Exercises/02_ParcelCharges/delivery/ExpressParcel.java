package delivery;

public abstract class ExpressParcel extends Parcel 
{
      private static final int BASE_CHARGE = 100;

      public ExpressParcel(String trackingId, int weightKg)
      {
            super(trackingId,weightKg);
      }

      @Override 
      public int baseCharge()
      {
        return BASE_CHARGE;
      }

}

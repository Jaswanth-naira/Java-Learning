package shipping;

public class FragileParcel extends Parcel
{
      public FragileParcel(int weight)
      {
          super(weight);
      }

      @Override
      public int cost()
      {
         return super.cost() + 40;
      }
}
class Parcel 
{
    private double weightKg;
    private double ratePerKg;

    Parcel(double weightKg, double ratePerKg)
    {
        this.weightKg = weightKg;
        this.ratePerKg = ratePerKg;
    }

    double getShippingCost()
    {
        return weightKg * ratePerKg;
    }
}
class ParcelApp
{
    public static void main(String[] args)
    {
       System.out.printf("Parcel 1: %.2f", new Parcel(2.5,40).getShippingCost());
       System.out.println();
       System.out.printf("Parcel 2: %.2f", new Parcel(1.2,50).getShippingCost());
    }
}
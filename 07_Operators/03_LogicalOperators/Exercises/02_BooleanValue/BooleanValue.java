import java.util.*;
class BooleanValue 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the status of rain: ");
        boolean isRaining = sc.nextBoolean();
        System.out.print("Enter the status of having an umbrella: ");
        boolean hasUmbrella = sc.nextBoolean();
        System.out.println(isRaining || hasUmbrella);
    }
}
import java.util.Scanner;
class ShortTypeConversion 
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter input: ");

         short input = sc.nextShort();

         int shortToInt = input;
         System.out.println(shortToInt);

         long shortToLong = input;
         System.out.println(shortToLong);

         float shortToFloat = input;
         System.out.println(shortToFloat);

         double shortToDouble = input;
         System.out.println(shortToDouble);


    }
}
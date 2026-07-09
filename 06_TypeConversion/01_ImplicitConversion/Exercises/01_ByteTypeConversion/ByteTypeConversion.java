import java.util.*;
class ByteTypeConversion
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter input of byte:");
        
         byte input = sc.nextByte();
         System.out.println(input);
          
         short byteToShort = input;
         System.out.println(byteToShort);

         int byteToInt = input;
         System.out.println(byteToInt);

         long byteToLong = input;
         System.out.println(byteToLong);

         float byteToFloat = input;
         System.out.println(byteToFloat);

         double byteToDouble = input;
         System.out.println(byteToDouble);
         
    }
}
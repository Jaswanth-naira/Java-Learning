import java.util.*;
class SimpleCalculation 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter width of Rectangle: ");
        int width = sc.nextInt();

        int areaOfRectangle = length * width;
        System.out.println("Area of rectangle: "+ areaOfRectangle);

        sc.close();
    }
}
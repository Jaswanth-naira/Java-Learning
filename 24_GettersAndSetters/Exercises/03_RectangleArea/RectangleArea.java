import java.util.Scanner;

class Rectangle 
{
     private double length;
     private double width;

     boolean setLength(double lengthOfRectangle)
     {
         if(lengthOfRectangle <= 0) return false;
         length = lengthOfRectangle;
         return true;
     }

     boolean setWidth(double widthOfRectangle)
     {
         if(widthOfRectangle <= 0) return false;
         width = widthOfRectangle;
         return true;
     }

     double getLength()
     {
        return length;
     }

     double getWidth()
     {
        return width;
     }

     double getArea()
     {
        return length * width;
     }

}


class RectangleArea
{
    public static void main(String args[])
    {
         Scanner scanner = new Scanner(System.in);
         Rectangle rectangle = new Rectangle();

         System.out.print("Enter length of a rectangle: ");
         if(!scanner.hasNextDouble()){
            System.out.print("Please enter a valid number.");
            scanner.close();
            return;
         }
         double length = scanner.nextDouble();

         System.out.print("Enter width of a rectangle: ");
         if(!scanner.hasNextDouble()){
            System.out.print("Please enter a valid number.");
            scanner.close();
            return;
         }
         double width = scanner.nextDouble();
         
         if(!rectangle.setLength(length))
         {
            System.out.println("Please enter number greater than 0.");
            scanner.close();
            return;
         }

         if(!rectangle.setWidth(width))
         {
            System.out.println("Please enter number greater than 0.");
            scanner.close();
            return;
         }


         System.out.printf("Length: %.2f%n", rectangle.getLength());
         System.out.printf("Width: %.2f%n", rectangle.getWidth());
         System.out.printf("Area: %.2f%n", rectangle.getArea());
         scanner.close();
                
    }
}
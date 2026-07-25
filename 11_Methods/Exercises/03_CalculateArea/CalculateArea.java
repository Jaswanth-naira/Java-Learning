import java.util.*;
class CalculateArea
{    
     double calculateAreaOfRectangle(double length,double width)
    {
            
            return length*width;   
         
    }
            
    public static void main(String args[])
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of a Rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of a Rectangle: ");
        double width = sc.nextDouble();

        CalculateArea obj = new CalculateArea();
        double result = obj.calculateAreaOfRectangle(length,width);
        System.out.println("The Area of the Rectangle: "+result);
        
        
        
    }
}
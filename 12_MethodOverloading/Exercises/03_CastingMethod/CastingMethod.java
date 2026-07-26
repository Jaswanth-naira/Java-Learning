import java.util.*;
class CastingMethod 
{
     void show(double d)
     {
        System.out.println(d);
     }
     
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        CastingMethod obj = new CastingMethod();
        obj.show(5);
        
     } 
}
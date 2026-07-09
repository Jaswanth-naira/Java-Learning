import java.util.*;
class Method 
{
    void showValue(double d)
     {
        System.out.println(d);
     }     
}

class IntToDoubleMethod 
{       
     public static void main(String args[])
     {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter input value:");
           int input = sc.nextInt();
           
           Method obj= new Method();
           obj.showValue(input);
     }
}
import java.util.*;
class MultiplyDemo
{  
    //Method 1 multiply two integers
    int multiply(int a,int b)
    {
        return a*b;
    }
    //Method 2 multiply two doubles
    double multiply(double a,double b)
    {
        return a*b;
    }
    //Method 3 multiply three integers
    int multiply(int a,int b,int c)
    {
        return a*b*c;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        MultiplyDemo obj = new MultiplyDemo();
        
        System.out.println("\n---Multiplying Two Integers ---");
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt(); 
        int value = obj.multiply(a,b);

        System.out.println("\n---Multiplying Two Doubles----");
        System.out.print("Enter the double value of firstno: ");
        double firstNo = sc.nextDouble();       

        System.out.print("Enter the double value of secondno: ");
        double secondNo = sc.nextDouble();
        double result = obj.multiply(firstNo,secondNo);

        System.out.println("\n---Multiplying Three Integers---");
        System.out.print("Enter the input value 1: ");
        int inputOne = sc.nextInt();

        System.out.print("Enter the input value 2: ");
        int inputTwo = sc.nextInt();

        System.out.print("Enter the input value 3: ");
        int inputThree = sc.nextInt();
        int productOfThree = obj.multiply(inputOne,inputTwo,inputThree);

        System.out.println(value);
        System.out.println(result);
        System.out.println(productOfThree);

    }
}
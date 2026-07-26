import java.util.*;
class DisplayString 
{
    void display(String s,int n)
    {
       System.out.println("\n-----First Method-----");
       System.out.println(s);
       System.out.println(n);
    }
    void display(int n,String s)
    {
       System.out.println("\n----Second Method----");
       System.out.println(n);
       System.out.println(s);
       
    }

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       DisplayString obj = new DisplayString();

       System.out.println("\n----Enter input values for the first method-------");
       System.out.print("Enter a string: ");
       String s = sc.nextLine();
       
       System.out.print("Enter number: ");
       int a = sc.nextInt();

       System.out.println("\n----Enter input values for the second method-----");
       System.out.print("Enter value: ");
       int x = sc.nextInt();
       sc.nextLine();

       System.out.print("Enter string: ");
       String y = sc.next();
       
       obj.display(s,a);
       obj.display(x,y);

    }
}
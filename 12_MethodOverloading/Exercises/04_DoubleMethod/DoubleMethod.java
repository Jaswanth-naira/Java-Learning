import java.util.*;
class DoubleMethod 
{   
    void display(int n)
    {
        System.out.println(n);
    }
    void display(double d)
    {
        System.out.println(d);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        DoubleMethod obj = new DoubleMethod();
        obj.display(5);
    }
}
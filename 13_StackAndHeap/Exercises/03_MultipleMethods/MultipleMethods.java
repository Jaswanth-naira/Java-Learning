import java.util.*;
class MultipleMethods 
{
    public static void methodA()
    {
        methodB();
    }
    public static void methodB()
    {
        int x = 10;
        System.out.println("I am method B: ");
    }
    
    public static void main(String args[])
    {
        methodA();
    }
}
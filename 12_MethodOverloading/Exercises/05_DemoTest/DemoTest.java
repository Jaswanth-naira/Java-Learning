import java.util.*;
class DemoTest 
{
    void test(int a, double d)
    {
        System.out.println(a+"\n"+d);
    }
    void test(double d,int a)
    {
        System.out.println(d+"\n"+a);
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        DemoTest obj = new DemoTest();
        obj.test(5,5);
    }
}
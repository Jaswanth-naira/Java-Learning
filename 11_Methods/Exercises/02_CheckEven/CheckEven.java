import java.util.*;
class CheckEven 
{
    void checkEvenNumber(int n)
    {
        String result = n%2 == 0 ? "Even Number":"Odd Number";
        System.out.println(result);

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        CheckEven obj = new CheckEven();
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        obj.checkEvenNumber(n);
    }
}
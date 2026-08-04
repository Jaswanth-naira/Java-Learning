import java.util.*;
class MixedData 
{
    void addMixed(int[] arr)
    {
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = "Hello";
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        MixedData obj = new MixedData();
        obj.addMixed(arr);
    }
}
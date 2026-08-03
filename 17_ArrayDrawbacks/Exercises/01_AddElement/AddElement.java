import java.util.*;
class AddElement 
{
    void addElement(int[] arr,int value)
    {
        arr[arr.length] = value;
        
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter elements inside an array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter next element: ");
        int value = sc.nextInt();
        AddElement obj = new AddElement();
        obj.addElement(arr,value);
    }
}
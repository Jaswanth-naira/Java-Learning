import java.util.*;
class DeleteElement 
{
    int[] deleteElement(int[] arr,int index)
    {
        int[] newArray = new int[arr.length-1];
        int k = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            if (i == index) continue;
            newArray[k] = arr[i];
            k++;
            
        }
        return newArray;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
             System.out.print("Enter element " + i + ": ");
             arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index no you want to delete (0 to " + (size -1) + "): ");
        int index = sc.nextInt();
        if(index <0 || index >=size)
        {
            System.out.print("Invalid Index ");
            return;
            
        }
        DeleteElement obj = new DeleteElement();
        int[] modifiedArray = obj.deleteElement(arr,index);
        System.out.print("Modified Array: ");
        for(int i=0;i<modifiedArray.length;i++)
        {
             System.out.print(modifiedArray[i]+" ");
        }
    }
}
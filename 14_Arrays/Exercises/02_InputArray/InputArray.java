import java.util.*;
class InputArray 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();
        int [] marks = new int[n];
        for (int i=0;i<n;i++)
        {   
            System.out.print("Enter element " +(i +1 ) +": ");
            marks[i]=sc.nextInt();
        }
        System.out.print("\n---Array Elements---\n");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
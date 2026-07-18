import java.util.*;
class Break
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int no = sc.nextInt();
        for(int i=1;i<=no;i++)
        {
             
             if(i==3)
             {
                continue;
             }
             System.out.println(i);
        }  
    }
}
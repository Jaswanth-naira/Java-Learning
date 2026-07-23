import java.util.*;
class UserInput 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        { 
            System.out.print("Enter any number between  1 and 10: ");
            int no = sc.nextInt();
            if(no >= 1 && no <= 10)
            {
                System.out.println(no);
                break;
            }

        }
    }
}
import java.util.*;
class GradeCheck 
{
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any grade: ");
        String grade = sc.next();
        switch (grade)
        {
             case "A":
             case "B":
             case "C":System.out.println("Pass");
                      break;
             case "D":
             case "F":System.out.println("Fail");
        }
     }
}
import java.util.*;
class GradeCalculator 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String grade = (marks >= 90) ? "A" : (marks >= 75) ? "B" : (marks >=60) ? "C" : (marks >=40) ? "D" : "F";
        System.out.println(grade);
        
    }
}
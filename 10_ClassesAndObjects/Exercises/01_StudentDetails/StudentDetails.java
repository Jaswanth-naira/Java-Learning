import java.util.*;
class Student 
{
    String name;
    int rollNumber;
    int marks;
    void displayDetails()
    {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student name: "+name);
        System.out.println("Student rollNumber: "+rollNumber);
        System.out.println("Student marks: "+marks);
    }
}

class StudentDetails 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       Student obj = new Student();

       System.out.print("Enter student name: ");
       obj.name = sc.nextLine();

       System.out.print("Enter student rollnumber: ");
       obj.rollNumber = sc.nextInt();

       System.out.print("Enter student marks: ");
       obj.marks = sc.nextInt();

       obj.displayDetails();
    }
}
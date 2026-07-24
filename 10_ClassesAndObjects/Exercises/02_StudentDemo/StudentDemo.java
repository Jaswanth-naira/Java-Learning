import java.util.*;
class Student 
{
    String name;
    int rollNumber;
    double marks;

    Student()
    {
        name = "Unknown";
        rollNumber = 0;
        marks = 0;
    }

    Student(String s,int r,double m)
    {
        name = s;
        rollNumber = r;
        marks = m;
    }
    
    void displayDetails()
    {
        System.out.println("\n--- Student Details----");
        System.out.println("Student name: "+name);
        System.out.println("Student rollnumber: "+rollNumber);
        System.out.println("Student marks: "+marks);
    }

}
class StudentDemo 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student firstObject = new Student();
        
        System.out.print("Enter Student Details-----\n");
        
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student rollnumber: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter student marks: ");
        double marks = sc.nextDouble();

        Student secondObject = new Student(name,rollNumber,marks);
        
        firstObject.displayDetails();
        secondObject.displayDetails();
    }
}
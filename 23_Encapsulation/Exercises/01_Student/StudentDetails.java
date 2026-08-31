import java.util.*;
class Student 
{
     private String name;
     
     void storeName(String inputName)
     {
          name = inputName;
     }

     void displayName()
     {
         System.out.println("Student name is: " + name);
     }

}
class StudentDetails
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");

        String name = sc.nextLine();

        if(name.trim().isEmpty()){
            System.out.println("Invalid Input!!! Please enter a valid input.");
            sc.close();
            return;
        }

        Student student = new Student();
        student.storeName(name);
        
        student.displayName();
        sc.close();
    }
}
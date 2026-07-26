import java.util.*;
class Student
{
    String name;
    void display(String s)
    {
        name = s;
        System.out.println(name);
    }
}

class StudentDetails 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        Student obj = new Student();
        System.out.print("Enter  name: ");
        obj.name = sc.nextLine();

        obj.display(obj.name);

    }
}
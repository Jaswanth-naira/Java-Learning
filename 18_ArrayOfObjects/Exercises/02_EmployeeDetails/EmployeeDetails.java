import java.util.*;
class Employee 
{
     int id;
     String name;
     int salary;
     
     void acceptDetails(Scanner sc)
     {
         System.out.print("Enter employee id: ");
         id = sc.nextInt();
         sc.nextLine();

         System.out.print("Enter employee name: ");
         name = sc.nextLine();

         System.out.print("Enter employee salary: ");
         salary = sc.nextInt();
     }

     void displayDetails()
     {
           System.out.print("Employee id: " + id + " Employee name: " + name + " Employee salary: " + salary);
     }
     
     void findAndPrintHighestSalary(Employee[] arr)
     {
         if (arr.length == 0)
         {
            System.out.println( "No Employee Data Found");
            return;
         }
     
         int maxSalary = arr[0].salary;
         int index = 0;
         for(int i=1;i<arr.length;i++)
           {
                  if(arr[i].salary > maxSalary)
                  {
                     index = i;
                     maxSalary = arr[i].salary;
                  }

           } 
           System.out.print("\n------Printing Employee Highest Salary------\n");
           arr[index].displayDetails();
    }
}
class EmployeeDetails
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        Employee[] arr = new Employee[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = new Employee();
            arr[i].acceptDetails(sc);   
        }
       Employee obj = new Employee();
       obj.findAndPrintHighestSalary(arr);       
    }
}
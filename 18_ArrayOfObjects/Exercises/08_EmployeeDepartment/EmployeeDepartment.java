import java.util.*;
class Employee 
{
     String name;
     String department;
     double salary;

     void acceptDetails(Scanner sc)
     {
           System.out.print("Enter employee name: ");
           name = sc.nextLine();

           System.out.print("Enter employee department name: ");
           department = sc.nextLine();
           
           System.out.print("Enter employee salary: ");
           salary = sc.nextDouble();
           sc.nextLine();

     }

     void enterDepartment(Employee[] arr,Scanner sc)
     {
          System.out.print("\nEnter the department name you want to search for: ");
          String departmentName = sc.nextLine();
          searchAndPrint(arr,departmentName);
     }
    
    void searchAndPrint(Employee[] arr,String departmentName)
    {
         int count = 0;

         System.out.println("\n-----------------------------------------");
         System.out.println(" SEARCH RESULTS FOR DEPARTMENT: "+departmentName.toUpperCase());
         System.out.println("-------------------------------------------");
         
         for(int i=0; i < arr.length; i++)
         {
            if(arr[i].department.equalsIgnoreCase(departmentName))
            {
                   count++;
                   System.out.println("Employee #"+count);
                   System.out.println("  . Name       : " + arr[i].name);
                   System.out.println("  . Department : "+arr[i].department);
                   System.out.println("  . Salary     : $"+arr[i].salary);
                   System.out.println("--------------------------------");
                   
            }
         }
         if(count == 0)
         {
           System.out.println("No employees found working in the "+departmentName+"' department.");
           System.out.println("-------------------------------------------------");     
         }
         else 
         {
            System.out.println("Total employees in " + departmentName + ": " + count);
            System.out.println("-------------------------------------------------");
         }
    }

}
class EmployeeDepartment
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number of employees to add: ");
         int size = sc.nextInt();
         sc.nextLine();

         if(size > 0)
         {
               Employee[] arr = new Employee[size];
               for(int i=0;i<arr.length;i++)
               {
                    System.out.println("Enter details for the employee " + (i + 1) + ":");
                    arr[i] = new Employee();
                    arr[i].acceptDetails(sc);
               }
      
               Employee obj = new Employee();
               obj.enterDepartment(arr,sc);
               
               
         }

         else 
         {
             System.out.println("Enter no of employees greater than 0.");
         }
    }

}
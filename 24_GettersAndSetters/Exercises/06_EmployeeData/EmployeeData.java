import java.util.Scanner;

class Employee 
{
     private int empId;
     private String name;

     boolean setEmpId(int id)
     {
         if(id <= 0) return false;
         empId = id;
         return true;
     }

     boolean setName(String employeeName)
     {
          if(employeeName == null || employeeName.trim().isEmpty()) return false;
          name = employeeName.trim();
          return true;
     }

     int getEmpId()
     {
        return empId;
     }

     String getName()
     {
         return name;
     }
}

class EmployeeData 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        
        System.out.print("Enter your id: ");

        if(!scanner.hasNextInt()){
            System.out.print("Invalid input! Please enter a valid number.");
            scanner.close();
            return;
        }

        int employeeId = scanner.nextInt();
        scanner.nextLine();

        if(!employee.setEmpId(employeeId)){
            System.out.println("Please enter number greater than 0.");
            scanner.close();
            return;
        }

        
        System.out.print("Enter your name: ");

        String employeeName = scanner.nextLine();

        if(!employee.setName(employeeName)){
            System.out.println("Name cannot be left blank.");
            scanner.close();
            return;
        }
        

        System.out.println("\n----EMPLOYEE DETAILS----");
        System.out.println("Id: " + employee.getEmpId());
        System.out.println("Name: " + employee.getName());       
       
    }
}

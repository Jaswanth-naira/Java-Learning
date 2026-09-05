import java.util.Scanner;

class Employee
{
    private int id;
    private String name;
    private boolean isEmployeeIdSet;

    boolean setEmployeeId(int employeeId)
    {
        if(employeeId <= 0) return false;
        if(isEmployeeIdSet) return false;

        id = employeeId;
        isEmployeeIdSet = true;
        return true;
    }

    boolean setEmployeeName(String employeeName)
    {
        if(employeeName == null || employeeName.trim().isEmpty()) return false;

        name = employeeName.trim();
        return true;
    }

    int getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }
}

class EmployeeDetails
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        boolean isInitialIdSet = false;

        while(!isInitialIdSet)
        {
            System.out.print("Enter employee ID: ");

            if(!scanner.hasNextInt())
            {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            int employeeId = scanner.nextInt();
            scanner.nextLine();

            if(!employee.setEmployeeId(employeeId))
            {
                System.out.println("Employee ID must be greater than 0.");
                continue;
            }

            isInitialIdSet = true;
        }

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        if(!employee.setEmployeeName(employeeName))
        {
            System.out.println("Employee name cannot be blank.");
            scanner.close();
            return;
        }

        System.out.print("Enter updated employee name: ");
        String updatedEmployeeName = scanner.nextLine();

        if(!employee.setEmployeeName(updatedEmployeeName))
        {
            System.out.println("Name update rejected. Previous name remains.");
        }

        System.out.print("Enter a new employee ID: ");

        if(scanner.hasNextInt())
        {
            int updatedEmployeeId = scanner.nextInt();

            if(!employee.setEmployeeId(updatedEmployeeId))
            {
                System.out.println("Employee ID update rejected. Existing ID remains unchanged.");
            }
        }
        else
        {
            System.out.println("Invalid input. Existing ID remains unchanged.");
        }

       
       
       
       
        System.out.println("\n------DISPLAYING EMPLOYEE DETAILS------");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());

        scanner.close();
        
    }
}
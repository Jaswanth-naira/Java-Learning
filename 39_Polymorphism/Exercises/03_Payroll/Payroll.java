public class Payroll 
{
    public static int totalPay(Employee[] staff)
    {
        int sum = 0;
        for(Employee emp: staff)
        {
            sum += emp.getSalary();
        }
        return sum;
    }

    public static int totalPay(Employee[] staff, int months)
    {
        return totalPay(staff) * months;
    }

    public static Employee findTopEarner(Employee[] staff)
    {
        
        if(staff == null || staff.length == 0) return null;
        Employee maxEmp = null;
        for(Employee emp: staff)
        {
             if(emp == null) continue;
             if(maxEmp == null || emp.getSalary() > maxEmp.getSalary()) maxEmp = emp;
        }
        return maxEmp;
    }

    public static void main(String[] args)
    {
        Employee[] staff = {
                           new Employee("Asha", 50000),
                           new Manager("Ravi", 40000, 15000),
                           new Intern("Neel", 20000)
                           }; 
        for(Employee emp: staff)
        {
            System.out.println(emp.getName() + " " + emp.getRole() + " " + emp.getSalary());
        }

        System.out.println(totalPay(staff));
        System.out.println(totalPay(staff,3));
        Employee topEarner = findTopEarner(staff);
        if(topEarner != null)
        {
        System.out.println(topEarner.getName());
        }
    }
}
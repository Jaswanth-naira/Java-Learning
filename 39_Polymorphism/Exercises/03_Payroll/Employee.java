// File 1: Employee.java
public class Employee 
{
    private String name;
    private int baseSalary;
    public Employee(String name, int baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName()
    {
        return name;
    }
    
    public int getSalary()
    {
        return baseSalary;
    }
    
    public String getRole()
    {
        return "employee";
    }
}
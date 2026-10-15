// File 3: Intern.java
public class Intern extends Employee
{
    public Intern(String name, int baseSalary)
    {
        super(name,baseSalary);
    }

    @Override
    public int getSalary()
    {
        return super.getSalary()/2;
    }
    
    @Override 
    public String getRole()
    {
        return "intern";
    }
    
}
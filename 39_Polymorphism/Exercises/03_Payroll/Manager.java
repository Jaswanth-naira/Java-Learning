// File 2: Manager.java
public class Manager extends Employee
{
    private int bonus;
    public Manager(String name, int baseSalary, int bonus)
    {
          super(name,baseSalary);
          this.bonus = bonus;
    }

    @Override
    public int getSalary()
    {
        return super.getSalary() + bonus;
    }

    @Override 
    public String getRole()
    {
        return "manager";
    }
}
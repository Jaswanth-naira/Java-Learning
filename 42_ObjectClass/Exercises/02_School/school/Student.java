package school;

public class Student 
{
    private final int rollNo;
    private final String name;

    public Student(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return rollNo + ":" + name;
    }

    @Override 
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return rollNo == other.rollNo;
    }

    @Override 
    public int hashCode()
    {
        return Integer.hashCode(rollNo);
    }
}
//file 2: school.exam.Result.java
package school.exam;
public class Result 
{
    private int marks;
    public Result(int marks)
    {
        this.marks = marks;
    }

    public int getMarks() 
    {
        return marks;
    }

    public boolean hasPassed()
    {
        return marks >= 40;
    }
}
//file 1: school.app.ReportDesk.java
package school.app;
import school.exam.Result;
public class ReportDesk 
{
    public static void main(String[] args)
    {
        Result firstExam = new Result(40);
        Result secondExam = new Result(39);

        school.sports.Result sportsResult = new school.sports.Result(80);

        System.out.println(firstExam.getMarks());
        System.out.println(firstExam.hasPassed());
        System.out.println(secondExam.hasPassed());
        System.out.println(sportsResult.getMedal());
        System.out.println(firstExam.getClass().getName());
        System.out.println(sportsResult.getClass().getName());
    }
}
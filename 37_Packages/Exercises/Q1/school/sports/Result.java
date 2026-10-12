//file 3: school.sports.Result.java
package school.sports;
public class Result 
{
    private int points;
    public Result(int points)
    {
       this.points = points;
    }

    public String getMedal()
    {
        if(points >= 90)
        {
            return "Gold";
        }

        else if((points >= 75))
        {
            return "Silver";
        }
        else 
        {
            return "None";
        }
    }
}
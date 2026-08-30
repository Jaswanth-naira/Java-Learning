import java.util.*;
class StarTriangleBuilder 
{
    String buildStarTriangle(int numberOfRows)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= numberOfRows ; i++)
        {
             for(int j = 1; j <= i; j++)
             {
                sb.append("*");
                if(j < i) sb.append(" ");
             }
             if(i < numberOfRows) sb.append("\n");
        }
        return sb.toString();
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number (starting from 1): ");
        int numberOfRows = sc.nextInt();
        
        if(numberOfRows < 1)
        {
             System.out.print("Invalid input!!! Please enter number greater than 0.");
             sc.close();
             return;
        }

        StarTriangleBuilder builder = new StarTriangleBuilder();
        String starTriangle = builder.buildStarTriangle(numberOfRows);
        System.out.println("Printing star Triangle Pattern:\n" + starTriangle);
        sc.close();
    }
}
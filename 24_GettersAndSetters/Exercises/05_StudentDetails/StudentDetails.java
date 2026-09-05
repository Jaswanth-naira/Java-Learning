import java.util.Scanner;
class ExamResult 
{
    private String studentName;
    private double studentTheoryMarks;
    private double studentPracticalMarks;

    boolean setName(String name)
    {
        if(name == null || name.trim().isEmpty()) return false;

        studentName = name.trim();
        return true;
    }

    boolean setTheoryMarks(double theoryMarks)
    {
        if(theoryMarks < 0 || theoryMarks > 100) return false;

        studentTheoryMarks = theoryMarks;   
        return true;
    }

    boolean setPracticalMarks(double practicalMarks)
    {
        if(practicalMarks < 0 || practicalMarks > 100 ) return false;

        studentPracticalMarks = practicalMarks;
        return true;
    }

    String getName()
    {
        return studentName;
    }

    double getTheoryMarks()
    {
        return studentTheoryMarks;
    }

    double getPracticalMarks()
    {
        return studentPracticalMarks;
    }


    double getTotalMarks()
    {
        return studentPracticalMarks + studentTheoryMarks;
    }

    double getAverageMarks()
    {
        return getTotalMarks() / 2.0;
    }

    boolean isPassed()
    {
        if(studentPracticalMarks<40 || studentTheoryMarks<40) return false;
        return true;
    }


}


class StudentDetails 
{
    public static void main(String args[])
    {
         Scanner scanner = new Scanner(System.in);
         ExamResult  result = new ExamResult();
         
         System.out.print("Enter student name: ");
         String name = scanner.nextLine();

         if(!result.setName(name)){
            System.out.println("Invalid input! Name cannot be blank.");
            scanner.close();
            return;
         }

         System.out.print("Enter marks obtained in theory: ");
         if(!scanner.hasNextDouble()){
            System.out.println("Invalid input! Please enter a valid number.");
            scanner.close();
            return;
         }
         double theoryMarks = scanner.nextDouble();

         if(!result.setTheoryMarks(theoryMarks)){
            System.out.println("Marks must be between 0 and 100.");
            scanner.close();
            return;
         }

         System.out.print("Enter marks obtained in practical: ");
         if(!scanner.hasNextDouble()){
            System.out.println("Invalid input! Please enter a valid Input.");
            scanner.close();
            return;
         }
         double practicalMarks = scanner.nextDouble();

         if(!result.setPracticalMarks(practicalMarks)){
            System.out.println("Marks must be between 0 and 100.");
            scanner.close();
            return;
         }
         
         System.out.println("\n---------Printing Exam Results: -----------");
         System.out.println("Name: " + result.getName());
         System.out.printf("Theory Marks: %.2f%n", result.getTheoryMarks());
         System.out.printf("Practical Marks: %.2f%n", result.getPracticalMarks());
         System.out.printf("Total Marks: %.2f%n", result.getTotalMarks());
         System.out.printf("Average Marks: %.2f%n", result.getAverageMarks());
         System.out.println("Passed: " + result.isPassed());
         scanner.close();       
    }
}
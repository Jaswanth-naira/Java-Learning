import java.util.Scanner;

class AttendanceTracker
{
    private String studentName;
    private int totalClassesHeld;
    private int noOfClassesAttended;

    boolean setStudentName(String name)
    {
          if (name == null || name.trim().isEmpty()) return false;
          studentName = name.trim();
          return true;
    }

    boolean recordAttendance(String attendanceStatus)
    {
          if(attendanceStatus == null || attendanceStatus.trim().isEmpty()) return false;
          
          attendanceStatus = attendanceStatus.trim();

          if(!attendanceStatus.equalsIgnoreCase("P") && !attendanceStatus.equalsIgnoreCase("A")) return false;
          totalClassesHeld++;

          if(attendanceStatus.equalsIgnoreCase("P")){
            noOfClassesAttended++;
          }

          return true;

    }

    String getStudentName()
    {
        return studentName;
    }

    int getTotalClassesHeld()
    {
         return totalClassesHeld;
    }

    int getClassesAttended()
    {
         return noOfClassesAttended;
    }

    double getAttendancePercentage()
    {
        if (totalClassesHeld == 0) return 0.0;

        return (noOfClassesAttended * 100.0) / totalClassesHeld; 
    }
}
class StudentAttendanceDetails 
{
    public static void main(String args[])
    {
         Scanner scanner = new Scanner(System.in);
         AttendanceTracker tracker = new AttendanceTracker();
         
         System.out.println("Please enter details of 5 classes: ");
         int classesToRecord = 5;

         System.out.print("Enter student's name: ");
         String name = scanner.nextLine();

         boolean isValidName = true;

         while(isValidName)
         {
             if(tracker.setStudentName(name)){ 
                isValidName = false;
             }
             else {
             System.out.print("Please reenter a valid student's name: ");
             name = scanner.nextLine().trim();
             }

         }
         
         
         while(classesToRecord > 0)
         {        

                System.out.print("Please enter whether you attended class or not  (P/A) or (p/a): ");
                String response = scanner.nextLine().trim();

                if(!tracker.recordAttendance(response)){
                    System.out.println("Please choose a valid option either P or A.");
                    continue;
                }
                classesToRecord--;
             
         }
         
        System.out.println("\n--------DISPLAYING STUDENT'S ATTENDANCE DETAILS---------");

        System.out.println("student name is: " + tracker.getStudentName());
        System.out.println("No of total classes held for " + tracker.getStudentName() + " " + tracker.getTotalClassesHeld());
        System.out.println("No of total classes attended by" + " " + tracker.getStudentName() + " " + tracker.getClassesAttended());
        System.out.printf("Attendance percentage: %.2f%%%n",tracker.getAttendancePercentage());

        scanner.close();
    }
}
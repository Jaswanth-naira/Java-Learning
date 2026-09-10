import java.util.Scanner;
class Course
{
    private String courseName;
    private Student representative;
    
    boolean setCourseName(String courseName)
    {
        if(courseName == null || courseName.trim().isEmpty()) return false;
        this.courseName = courseName.trim();
        return true;
    }

    boolean setRepresentative(Student representative)
    {
        if (representative == null) return false;
        this.representative = representative;
        return true;
    }

    String getCourseName()
    {
        return courseName;
    }
    
    String getRepresentativeName()
    {
         if (representative == null) return null;
         return representative.getName();
    }
    
}

class Student 
{
    private String name;
    
    boolean setName(String name)
    {
         if(name == null || name.trim().isEmpty()) return false;
         this.name = name.trim();
         return true;
    }

    String getName()
    {
        return name;
    }  

    boolean becomeRepresentativeOf(Course course)
    {
        if(course == null) return false;
        return course.setRepresentative(this);
    }
    

}

class CourseDetails 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        Course course = new Course();

        System.out.print("Enter student's course name: ");
        String courseName = scanner.nextLine();

        if(!course.setCourseName(courseName)){
            System.out.println("Course name cannot be blank.");
            scanner.close();
            return;
        }

        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        if(!student.setName(studentName)){
            System.out.println("Student name cannot be blank.");
            scanner.close();
            return;
        }

        if(!student.becomeRepresentativeOf(course)){
            System.out.println("Representative assignment failed.");
            scanner.close();
            return;
        }

        System.out.println("Course: " +  course.getCourseName());
        System.out.println("Representative: " + course.getRepresentativeName());
        scanner.close();
    }
}


class Student 
{
    private String name;
    private static String schoolName = "Greenwood School";

    Student(String name)
    {
          this.name = name;
    }

    boolean updateSchoolName(String schoolName)
    {
        if(schoolName == null || schoolName.trim().isEmpty()) return false;
        Student.schoolName = schoolName.trim();
        return true;
    }

    String getName()
    {
        return name;
    }

    String getSchoolName()
    {
        return schoolName;
    }
}

class StudentSchoolApp 
{
    public static void main(String[] args)
    {
        Student firstStudent = new Student("Anika");
        Student secondStudent = new Student("Ravi");

        System.out.println("Before change:");
        System.out.println(firstStudent.getName() + ": " + firstStudent.getSchoolName());
        System.out.println(secondStudent.getName() + ": " + secondStudent.getSchoolName());
        boolean result = firstStudent.updateSchoolName("Sunrise School");
        System.out.println("School update: " + result);
        System.out.println("After change:");
        System.out.println(firstStudent.getName() + ": " + firstStudent.getSchoolName());
        System.out.println(secondStudent.getName() + ": " + secondStudent.getSchoolName());

    }
}
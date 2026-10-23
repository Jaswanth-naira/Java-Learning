package app;

import school.Student;
import school.Monitor;

public class SchoolApp 
{
    private static int indexOf(Student[] students, Student target)
    {
        for(int i = 0; i < students.length; i++)
        {
            if (students[i] != null && students[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Student[] roster = { new Student(1,"Asha"),null, new Monitor(2,"Ravi","Board"), new Student(3, "Meena")};
        Student renamed = new Student(1,"Asha K");
        Student lookup = new Student(3,"Meena R");
        Object monitorRef = roster[2];

        System.out.println(roster[0]);
        System.out.println(monitorRef);
        System.out.println(renamed.equals(roster[0]));
        System.out.println(renamed.hashCode() == roster[0].hashCode());
        System.out.println(new Student(2, "Ravi").equals(roster[2]));
        System.out.println(indexOf(roster,lookup));
        System.out.println(indexOf(roster, new Student(9, "Nobody")));
    }
}
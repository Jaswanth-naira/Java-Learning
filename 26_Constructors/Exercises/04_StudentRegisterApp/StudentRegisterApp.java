class Student 
{
    private String name;
    private int rollNumber;

    Student(String name,int rollNumber)
    {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    String getName()
    {
         return name;
    }

    int getRollNumber()
    {
        return rollNumber;
    }
}
class StudentRegisterApp
{
    public static void main(String args[])
    {
        Student[] students = new Student[3];

        System.out.println(students[0] == null);
        
        students[0] = new Student("Anika", 101);
        students[1] = students[0];
        
        Student saved = students[0];
        Student[] shared = students;
        
        shared[0] = new Student("Ravi", 102);
        
        students[2] = new Student(
            saved.getName(),
            saved.getRollNumber()
        );
        
        System.out.println(students == shared);
        System.out.println(students[0] == shared[0]);
        System.out.println(students[0] == students[1]);
        System.out.println(students[1] == saved);
        System.out.println(students[1] == students[2]);
        
        System.out.println(students[2].getName() + ", " + students[2].getRollNumber());
        
        shared[1] = null;
        
        System.out.println(students[1] == null);
        System.out.println(saved.getName() + ", " + saved.getRollNumber());
        System.out.println(students[0].getName() + ", " + students[0].getRollNumber());

        /*
        students[0] = new Student("Anika",101);
        students[2] = new Student("Ravi",102);
        
        for(int i = 0; i < students.length; i++)
        {
            if(students[i] == null){
                System.out.println("Slot " + (i + 1) + ": Empty");
            }

            else{
                System.out.println("Slot " + (i + 1) + ": " + students[i].getName() + ", " + students[i].getRollNumber());
            }
        }
        */
    }
}

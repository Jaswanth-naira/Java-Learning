class EmployeeDetails
{
    public static void main(String args[])
    {
        String name="David";
        int age=25;
        double height=1.4;
        boolean isEmployee = true;
        System.out.println(String.format("name : %s, Age : %d, Height : %.1f, Isemployee : %b",name,age,height,isEmployee));
        System.out.printf("name : %s, Age: %d, Height : %.1f, Isemployee : %b",name,age,height,isEmployee);
    }
}
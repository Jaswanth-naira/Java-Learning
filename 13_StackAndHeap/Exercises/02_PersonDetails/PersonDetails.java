import java.util.*;
class Person 
{
    String name; 
    void display(String s)
    {
        name = s;
        System.out.println(name);
    }
}
class PersonDetails
{
    public static void main(String args[])
    {  
    Scanner sc = new Scanner(System.in);
    Person obj1 = new Person();
    Person obj2 = obj1;
    obj1.display("Rogers");
    }

}
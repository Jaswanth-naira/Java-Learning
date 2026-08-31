import java.util.*;
class Person 
{
     private int age;
     
     boolean setAge(int personAge)
     {
          if( personAge<0 || personAge>120) return false; 
          age = personAge;
          return true;
     }

     int getAge()
     {
         return age;
     }
}
class PersonDetails 
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter person's Age: ");
         if(!sc.hasNextInt()){
            System.out.println("Invalid Type!! Please enter valid numerical data.");
            sc.close();
            return;
         }

         int age = sc.nextInt();

         Person person = new Person();

        
         if(person.setAge(age))
         {
            System.out.println("Person's Age is: " + person.getAge());
         }
         
         else 
         {
            System.out.println("Invalid Input!!!Age must be between 0 and 120.");
         }

         sc.close();

     }
}
import java.util.Scanner;
class PrimitiveTypes 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter a byte value: ");
       byte value = sc.nextByte();
       System.out.println("You entered: "+value);

       System.out.println("Enter a short value: ");
       short age = sc.nextShort();
       System.out.println("You entered: "+age);

       System.out.println("Enter an integer value: ");
       int number = sc.nextInt();
       System.out.println("You entered: "+number);
      
       System.out.println("Enter long value: ");
       long salary = sc.nextLong();
       System.out.println("You entered: "+salary);

       System.out.println("Enter float value:");
       float price = sc.nextFloat();
       System.out.println("You entered: "+price);
       
       System.out.println("Enter double value:");
       double pi = sc.nextDouble();
       System.out.println("You entered: "+pi);
       
       System.out.println("Enter char value:");
       char grade = sc.next().charAt(0);
       System.out.println("You entered: "+grade);
      
       System.out.println("Enter boolean value:");
       boolean isJavaFun = sc.nextBoolean();
       System.out.println("You entered: "+isJavaFun);

       sc.close();
    }
}
import java.util.*;
class StringOperator 
{     
      public static void main(String args[])
      {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the input String s1:");
          String s1 = sc.next();
          System.out.print("Enter the input String s2:");
          String s2 = sc.next();
          String s3 = new String("hello");
          System.out.println(s1 == s2);
          System.out.println(s1 == s3);
          System.out.println(s1.equals(s3));
      } 
}
// file 3: zoo/app/ZooApp.java
package zoo.app;
import zoo.birds.Parrot;
public class ZooApp 
{
    public static void main(String[] args)
    {
         Parrot parrot = new Parrot("Mithu");
         System.out.println(parrot.getName());
         System.out.println(parrot.getTag());
         System.out.println(parrot.getCategory());
    }
}
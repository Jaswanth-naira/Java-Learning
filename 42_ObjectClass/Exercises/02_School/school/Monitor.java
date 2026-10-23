package school;
public class Monitor extends Student
{
   private final String duty;

   public Monitor(int rollNo, String name, String duty)
   {
        super(rollNo,name);
        this.duty = duty;
   }

   @Override
   public String toString() 
   {
       return super.toString() + " [" + duty + "]";
   }
}
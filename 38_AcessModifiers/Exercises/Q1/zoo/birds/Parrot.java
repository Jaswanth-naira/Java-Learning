// File 2: zoo/birds/Parrot.java 
package zoo.birds;
import zoo.base.Animal;

public class Parrot extends Animal{
    public Parrot(String name)
    {
        super(name,2);
    }

    public String getTag()
    {
        return getName() + "-" + legs;
    }

    @Override 
    public String getCategory()
    {
        return "bird";
    }
}
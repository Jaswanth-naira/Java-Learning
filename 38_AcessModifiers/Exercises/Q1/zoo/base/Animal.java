//File 1: zoo/base/Animal.java
package zoo.base;
public class Animal 
{
    private String name;
    protected int legs;

    public Animal(String name, int legs)
    {
         this.name = name;
         this.legs = legs;
    }

    public String getName()
    {
        return name;
    }

    public String getCategory()
    {
        return "animal";
    }
}
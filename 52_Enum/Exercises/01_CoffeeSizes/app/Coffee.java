package app;
public class Coffee 
{
    private final String name;
    private final Size size;

    public Coffee(String name, Size size)
    {
        this.name = name;
        this.size = size;
    }

    public String getName()
    {
        return name;
    }

    public Size getSize()
    {
        return size;
    }

    public boolean isSize(Size size)
    {
        return this.size == size ;
    }

    public boolean isBiggerThan(Coffee other)
    {
        return this.size.ordinal() > other.size.ordinal();
    }

    public int upgradesLeft()
    {
        return (Size.values().length-1) - this.size.ordinal();
    }

}
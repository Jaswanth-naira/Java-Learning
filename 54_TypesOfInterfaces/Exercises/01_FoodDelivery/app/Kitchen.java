package app;
public class Kitchen
{
    public boolean isVegetarian(MenuItem item)
    {
        return item instanceof Vegetarian;
    }
}
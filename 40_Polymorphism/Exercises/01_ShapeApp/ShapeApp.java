public class Shape 
{
   public String name = "shape";

   public String getName()
   {
        return name;
   }

   public int getSides()
   {
         return 0;
   }
}
public class Square extends Shape 
{
    public String name = "Square";

    @Override 
    public String getName()
    {
        return name;
    }

    @Override
    public int getSides()
    {
        return 4;
    }

    public int getArea(int side)
    {
        return side * side;
    }
}

public class ShapeApp 
{
    public static String describe(Shape shape)
    {
        return "any shape";
    }

    public static String describe(Square square)
    {
         return "a square";
    }

    public static void main(String[] args)
    {
        Shape a = new Shape();
        Shape b = new Square();
        Square c = new Square();
        System.out.println(a.getSides());  
        System.out.println(b.getSides());  
        System.out.println(b.getName());    
        System.out.println(b.name);         
        System.out.println(describe(b));    
        System.out.println(describe(c));    
       
    }
}


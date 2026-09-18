class Visitor
{
    private String name;
    private static int visitorCount;

    Visitor()
    {
        this("Guest");
    }

    Visitor(String name)
    {
        this.name = name;
        visitorCount++;
    }

    String getName()
    {
        return name;
    }

    int getVisitorCounter()
    {
        return visitorCount;
    }

}
class VisitorApp
{
    public static void main(String[] args)
    {
        Visitor first = new Visitor();
        System.out.println("After first visitor: " + first.getVisitorCounter());
        Visitor second = new Visitor("Anika");
        System.out.println("After second visitor: " + second.getVisitorCounter());
        Visitor saved = second;
        System.out.println("After reference assignment: " + saved.getVisitorCounter());
        Visitor third = new Visitor("Ravi");
        System.out.println("After third visitor: " + third.getVisitorCounter());
        System.out.println(first.getName() + ": " + first.getVisitorCounter());
        System.out.println(second.getName() + ": " + second.getVisitorCounter());
        System.out.println(third.getName() + ": " + third.getVisitorCounter());
        
    }
}
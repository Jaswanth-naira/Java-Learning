package app;
public class Main 
{
    public static void main(String[] args)
    {
        String[] titles = {"Dune",null,"Emma"};
        Shelf shelf = new Shelf(titles);
        System.out.println("Slot 0 title: " + shelf.titleAt(0));
        System.out.println("Slot 0 length: " + shelf.titleLength(0));
        System.out.println("Slot 1 title: " + shelf.titleAt(1));
      
        System.out.println("Slot 0 has title: " + shelf.hasTitle(0));
        System.out.println("Slot 1 has title: " + shelf.hasTitle(1));
        System.out.println("Slot 3 has title: " + shelf.hasTitle(3));
        System.out.println("Slot -1 has title: " + shelf.hasTitle(-1));

        if(shelf.hasTitle(1))
        {
            System.out.println("Slot 1 length: " + shelf.titleLength(1));
        }
        else 
        {
            System.out.println("Slot 1 length: none");
        }

        if(shelf.hasTitle(2))
        {
            System.out.println("Slot 2 length: " + shelf.titleLength(2));
        }
        else 
        {
            System.out.println("Slot 2 length: none");
        }
    }
}
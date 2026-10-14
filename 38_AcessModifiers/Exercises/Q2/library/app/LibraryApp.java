//file 3: library.app.LibraryApp.java 
package library.app;
import library.core.Item;
import library.media.Dvd;
class LibraryApp 
{
    public static void main(String[] args)
    {
        Item atlas = new Item("Atlas",14);
        Dvd movie = new Dvd("Inception");
        Item[] items = {atlas, movie};
        for(Item item: items)
        {
            System.out.println(item.getTitle());
            System.out.println(item.getLateFee(3));
        }
        System.out.println(movie.isOverdue(10));
        System.out.println(movie.isOverdue(7));
        System.out.println(movie.getLabel());
        System.out.println(Item.getCount());
    }
}
class Book 
{
    private String title;
    private int pageCount;
    private static int createdCount = 0;

    private Book(String title, int pageCount)
    {
        this.title = title;
        this.pageCount = pageCount;
        createdCount++;
    }

    static Book create(String title, int pageCount)
    {
        if(title == null || title.trim().isEmpty() || pageCount <= 0 ) return null;
        title = title.trim();
        Book book = new Book(title, pageCount);
        return book;
    }

    String getTitle()
    {
        return title;
    }

    int getPageCount()
    {
        return pageCount;
    }

    static int getCreatedCount()
    {
         return createdCount;
    }
}


class BookFactoryApp
{
    public static void main(String[] args)
    {
         System.out.println("Created initially: " + Book.getCreatedCount());
         Book first = Book.create(" Java Basics ", 250);
         Book blankTitle = Book.create(" ",100);
         Book zeroPages = Book.create("Algorithms", 0);
         Book nullTitle = Book.create(null, 200);
         Book second = Book.create("Data Structures", 400);
         Book anotherFirst = Book.create("Java Basics", 250);
         if(first != null)
         {
         System.out.println("First: " + first.getTitle() + ", " + first.getPageCount() + " pages");
         }
         System.out.println("Blank title rejected: " + (blankTitle == null));
         System.out.println("Zero pages rejected: " + (zeroPages == null));
         System.out.println("Null title rejected: " + (nullTitle ==  null));
         if(second != null)
         {
         System.out.println("Second: " + second.getTitle() + ", " + second.getPageCount() + " pages");
         }
         System.out.println("Same object: " + (anotherFirst == first));
         System.out.println("Created finally: " + Book.getCreatedCount());

    }
}
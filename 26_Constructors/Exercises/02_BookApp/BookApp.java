class Book 
{
    private String title;
    private int pageCount;
    
    Book(String title, int pageCount)
    {
        this.title = title;
        this.pageCount = pageCount;
    }

    String getTitle()
    {
        return title;
    }

    int getPageCount()
    {
        return pageCount;
    }

}
class BookApp
{
    public static void main(String args[])
    {
       Book firstBook = new Book("Java Basics", 250);
       Book secondBook = new Book("Data Structures", 400);

       System.out.println("First book: " + firstBook.getTitle() + ", " + firstBook.getPageCount() + " pages");
       System.out.println("Second book: " + secondBook.getTitle() + ", " + secondBook.getPageCount() + " pages");
       
    }
}
class Notebook 
{
    private int pagesUsed = 0;

    boolean write(int pages)
    {
        if(pages <= 0 || pages > getPagesLeft()) return false;
        pagesUsed += pages;
        return true;
    }

    int getPagesUsed()
    {
        return pagesUsed;
    }
    
    int getPagesLeft()
    {
        return 100-pagesUsed;
    }

}

class LabeledNotebook extends Notebook
{
     private String label = "Untitled";

     boolean setLabel(String label)
     {
        if(label == null || label.trim().isEmpty()) return false;
        this.label = label.trim();
        return true;
     }

     String getLabel()
     {
        return label;
     }
}

class SharedNotebook extends LabeledNotebook 
{
    private int contributors = 0;

    boolean writeTogether(int pagesEach)
    {
        if(pagesEach <= 0 || contributors == 0) return false;
        return write(pagesEach * contributors);
    }

    boolean addContributor()
    {
        if(contributors == 5) return false;
        contributors++;
        return true;
    }

    int getContributors()
    {
        return contributors;
    }
}

class ShelfTools
{
    static boolean fillRemaining(Notebook book)
    {
        if(book == null || book.getPagesLeft() == 0) return false; 
        return book.write(book.getPagesLeft());
    }

    static void replaceWithNew(Notebook book)
    {
        book = new Notebook();
        book.write(50);
    }

    static int totalPagesUsed(Notebook[] shelf)
    {
        if(shelf == null) return 0;
        int totalPagesCount = 0;
        for(Notebook book : shelf)
        {
            if(book == null) continue;
            totalPagesCount += book.getPagesUsed();
        }
        return totalPagesCount;
    }

    static int totalPagesUsedDistinct(Notebook[] shelf)
    {
        if(shelf == null) return 0;
        int totalDistinctPagesCount = 0;
        
          for(int i = 0; i < shelf.length; i++)
          {
            if(shelf[i] == null) continue;
            boolean seenBefore = false;
            for(int j = 0; j < i; j++)
            {
                if(shelf[j] == shelf[i])
                {
                   seenBefore = true;
                   break;
                } 
                
            }

            if(!seenBefore) totalDistinctPagesCount += shelf[i].getPagesUsed();
        }

        return totalDistinctPagesCount;
    }

    static boolean swap(Notebook[] shelf, int i, int j)
    {
        if(shelf == null || i < 0 || j < 0 || i >= shelf.length || j >= shelf.length) return false;
        Notebook temp = shelf[i];
        shelf[i] = shelf[j];
        shelf[j] = temp;
        return true;
    }
}

class StudyApp
{
    public static void main(String[] args)
    {
        
        Notebook plainBook = new Notebook();
        LabeledNotebook labBook = new LabeledNotebook();
        SharedNotebook groupBook = new SharedNotebook();
        
    
        labBook.setLabel("  Physics  ");
        System.out.println("Lab label: " + labBook.getLabel()); 
        groupBook.setLabel("Group project");
        System.out.println("Blank label accepted: " + groupBook.setLabel("  "));  
        System.out.println("Group label: " + groupBook.getLabel());
        plainBook.write(30);
        groupBook.write(10);
        groupBook.addContributor(); 
        groupBook.addContributor();
        groupBook.addContributor();  
        System.out.println("Plain pages used: " + plainBook.getPagesUsed());
        System.out.println("Group pages used: " + groupBook.getPagesUsed());
        System.out.println("Group pages left: " + groupBook.getPagesLeft());
        System.out.println("Group contributors: " + groupBook.getContributors());
 
        System.out.println("Write together 20 each: " + groupBook.writeTogether(20));
        System.out.println("Group pages used: " + groupBook.getPagesUsed());
        System.out.println("Write together 15 each: " + groupBook.writeTogether(15));
        System.out.println("Group pages used: " + groupBook.getPagesUsed());
        System.out.println("Contributor 4: " + groupBook.addContributor());
        System.out.println("Contributor 5: " + groupBook.addContributor());
        System.out.println("Contributor 6: " + groupBook.addContributor());
        System.out.println("Write together 6 each: " + groupBook.writeTogether(6));
        System.out.println("Group pages left: " + groupBook.getPagesLeft());
        
        System.out.println("Fill lab book: " + ShelfTools.fillRemaining(labBook));
        System.out.println("Lab pages used: " + labBook.getPagesUsed());
        System.out.println("Fill group book: " + ShelfTools.fillRemaining(groupBook));
        ShelfTools.replaceWithNew(plainBook);
        System.out.println("After replaceWithNew, plain pages used: " + plainBook.getPagesUsed());
        System.out.println("Fill null: " + ShelfTools.fillRemaining(null));

        Notebook[] shelf = {plainBook, groupBook, null, plainBook};
        System.out.println("Total pages (every slot): " + ShelfTools.totalPagesUsed(shelf));
        System.out.println("Total pages (distinct notebooks): " + ShelfTools.totalPagesUsedDistinct(shelf));
        System.out.println("Swap 0 and 1: " + ShelfTools.swap(shelf,0,1));
        System.out.println("Shelf slot 0 pages used: " + shelf[0].getPagesUsed());
        System.out.println("Plain pages used: " + plainBook.getPagesUsed());
        System.out.println("Swap 0 and 4: " + ShelfTools.swap(shelf,0,4));
        System.out.println("Slot 0 is group book: " + (shelf[0] == groupBook));
        System.out.println("Distinct total of null shelf: " + ShelfTools.totalPagesUsedDistinct(null));

    }
}
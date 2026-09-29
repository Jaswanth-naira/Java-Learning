class LearningResource 
{
    private String title;

    LearningResource()
    {
        this.title = "Untitled";
    }

    boolean setTitle(String title)
    {
        if(title == null || title.trim().isEmpty()) return false;
        this.title = title.trim();
        return true;
    }

    String getTitle()
    {
        return title;
    }
}

class Textbook extends LearningResource 
{
    private int pageCount;

    Textbook(String title, int pageCount)
    {
        setTitle(title);
        this.pageCount = pageCount;
    }

    int getPageCount()
    {
        return pageCount;
    }
}

class AudioLesson extends LearningResource 
{
    private int durationMinutes;
    
    AudioLesson(String title, int durationMinutes)
    {
        setTitle(title);
        this.durationMinutes = durationMinutes;
    }

    int getDurationMinutes()
    {
        return durationMinutes;
    }
}
class ResourceShelf 
{
    private LearningResource[] resources;
    private int resourceCount;

    ResourceShelf()
    {
        this.resources = new LearningResource[2];
        this.resourceCount = 0;
    }
    
    boolean addResource(LearningResource resource)
    {
       if(resource == null || resourceCount >= resources.length) return false;
       
       for(int i = 0; i < resourceCount; i++)
       {
           if(resources[i] == resource) return false;
       }
       resources[resourceCount++] = resource;
       return true;
    }

    LearningResource getResource(int index)
    {
        if(index < 0 || index >= resourceCount) return null;
        return resources[index];
    }

    LearningResource findByTitle(String title)
    {
        if(title == null || title.trim().isEmpty()) return null;
        String trimmedSearch = title.trim();
        for(int i = 0; i < resourceCount; i++)
        {
            if(resources[i].getTitle().equals(trimmedSearch))
            {
                return resources[i];
            }
        }
       return null;
    }

    int getResourceCount()
    {
        return resourceCount;
    }
} 

class ResourceShelfApp 
{
    public static void main(String[] args)
    {
        Textbook book = new Textbook(" Java Basics ", 250);
        AudioLesson audio = new AudioLesson("Java Basics", 30);
        Textbook extra = new Textbook("Arrays", 180);
        ResourceShelf shelf = new ResourceShelf();

        System.out.println("Initial resource count: " + shelf.getResourceCount());
        System.out.println("Add null: " + shelf.addResource(null));
        System.out.println("Add book: " + shelf.addResource(book));
        System.out.println("Add same book again: " + shelf.addResource(book));
        System.out.println("Add audio: " + shelf.addResource(audio));
        System.out.println("Add extra: " + shelf.addResource(extra));

        System.out.println("Resource count: " + shelf.getResourceCount());
        System.out.println("Book pages: " + book.getPageCount());
        System.out.println("Audio duration: " + audio.getDurationMinutes() + " minutes ");
        LearningResource found = shelf.findByTitle(" Java Basics ");
        System.out.println("First match is book: " + (found == book));

        boolean renameResult = false;
        if(found != null){
            renameResult = found.setTitle("Java Foundations");
        } 

        System.out.println("Rename selected: " + renameResult);

        System.out.println("Book title: " + book.getTitle());
        System.out.println("Audio title: " + audio.getTitle());

        System.out.println("New title finds book: " + (shelf.findByTitle("Java Foundations") == book));
        System.out.println("Old title now finds audio: " + (shelf.findByTitle("Java Basics") == audio));

        System.out.println("Slot 0 is book: " + (shelf.getResource(0) == book));
        System.out.println("Invalid index rejected: " + (shelf.getResource(2) == null));
        System.out.println("Missing title rejected: " + (shelf.findByTitle("Python") == null));
    }
}
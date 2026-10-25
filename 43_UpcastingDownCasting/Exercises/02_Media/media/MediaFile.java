package media;
public class MediaFile 
{
    private final String name;
    private final int sizeMb;

    public MediaFile(String name, int sizeMb)
    {
        this.name = name;
        this.sizeMb = sizeMb;
    }

    public String getName()
    {
        return name;
    }

    public int getSizeMb()
    {
        return sizeMb;
    }

    public String type()
    {
        return "file";
    }
}
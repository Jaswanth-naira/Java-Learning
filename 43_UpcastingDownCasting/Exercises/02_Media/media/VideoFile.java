package media;
public class VideoFile extends MediaFile
{
    private final int durationMin;

    public VideoFile(String name, int sizeMb, int durationMin)
    {
        super(name,sizeMb);
        this.durationMin = durationMin;
    } 

    public int getDurationMin()
    {
        return durationMin;
    }

    @Override 
    public String type()
    {
        return "video";
    }
}
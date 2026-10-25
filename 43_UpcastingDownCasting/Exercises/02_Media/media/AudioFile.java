package media;
public class AudioFile extends MediaFile 
{
     private final int bitrate;

     public AudioFile(String name, int sizeMb, int bitrate)
     {
          super(name,sizeMb);
          this.bitrate = bitrate;
     }

     public int getBitrate()
     {
        return bitrate;
     }

     @Override 
     public String type()
     {
        return "audio";
     }
}
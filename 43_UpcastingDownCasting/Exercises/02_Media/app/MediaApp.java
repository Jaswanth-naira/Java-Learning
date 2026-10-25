package app;

import media.AudioFile;
import media.MediaFile;
import media.VideoFile;

public class MediaApp 
{
    private static int totalVideoMinutes(MediaFile[] files)
    {
        int total = 0;
        for(MediaFile file: files)
        {
            if(file instanceof VideoFile video) total += video.getDurationMin();
        }
          return total;
    }

    private static VideoFile findLongestVideo(MediaFile[] files)
    {
        VideoFile longest = null;
        for ( MediaFile file: files)
        {
            if(file instanceof VideoFile video)
            {
                if(longest == null || video.getDurationMin() > longest.getDurationMin()) longest = video;
            }
        }
        return longest;
    }

    private static String label(MediaFile file)
    {
        return "generic";
    }

    private static String label(VideoFile file)
    {
        return "video-label";
    }

    public static void main(String[] args)
    {
        MediaFile[] library = {
                              new VideoFile("intro", 120, 5),
                              new AudioFile("song", 8, 320),
                              null,
                              new VideoFile("lecture",900,45),
                              new MediaFile("notes", 1)
                              };
        System.out.println(totalVideoMinutes(library));
        VideoFile longest = findLongestVideo(library);
        System.out.println(longest.getName() + " " + longest.getDurationMin());

        MediaFile general = longest;
        System.out.println(general.type());
        System.out.println(label(general));

        System.out.println(label((VideoFile) general));
        System.out.println(((AudioFile) library[1]).getBitrate());
    }
}
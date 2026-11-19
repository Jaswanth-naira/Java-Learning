package app;
public class Speaker 
{
    private static final int MAX_VOLUME = 100;

    private int volume;

    public int maxVolume()
    {
        return MAX_VOLUME;
    }

    public void setVolume(int volume)
    {
        if(volume > maxVolume()) 
        {
            this.volume = maxVolume();
        }
        else 
        {
            this.volume = volume;
        }
    }

    public int getVolume()
    {
        return volume;
    }
    
    @Deprecated
    public void setVol(int volume)
    {
        setVolume(volume);
    }
}
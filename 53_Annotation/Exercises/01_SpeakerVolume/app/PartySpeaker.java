package app;
public class PartySpeaker extends Speaker
{
     private static final int  MAX_VOLUME = 150; 
     
     @Override 
     public int maxVolume()
     {
         return MAX_VOLUME;
     }
}
package app;
public class Main 
{   
    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {
        Speaker speaker = new Speaker();

        System.out.println("Speaker max: " + speaker.maxVolume());
        speaker.setVolume(120);
        System.out.println("Speaker volume: " + speaker.getVolume());
        
        PartySpeaker partySpeaker = new PartySpeaker();
        System.out.println("Party speaker max: " + partySpeaker.maxVolume());
        partySpeaker.setVolume(120);
        System.out.println("Party speaker volume: " + partySpeaker.getVolume());
        partySpeaker.setVolume(200);
        System.out.println("Party speaker volume: " + partySpeaker.getVolume());

        speaker.setVol(60);
        System.out.println("Speaker volume after setVol: " + speaker.getVolume());
        partySpeaker.setVol(130);
        System.out.println("Party speaker volume after setVol: " + partySpeaker.getVolume());
        
    }
}
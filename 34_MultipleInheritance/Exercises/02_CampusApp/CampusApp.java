class Device 
{
    private boolean on = false;
    private int hoursUsed = 0;

    boolean turnOn()
    {
        if(on) return false;
        on = true;
        return true;
    }

    boolean turnOff()
    {
        if(!on) return false;
        on = false;
        return true;
    }

    boolean use(int hours)
    {
        if(hours <= 0 || (!on)) return false;
        hoursUsed += hours;
        return true;
    }

    boolean isOn() 
    {
        return on;
    }

    int getHoursUsed()
    {
        return hoursUsed;
    }
}

class Projector extends Device 
{
    boolean showSlide(String title)
    {
        if(title == null || title.trim().isEmpty() || (!isOn())) return false;
        return true;
    }
}
class Speaker extends Device 
{
    private int volume = 5;
    boolean setVolume(int volume)
    {
        if( volume < 0 || volume > 10) return false;
        this.volume = volume;
        return true;
    }

    int getVolume()
    {
        return volume;
    }
}
class Classroom 
{
     private String name;
     private Projector projector;
     private Speaker speaker;

     Classroom(String name, Projector projector, Speaker speaker)
     {
        this.name = name;
        this.projector = projector;
        this.speaker = speaker;
     }

     boolean startLecture()
     {
        if(projector.isOn() || speaker.isOn()) return false;
        speaker.turnOn();
        projector.turnOn();
        return true;
     }

     boolean runLecture(int hours)
     {
        if(hours <=0 || !projector.isOn() || !speaker.isOn()) return false;
        speaker.use(hours);
        projector.use(hours);
        return true;
     }

     boolean endLecture()
     {
        if(!projector.isOn() || !speaker.isOn()) return false;
        projector.turnOff();
        speaker.turnOff();
        return true;
     }
}
class CampusTools 
{
  static int countDevicesOn(Device[] devices)
  {
    if(devices == null) return 0;
    int turnedOnDevices = 0;
    for(Device device: devices)
    {
        if(device == null) continue;
        if(device.isOn()) turnedOnDevices++;
    }
    return turnedOnDevices;
  }
}
class CampusApp
{
    public static void main(String[] args)
    {
       Projector projector1 = new Projector();
       Projector projector2 = new Projector();
       System.out.println("Slide while off: " + projector1.showSlide("Intro"));
       System.out.println("Projector on: " + projector1.turnOn());
       System.out.println("Slide while on: " + projector1.showSlide("Intro"));
       System.out.println("Projector off: " + projector1.turnOff());
       
       Speaker sharedSpeaker = new Speaker();
       System.out.println("Volume 11: " + sharedSpeaker.setVolume(11));
       System.out.println("Volume 8: " + sharedSpeaker.setVolume(8));
       System.out.println("Speaker volume: " + sharedSpeaker.getVolume());

       Classroom roomA = new Classroom("Room A", projector1,sharedSpeaker);
       Classroom roomB = new Classroom("Room B", projector2,sharedSpeaker);

       System.out.println("Room A starts: " + roomA.startLecture());
       System.out.println("Room B starts: " + roomB.startLecture());
       System.out.println("Room B projector on: " + projector2.isOn());
       System.out.println("Room A runs 2 hours: " + roomA.runLecture(2));
       System.out.println("Projector 1 hours: " + projector1.getHoursUsed());
       System.out.println("Shared speaker hours: " + sharedSpeaker.getHoursUsed());

       Device[] devices = {projector1, projector2, sharedSpeaker, null};
       System.out.println("Devices on: " + CampusTools.countDevicesOn(devices));
       System.out.println("Room A ends: " + roomA.endLecture());
       System.out.println("Devices on: " + CampusTools.countDevicesOn(devices));
       System.out.println("Room B starts: " + roomB.startLecture());
       System.out.println("Room B runs 3 hours: " + roomB.runLecture(3));
       System.out.println("Projector 2 hours: " + projector2.getHoursUsed());
       System.out.println("Shared speaker hours: " + sharedSpeaker.getHoursUsed());
       System.out.println("Devices on: " + CampusTools.countDevicesOn(devices));
       System.out.println("Null list count: " + CampusTools.countDevicesOn(null));
    }
}
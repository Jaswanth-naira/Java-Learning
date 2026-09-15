import java.util.Scanner;
class SpeakerSettings 
{
     private int volume;
     private boolean defaultVolumeUsed;
     
     SpeakerSettings(int volume)
     {
         if((volume >=0 && volume <=100)){
            this.volume = volume;
            this.defaultVolumeUsed = false;
            return;
         }
         this.volume = 50;
         this.defaultVolumeUsed = true;
     }

     int getVolume()
     {
         return volume;
     }

     boolean getDefaultVolumeUsed()
     {
         return defaultVolumeUsed;
     }

}

class SpeakerApp
{
      public static void main(String[] args)
      {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the volume bar (0-100): ");
          if(!scanner.hasNextInt()){
            System.out.println("Invalid Input!Enter an integer.");
            scanner.close();
            return;
          }
          int requestedVolume = scanner.nextInt();   
          SpeakerSettings settings = new SpeakerSettings(requestedVolume);
          
          System.out.println("Volume: " + settings.getVolume());
          System.out.println("Default used: " + settings.getDefaultVolumeUsed());
          scanner.close();
      }
}
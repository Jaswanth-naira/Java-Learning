class PortableDevice 
{
     private int batteryLevel = 100;

     int getBatteryLevel()
     {
        return batteryLevel;
     }

     boolean usedBattery(int amount)
     {
         if(amount <=0 || amount > batteryLevel) return false;
         batteryLevel = batteryLevel - amount;
         return true;
     }
}
class MusicPlayer extends PortableDevice
{
        boolean playTrack()
        {
            return usedBattery(30);      
        }
}
class MusicPlayerApp 
{
   public static void main(String[] args)
   {
        MusicPlayer player = new MusicPlayer();
        System.out.println("Initial battery: " + player.getBatteryLevel());
        System.out.println("Track 1: " + player.playTrack());
        System.out.println("Battery: " + player.getBatteryLevel());
        System.out.println("Track 2: " + player.playTrack());
        System.out.println("Battery: " + player.getBatteryLevel());
        System.out.println("Track 3: " + player.playTrack());
        System.out.println("Battery: " + player.getBatteryLevel());
        System.out.println("Track 4: " + player.playTrack());
        System.out.println("Battery: " + player.getBatteryLevel());
        System.out.println("Invalid use: " + player.usedBattery(0));
        System.out.println("Final battery: " + player.getBatteryLevel());
   }
}
class Camera 
{
    private int photosToken = 0;

    boolean takePhoto()
    {
        if(photosToken == 3) return false;
        photosToken++;
        return true;
    }

    int getPhotosToken()
    {
        return photosToken;
    }

    String powerOn()
    {
        return "Lens Open";
    }
}

class MusicPlayer 
{
    private int songsPlayed = 0;
    
    boolean playSong(String title)
    {
        if(title == null || title.trim().isEmpty()) return false;
        songsPlayed++;
        return true;
    }

    int getSongsPlayed()
    {
        return songsPlayed;
    }

    String powerOn()
    {
        return "Speaker on";
    }
}

class SmartPhone
{
     private Camera camera = new Camera();
     private MusicPlayer player = new MusicPlayer();

     String powerOn()
     {
        return camera.powerOn() + " + "  + player.powerOn();
     }

     boolean takePhoto()
     {
        return camera.takePhoto();
     }

     boolean playSong(String title)
     {
        return player.playSong(title);
     }

     int getPhotosToken()
     {
        return camera.getPhotosToken();
     }

     int getSongsPlayed()
     {
        return player.getSongsPlayed();
     }
}

class PhoneApp
{
    public static void main(String[] args)
    {
        SmartPhone phone = new SmartPhone();
        System.out.println("Power on: " + phone.powerOn());
        System.out.println("Photo 1: " + phone.takePhoto());
        System.out.println("Photo 2: " + phone.takePhoto());
        System.out.println("Song played: " + phone.playSong("Lofi beats"));
        System.out.println("Blank song: " + phone.playSong(" "));
        System.out.println("Photos taken: " + phone.getPhotosToken());
        System.out.println("Songs played: " + phone.getSongsPlayed());
        System.out.println("Photo 3: " + phone.takePhoto());
        System.out.println("Photo 4: " + phone.takePhoto());
        System.out.println("Phone photos taken: " + phone.getPhotosToken());

        SmartPhone friendPhone = new SmartPhone();
        System.out.println("Friend photos taken: " + friendPhone.getPhotosToken());
    }
}
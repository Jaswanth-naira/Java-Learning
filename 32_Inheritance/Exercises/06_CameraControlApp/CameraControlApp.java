class Device 
{
    private boolean poweredOn = false;

    void turnOn()
    {
        poweredOn = true;
    }

    void turnOff()
    {
        poweredOn = false;
    }

    boolean isPoweredOn()
    {
        return poweredOn;
    }

}
class Camera extends Device 
{
     private int photoCount = 0;

     boolean takePhoto()
     {
        if(!isPoweredOn()) return false;
        photoCount++;
        return true;
     }

     int getPhotoCount()
     {
        return photoCount;
     }
}
class CameraControlApp 
{
    public static void main(String[] args)
    {
        Camera camera = new Camera();
        Device device = camera;

        System.out.println("Same object: " + (camera == device)); 
        System.out.println("Power initially: " + camera.isPoweredOn());  
        System.out.println("Photo before power on: " + camera.takePhoto());   
        device.turnOn();
        System.out.println("Power after switching on: " + camera.isPoweredOn());
        System.out.println("Photo 1: " + camera.takePhoto());
        System.out.println("Photo 2: " + camera.takePhoto());
        System.out.println("Photos taken: " + camera.getPhotoCount());
        device.turnOff();
        System.out.println("Power after switching off: " + camera.isPoweredOn());
        System.out.println("Photo after switching off: " + camera.takePhoto());
        System.out.println("Final photo count: " + camera.getPhotoCount());
    }
}
import java.util.Scanner;
class SmartLight 
{
    private String roomName;
    private boolean on;

    boolean setRoomName(String name)
    {
        if( name == null || name.trim().isEmpty()) return false;
        roomName = name.trim();
        return true;
    }

    boolean setOn(String status)
    {
        if(status == null || status.trim().isEmpty()) return false;
        status = status.trim();
        
        if(status.equalsIgnoreCase("ON")){
            on = true;
            return true;
        }

        if(status.equalsIgnoreCase("OFF")){
            on = false;
            return true;
        }

        return false;
    }
     
    String getRoomName()
    {
        return roomName;
    }

     boolean isOn()
     {
        return on;
     }

}


class SmartRoom 
{
    public static void main(String args[])
    {
         Scanner scanner = new Scanner(System.in);
         SmartLight light = new SmartLight();

         
         System.out.print("Please enter room name: ");
         String roomName = scanner.nextLine();


         if(!light.setRoomName(roomName)){
            System.out.println("Invalid Input! Please enter a valid name.");
            scanner.close();
            return;
         }

         System.out.print("Please choose on or off (ON/OFF): ");
         String lightStatus = scanner.nextLine();
         
         if(!light.setOn(lightStatus)){
            System.out.println("Invalid Input! Please enter a valid text (ON/OFF).");
            scanner.close();
            return;
         }

         System.out.println("\n------DISPLAYING SMART ROOM DETAILS------");
         System.out.println("Room name: " + light.getRoomName());
         System.out.println("Light status: " + light.isOn());
         scanner.close();              
         

    }
}
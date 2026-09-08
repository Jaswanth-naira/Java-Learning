import java.util.Scanner;
class SmartHeater 
{
     private int targetTemperature;
     private boolean on;

     boolean setTargetTemperature(int temp)
     {
           if(!(temp >=15 && temp <=30) || !on) return false;

           targetTemperature = temp;
           return true;
     }

     boolean setOn(boolean state)
     {
           on = state;
           return on;
     }

     int getTargetTemperature()
     {
           return targetTemperature;
     }

     boolean isOn()
     {
        return on;
     }
     
}
class ElectricHeater 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        SmartHeater heater = new SmartHeater();
        
    
        System.out.print("Enter target temperature: ");

        if(!scanner.hasNextInt()){
            System.out.println("Invalid Input! Please enter a valid number.");
            scanner.close();
            return;
        }

        int temperature = scanner.nextInt();


        if(!heater.setTargetTemperature(temperature)){
            if(!heater.isOn()){
                System.out.println("Heater is off. Cannot set the temperature.");
            }
            else 
            {
                 System.out.println("Temperature must be between 15 and 30.");
            }
        }

        System.out.print("Enter heater's state ON/OFF: ");

        if(!scanner.hasNextBoolean()){
            System.out.println("Invalid Input! Please choose true or false.");
            scanner.close();
            return;
        }

        boolean state = scanner.nextBoolean();
        heater.setOn(state);
        System.out.println("Heater is now on: " + heater.isOn());

        System.out.print("Enter target temperature: ");
          if(!scanner.hasNextInt()){
            System.out.println("Invalid Input! Please enter a valid number.");
            scanner.close();
            return;
        }
        temperature = scanner.nextInt();
        
        
        if(!heater.setTargetTemperature(temperature)){
            System.out.println("Invalid! Temperature must be between 15 and 30.");
        }
        else{
            System.out.println("Success. Target Temperature set to " + heater.getTargetTemperature());
        }
        
        System.out.print("Enter target temperature: ");
          if(!scanner.hasNextInt()){
            System.out.println("Invalid Input! Please enter a valid number.");
            scanner.close();
            return;
        }
        temperature = scanner.nextInt();
           
        if(!heater.setTargetTemperature(temperature)){
            System.out.println("Invalid! Temperature must be between 15 and 30.");
        }
        else{
            System.out.println("Success. Target Temperature set to " + heater.getTargetTemperature());
        }
        
        System.out.println("\n-----DISPLAYING FINAL HEATER STATUS-----");
        System.out.println("State: " + heater.isOn());
        System.out.println("Temperature: " + heater.getTargetTemperature());
        scanner.close();
        
    }
}

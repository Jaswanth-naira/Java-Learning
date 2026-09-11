import java.util.Scanner;
class Driver
{
    private String name;

    boolean setName(String name)
    {
        if(name == null || name.trim().isEmpty()) return false;
        this.name = name.trim();
        return true;
    }
    
    String getName()
    {
        return name;
    }

     boolean assignTo(Taxi taxi)
    {
        if(taxi == null) return false;
        return taxi.assignDriver(this);
    }

}

class Taxi 
{
    private Driver driver;

    boolean assignDriver(Driver driver)
    {
        if(driver == null || this.driver != null ) return false;
        this.driver = driver;
        return true;
    }


    String getDriverName()
    {
        if(driver == null) return null;
        return driver.getName();
    }

}



class TaxiDetails 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        Driver ravi = new Driver();
        Driver anika = new Driver();

        Taxi taxi = new Taxi();

        System.out.print("Enter name of first driver: ");
        String firstTaxiDriver = scanner.nextLine();

        if(!ravi.setName(firstTaxiDriver)){
            System.out.println("Name cannot be blank.");
            scanner.close();
            return;
        }

        System.out.print("Enter name of second driver: ");
        String secondTaxiDriver = scanner.nextLine();

        if(!anika.setName(secondTaxiDriver)){
            System.out.println("Name cannot be blank.");
            scanner.close();
            return;
        }

        boolean resultOne = ravi.assignTo(taxi);
        boolean resultTwo = anika.assignTo(taxi);

        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println("Driver: " + taxi.getDriverName());
        scanner.close();

    }
}
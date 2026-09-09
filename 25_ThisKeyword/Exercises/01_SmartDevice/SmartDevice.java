import java.util.Scanner;
class Laptop
{
     private String brand;
     private int ramSize;

     boolean setBrand(String brand)
     {
        if(brand == null || brand.trim().isEmpty()) return false;
        this.brand = brand.trim();
        return true;
     }

     boolean setRamSize(int ramSize)
     {
        if(ramSize <= 0) return false;
        this.ramSize = ramSize;
        return true;
     }

     String getBrand()
     {
         return brand;
     }

     int getRamSize()
     {
        return ramSize;
     }



}
class SmartDevice 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = new Laptop();
        System.out.print("Enter brand name: ");

        String brandName = scanner.nextLine();

        if(!laptop.setBrand(brandName)){
            System.out.println("Brand name cannot be left blank.");
            scanner.close();
            return;
        }

        System.out.print("Enter RAM size: ");

        if(!scanner.hasNextInt()){
            System.out.println("Invalid Input! Please enter valid numerical data.");
            scanner.close();
            return;
        }

        int ramSize = scanner.nextInt();
        
        if(!laptop.setRamSize(ramSize)){
            System.out.println("Ram size must be greater than 0.");
            scanner.close();
            return;
        }

        System.out.println("\n-----DISPLAYING LAPTOP BRAND DETAILS-----");
        System.out.println("Brand: " + laptop.getBrand());
        System.out.println("RAM: " + laptop.getRamSize() + " GB");
        scanner.close();
        

       
    }
}
package app;

public class Main {
    public static void main(String[] args) {
        Appliance[] flatAppliances = {
            new Fan(75, 8),
            new Fridge(150),
            new WashingMachine(1000, 4)
        };
        Home flat = new Home(flatAppliances);

        Appliance[] hostelAppliances = {
            new Fan(100, 30),
            new Fridge(100)
        };
        Home hostelRoom = new Home(hostelAppliances);

        Home emptyStudio = new Home(new Appliance[0]);

        System.out.println("Flat appliances:");
        for (Appliance appliance : flatAppliances) {
            System.out.println(appliance.name() + ": " + appliance.dailyWh());
        }

        printHomeInfo("Flat", flat);
        printHomeInfo("Hostel room", hostelRoom);
        printHomeInfo("Empty studio", emptyStudio);

        System.out.println("Flat uses more than hostel room: " + flat.usesMore(hostelRoom));
        System.out.println("Hostel room uses more than flat: " + hostelRoom.usesMore(flat));
    }

    private static void printHomeInfo(String label, Home home) {
        System.out.println(label + " daily Wh: " + home.totalDailyWh());
        Appliance biggest = home.biggestUser();
        String biggestName = (biggest != null) ? biggest.name() : "none";
        System.out.println(label + " biggest user: " + biggestName);
        System.out.println(label + " heavy appliances: " + home.heavyCount());
        System.out.println(label + " monthly bill: " + home.monthlyBill());
    }
}
package app;
import movies.Cinema;

public class Main {
    public static void main(String[] args) {
        Cinema galaxy = new Cinema("Galaxy", 200, 3);
        Cinema orbit = new Cinema("Orbit", 150, 1);

        
        Cinema.Ticket galaxyStandard = galaxy.sellTicket("A1", false);
        Cinema.Ticket galaxyPremium = galaxy.sellTicket("A2", true);
        Cinema.Ticket orbitPremium = orbit.sellTicket("B1", true);

    
        System.out.println(galaxyStandard.getSeat() + ": " + galaxyStandard.price());
        System.out.println(galaxyPremium.getSeat() + ": " + galaxyPremium.price());
        System.out.println(orbitPremium.getSeat() + ": " + orbitPremium.price());

        
        Cinema.Ticket orbitExtra = orbit.sellTicket("B2", false);
        if (orbitExtra == null) {
            System.out.println("B2: sold out");
        } else {
            System.out.println(orbitExtra.getSeat() + ": " + orbitExtra.price());
        }

        
        System.out.println(galaxy.getCinemaName() + " total sales: " + galaxy.totalSales());
        System.out.println(orbit.getCinemaName() + " total sales: " + orbit.totalSales());

        
        Cinema.Snack popcorn = new Cinema.Snack("Popcorn", 150);
        System.out.println(popcorn.getSnackName() + ": " + popcorn.getPrice());

    }
}
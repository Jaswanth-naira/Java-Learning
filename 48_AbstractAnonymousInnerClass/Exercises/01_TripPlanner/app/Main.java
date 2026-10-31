package app;
import travel.Trip;
public class Main {
    public static void main(String[] args) {
        Trip goaTrip = new Trip("Goa", 3) {
            @Override
            protected int dailyCost() {
                return 2000;
            }

            @Override
            protected int travelCost() {
                return 4500;
            }
            
        };

        System.out.println(goaTrip.getDestination() + ": " + goaTrip.totalCost());
        int fuelCost = 1800;
        Trip coorgTrip = new Trip("Coorg", 2) {
            @Override
            protected int dailyCost() {
                return 1500;
            }

            @Override
            protected int travelCost() {
                return fuelCost * 2;
            }

            @Override
            protected int insuranceCost() {
                return 0;
            }
        };

        System.out.println(coorgTrip.getDestination() + ": " + coorgTrip.totalCost());
        System.out.println("Ooty: " + new Trip("Ooty", 4) {
            @Override
            protected int dailyCost() {
                return 1200;
            }

            @Override
            protected int travelCost() {
                return 0;
            }
        }.totalCost());
    }
}
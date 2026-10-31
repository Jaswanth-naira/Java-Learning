package travel;

public abstract class Trip {
    private final String destination;
    private final int days;
    private static final int INSURANCE_COST = 500;

    public Trip(String destination, int days) {
        this.destination = destination;
        this.days = days;
    }

    public String getDestination() {
        return destination;
    }

    public int getDays() {
        return days;
    }

    protected abstract int dailyCost();

    protected abstract int travelCost();

    protected int insuranceCost() {
        return INSURANCE_COST;
    }

    public final int totalCost() {
        return (dailyCost() * days) + travelCost() + insuranceCost();
    }
}
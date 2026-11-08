package app;

public class Fridge implements Appliance {
    private final int watts;

    public Fridge(int watts) {
        this.watts = watts;
    }

    @Override
    public String name() {
        return "Fridge";
    }

    @Override
    public int dailyWh() {
        return watts * HOURS_PER_DAY;
    }
}
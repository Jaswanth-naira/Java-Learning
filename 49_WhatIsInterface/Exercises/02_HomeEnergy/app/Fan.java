package app;

public class Fan implements Appliance {
    private final int watts;
    private final int hours;

    public Fan(int watts, int hours) {
        this.watts = watts;
        this.hours = hours > HOURS_PER_DAY ? HOURS_PER_DAY : hours;
    }

    @Override
    public String name() {
        return "Fan";
    }

    @Override
    public int dailyWh() {
        return watts * hours;
    }
}
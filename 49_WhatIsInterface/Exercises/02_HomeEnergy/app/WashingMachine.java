package app;

public class WashingMachine implements Appliance {
    private static final int DAYS_PER_WEEK = 7;

    private final int whPerCycle;
    private final int cyclesPerWeek;

    public WashingMachine(int whPerCycle, int cyclesPerWeek) {
        this.whPerCycle = whPerCycle;
        this.cyclesPerWeek = cyclesPerWeek;
    }

    @Override
    public String name() {
        return "Washing machine";
    }

    @Override
    public int dailyWh() {
        return (whPerCycle * cyclesPerWeek) / DAYS_PER_WEEK;
    }
}
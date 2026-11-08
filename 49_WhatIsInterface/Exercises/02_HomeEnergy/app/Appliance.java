package app;

public interface Appliance {
    int HOURS_PER_DAY = 24;

    String name();
    int dailyWh();
}
package app;

public class Home {
    private static final int HEAVY_WH = 2000;
    private static final int DAYS_PER_BILL = 30;
    private static final int RUPEES_PER_KWH = 8;
    private static final int WH_PER_KWH = 1000;

    private final Appliance[] appliances;

    public Home(Appliance[] appliances) {
        this.appliances = appliances != null ? appliances : new Appliance[0];
    }

    public int totalDailyWh() {
        int total = 0;
        for (Appliance appliance : appliances) {
            total += appliance.dailyWh();
        }
        return total;
    }

    public Appliance biggestUser() {
        if (appliances.length == 0) {
            return null;
        }
        Appliance maxAppliance = appliances[0];
        for (int i = 1; i < appliances.length; i++) {
            if (appliances[i].dailyWh() > maxAppliance.dailyWh()) {
                maxAppliance = appliances[i];
            }
        }
        return maxAppliance;
    }

    public int heavyCount() {
        int count = 0;
        for (Appliance appliance : appliances) {
            if (appliance.dailyWh() > HEAVY_WH) {
                count++;
            }
        }
        return count;
    }

    public long monthlyBill() {
        long totalWh = totalDailyWh();
        return (totalWh * DAYS_PER_BILL * RUPEES_PER_KWH) / WH_PER_KWH;
    }

    public boolean usesMore(Home other) {
        return this.totalDailyWh() > other.totalDailyWh();
    }
}
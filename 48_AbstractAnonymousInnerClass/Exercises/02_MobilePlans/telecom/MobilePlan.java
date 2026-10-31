package telecom;

public abstract class MobilePlan {
  
    private static final int BASIC_RENT = 199;
    private static final int BASIC_EXTRA_COST = 50;

    private static final int BOOSTER_RENT = 399;
    private static final int BOOSTER_EXTRA_COST = 30;

    private static final int UNLIMITED_RENT = 999;
    private static final int UNLIMITED_EXTRA_COST = 0;

    private static final int DEFAULT_INCLUDED_GB = 2;

    private final String planName;

    
    private MobilePlan(String planName) {
        this.planName = planName;
    }

    public String getPlanName() {
        return planName;
    }

    abstract int monthlyRent();
    abstract int costPerExtraGb();

   
    int includedGb() {
        return DEFAULT_INCLUDED_GB;
    }

  
    public final int billFor(int gbUsed) {
        int extraGb = Math.max(0, gbUsed - includedGb());
        return monthlyRent() + (extraGb * costPerExtraGb());
    }

    public static MobilePlan basic() {
        return new MobilePlan("Basic") {
            @Override
            int monthlyRent() {
                return BASIC_RENT;
            }

            @Override
            int costPerExtraGb() {
                return BASIC_EXTRA_COST;
            }
        };
    }

    public static MobilePlan booster(int includedGb) {
        return new MobilePlan("Booster") {
            @Override
            int monthlyRent() {
                return BOOSTER_RENT;
            }

            @Override
            int costPerExtraGb() {
                return BOOSTER_EXTRA_COST;
            }

            @Override
            int includedGb() {
                return includedGb;
            }
        };
    }

    public static MobilePlan unlimited() {
        return new MobilePlan("Unlimited") {
            @Override
            int monthlyRent() {
                return UNLIMITED_RENT;
            }

            @Override
            int costPerExtraGb() {
                return UNLIMITED_EXTRA_COST;
            }
        };
    }

    
    public static MobilePlan cheapestFor(MobilePlan[] plans, int gbUsed) {
        if (plans == null || plans.length == 0) {
            return null;
        }

        MobilePlan cheapest = plans[0];
        int lowestBill = cheapest.billFor(gbUsed);

        for (int i = 1; i < plans.length; i++) {
            int bill = plans[i].billFor(gbUsed);
            if (bill < lowestBill) {
                lowestBill = bill;
                cheapest = plans[i];
            }
        }

        return cheapest;
    }
}
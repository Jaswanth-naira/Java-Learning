package health;

public class StepTracker {
    private static final int DAYS_IN_WEEK = 7;
    private Integer[] steps;

    public StepTracker(String[] entries) {
        steps = new Integer[DAYS_IN_WEEK];
        for (int i = 0; i < entries.length; i++) {
            if (!entries[i].equals("-")) {
                steps[i] = Integer.valueOf(entries[i]);
            } 
        }
    }

    public int recordedDays() {
        int count = 0;
        for (Integer step : steps) {
            if (step != null) {
                count++;
            }
        }
        return count;
    }

    public int totalSteps() {
        int total = 0;
        for (Integer step : steps) {
            if (step != null) {
                total += step; 
            }
        }
        return total;
    }

    public Double averageSteps() {
        int count = recordedDays();
        if (count == 0) {
            return null;
        }
        return (double) totalSteps() / count;
    }

    public Integer bestDay() {
        Integer bestIdx = null;
        for (int i = 0; i < steps.length; i++) {
            if (steps[i] != null) {
                if (bestIdx == null || steps[i] > steps[bestIdx]) {
                    bestIdx = i;
                }
            }
        }
        return bestIdx;
    }

    public boolean sameSteps(int dayA, int dayB) {
        if (dayA < 0 || dayA >= steps.length || dayB < 0 || dayB >= steps.length) {
            return false;
        }
        if (steps[dayA] == null || steps[dayB] == null) {
            return false;
        }
        return steps[dayA].equals(steps[dayB]);
    }
}
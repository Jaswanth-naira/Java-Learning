package app;

import health.StepTracker;

public class Main {
    public static void main(String[] args) {

        String[] weekOne = {"8000", "-", "12500", "4300", "12500", "-", "9100"};
        StepTracker tracker = new StepTracker(weekOne);

        System.out.println("Recorded days: " + tracker.recordedDays());

        System.out.println("Total steps: " + tracker.totalSteps());

        System.out.println("Average steps: " + tracker.averageSteps());

        System.out.println("Best day: " + tracker.bestDay());

        System.out.println("Days 2 and 4 same: " + tracker.sameSteps(2, 4));

        System.out.println("Days 1 and 5 same: " + tracker.sameSteps(1, 5));

        String[] emptyEntries = {"-", "-", "-", "-", "-", "-", "-"};
        StepTracker emptyWeek = new StepTracker(emptyEntries);

        Double emptyAverage = emptyWeek.averageSteps();
        if (emptyAverage == null) {
            System.out.println("Empty average: none");
        } else {
            System.out.println("Empty average: " + emptyAverage);
        }

        Integer emptyBest = emptyWeek.bestDay();
        if (emptyBest == null) {
            System.out.println("Empty best day: none");
        } else {
            System.out.println("Empty best day: " + emptyBest);
        }
    }
}
package app;

import telecom.MobilePlan;

public class Main {
    public static void main(String[] args) {
        MobilePlan basicPlan = MobilePlan.basic();
        MobilePlan boosterPlan = MobilePlan.booster(10);
        MobilePlan unlimitedPlan = MobilePlan.unlimited();

        MobilePlan[] plans = { basicPlan, boosterPlan, unlimitedPlan };

        for (MobilePlan plan : plans) {
            System.out.println(plan.getPlanName() + " at 5 GB: " + plan.billFor(5));
        }

        System.out.println(basicPlan.getPlanName() + " at 1 GB: " + basicPlan.billFor(1));

        System.out.println(boosterPlan.getPlanName() + " at 25 GB: " + boosterPlan.billFor(25));

        MobilePlan cheapestAt5 = MobilePlan.cheapestFor(plans, 5);
        System.out.println("Cheapest at 5 GB: " + (cheapestAt5 != null ? cheapestAt5.getPlanName() : "none"));

        MobilePlan cheapestAt30 = MobilePlan.cheapestFor(plans, 30);
        System.out.println("Cheapest at 30 GB: " + (cheapestAt30 != null ? cheapestAt30.getPlanName() : "none"));

        MobilePlan[] emptyPlans = new MobilePlan[0];
        MobilePlan cheapestEmpty = MobilePlan.cheapestFor(emptyPlans, 5);
        System.out.println("Cheapest with no plans: " + (cheapestEmpty != null ? cheapestEmpty.getPlanName() : "none"));

    }
}
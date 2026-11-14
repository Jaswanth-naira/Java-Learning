package app;

public class Main
{
    public static void main(String[] args)
    {
        Parcel p1 = new Parcel("P1");
        System.out.println("P1 stage: " + p1.getStage());

        System.out.println("P1 moved: " + p1.advance());
        System.out.println("P1 stage: " + p1.getStage());

        p1.advance();
        p1.advance();
        System.out.println("P1 stage: " + p1.getStage());

        System.out.println("P1 moved: " + p1.advance());
        System.out.println("P1 stage: " + p1.getStage());

        Parcel p2 = new Parcel("P2");
        p2.advance();

        Parcel p3 = new Parcel("P3");
        p3.advance();
        p3.advance();

        Parcel p4 = new Parcel("P4");
        p4.advance();

        Depot depot = new Depot(new Parcel[] { p1, p2, p3, p4 });
        for (Stage stage : Stage.values())
        {
            System.out.println("At " + stage + ": " + depot.countAt(stage));
        }

        Parcel behind = depot.furthestBehind();
        System.out.println("Furthest behind: " + (behind != null ? behind.getId() : "none"));

        Depot emptyDepot = new Depot(new Parcel[0]);
        Parcel emptyBehind = emptyDepot.furthestBehind();
        System.out.println("Empty depot furthest behind: " + (emptyBehind != null ? emptyBehind.getId() : "none"));

        Parcel p5 = new Parcel("P5");

        System.out.println("P5 can cancel: " + p5.canCancel());
        System.out.println("P2 can cancel: " + p2.canCancel());
        System.out.println("P3 can cancel: " + p3.canCancel());

        System.out.println("P5 days left: " + p5.daysLeft());
        System.out.println("P2 days left: " + p2.daysLeft());
        System.out.println("P3 days left: " + p3.daysLeft());
        System.out.println("P1 days left: " + p1.daysLeft());

        System.out.println("Cancellable in depot: " + depot.countCancellable());

        Parcel p6 = new Parcel("P6");
        p6.advance();
        p6.advance();
        p6.advance();
        System.out.println("P6 stage: " + p6.getStage());
        System.out.println("P6 days left: " + p6.daysLeft());
        System.out.println("P6 can cancel: " + p6.canCancel());

        for (Stage stage : Stage.values())
        {
            System.out.println("Days at " + stage + ": " + stage.getDaysLeft());
        }
    }
}
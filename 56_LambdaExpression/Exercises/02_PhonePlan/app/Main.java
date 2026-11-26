package app;

public class Main
{
    private static final int WEEKDAY_MINUTE_RATE = 2;
    private static final int SAVER_FREE_MINUTES = 20;
    private static final int SAVER_MINUTE_RATE = 3;
    private static final int STUDENT_DIVISOR = 2;

    public static void main(String[] args)
    {
        PhonePlan basic = new PhonePlan
        (
                (minutes, messages) -> WEEKDAY_MINUTE_RATE * minutes + messages,
                (minutes, messages) -> minutes
        );

        System.out.println("Basic weekday (30 min, 10 msgs): " + basic.charge(30, 10, false));
        System.out.println("Basic weekend (30 min, 10 msgs): " + basic.charge(30, 10, true));
        System.out.println("Basic weekday (0 min, 0 msgs): " + basic.charge(0, 0, false));

        PhonePlan saver = new PhonePlan(
                (minutes, messages) -> {
                    int billableMinutes = minutes - SAVER_FREE_MINUTES;
                    if (billableMinutes <= 0) {
                        return 0;
                    }
                    return billableMinutes * SAVER_MINUTE_RATE;
                },
                (minutes, messages) -> 0
        );

        System.out.println("Saver weekday (30 min, 10 msgs): " + saver.charge(30, 10, false));
        System.out.println("Saver weekday (20 min, 10 msgs): " + saver.charge(20, 10, false));
        System.out.println("Saver weekday (21 min, 0 msgs): " + saver.charge(21, 0, false));
        System.out.println("Saver weekend (30 min, 10 msgs): " + saver.charge(30, 10, true));

         PhonePlan student = new PhonePlan(
                (minutes, messages) -> basic.charge(minutes, messages, false) / STUDENT_DIVISOR,
                (minutes, messages) -> basic.charge(minutes, messages, true) / STUDENT_DIVISOR
        );

        System.out.println("Student weekday (30 min, 10 msgs): " + student.charge(30, 10, false));
        System.out.println("Student weekday (30 min, 11 msgs): " + student.charge(30, 11, false));
        System.out.println("Student weekend (31 min, 0 msgs): " + student.charge(31, 0, true));


    }
}
package app;

public enum Stage
{
    PLACED(5, true),
    PACKED(3, true),
    SHIPPED(2, false),
    OUT_FOR_DELIVERY(1, false),
    DELIVERED(0, false);

    private final int daysLeft;
    private final boolean cancellable;

    Stage(int daysLeft, boolean cancellable)
    {
        this.daysLeft = daysLeft;
        this.cancellable = cancellable;
    }

    public int getDaysLeft()
    {
        return daysLeft;
    }

    public boolean isCancellable()
    {
        return cancellable;
    }
}
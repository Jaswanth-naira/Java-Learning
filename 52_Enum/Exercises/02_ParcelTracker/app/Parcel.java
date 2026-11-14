package app;

public class Parcel
{
    private final String id;
    private Stage stage;

    public Parcel(String id)
    {
        this.id = id;
        this.stage = Stage.PLACED;
    }

    public String getId()
    {
        return id;
    }

    public Stage getStage()
    {
        return stage;
    }

    public boolean advance()
    {
        Stage[] stages = Stage.values();
        int nextIndex = stage.ordinal() + 1;
        if (nextIndex >= stages.length) {
            return false;
        }
        stage = stages[nextIndex];
        return true;
    }

    public boolean canCancel()
    {
        return stage.isCancellable();
    }

    public int daysLeft()
    {
        return stage.getDaysLeft();
    }
}
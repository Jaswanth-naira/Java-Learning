package app;

public class Pipeline
{
    private final TextStep[] steps;

    public Pipeline(TextStep[] steps)
    {
        this.steps = steps == null ? new TextStep[0] : steps.clone();
    }

    public String run(String input)
    {
        String current = input;
        for (TextStep step : steps)
        {
            current = step.apply(current);
        }
        return current;
    }

   public String describeSteps()
{
    StringBuilder description = new StringBuilder();
    for (int i = 0; i < steps.length; i++)
    {
        if (i > 0)
        {
            description.append(" > ");
        }
        description.append(steps[i].toString());
    }
    return description.toString();
}
}
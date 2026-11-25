package app;
public class TrimStep implements TextStep
{
    @Override
    public String apply(String input)
    {
        return input == null ? null : input.trim();
    }

    @Override
    public String toString()
    {
        return "trim";
    }
}
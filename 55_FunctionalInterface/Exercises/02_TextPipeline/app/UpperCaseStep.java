package app;

public class UpperCaseStep implements TextStep
{
    @Override
    public String apply(String input)
    {
        return input == null ? null : input.toUpperCase();
    }

    @Override
    public String toString()
    {
        return "upper case";
    }
}
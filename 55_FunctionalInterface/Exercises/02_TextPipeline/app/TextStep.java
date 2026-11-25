package app;
@FunctionalInterface
public interface TextStep
{
    String apply(String input);
    @Override
    String toString();
}
package app;
@FunctionalInterface
public interface ReadingCheck 
{
    int FREEZING_POINT = 0;
    boolean passes(int reading);
   
}
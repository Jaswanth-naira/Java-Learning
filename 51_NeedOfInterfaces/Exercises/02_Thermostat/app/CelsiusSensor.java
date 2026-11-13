package app;
public class CelsiusSensor implements TemperatureSensor 
{
    private final int celsius;

    public CelsiusSensor(int celsius)
    {
        this.celsius = celsius;
    }

    @Override
    public int celsius()
    {
        return celsius;
    }
}
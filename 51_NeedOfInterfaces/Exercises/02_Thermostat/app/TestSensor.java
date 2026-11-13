package app;
public class TestSensor implements TemperatureSensor 
{
    private int reading;

    public TestSensor(int reading)
    {
        this.reading = reading;
    }
    
    @Override 
    public int celsius()
    {
        return this.reading;
    }

    public void setReading(int reading)
    {
        this.reading = reading;
    }

    
}
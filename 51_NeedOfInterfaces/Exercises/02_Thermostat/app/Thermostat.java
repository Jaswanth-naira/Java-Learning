package app;
public class Thermostat 
{
    private final int targetTemperature;
    private final TemperatureSensor sensor;

    public Thermostat(int targetTemperature, TemperatureSensor sensor)
    {
        this.targetTemperature = targetTemperature;
        this.sensor = sensor;
    }

    public int currentTemperature()
    {
        return sensor.celsius();
    }

    public boolean isHeatingNeeded()
    {
        return currentTemperature() < targetTemperature;
    }

    public boolean isCoolingNeeded()
    {
        return currentTemperature() > targetTemperature;
    }


}
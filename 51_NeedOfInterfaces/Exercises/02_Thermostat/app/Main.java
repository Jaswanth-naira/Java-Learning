package app;
public class Main 
{
    public static void main(String[] args)
    {
        TemperatureSensor sensor = new CelsiusSensor(19);
        Thermostat livingRoom = new Thermostat(22, sensor);

        System.out.println("Living room temperature: " + livingRoom.currentTemperature());
        System.out.println("Living room heating: " + livingRoom.isHeatingNeeded());
        System.out.println("Living room cooling: " + livingRoom.isCoolingNeeded());

        TemperatureSensor bedroomSensor = new FahrenheitSensor(79);
        Thermostat bedroom = new Thermostat(22, bedroomSensor);
        System.out.println("Bedroom temperature: " + bedroom.currentTemperature());
        System.out.println("Bedroom heating: " + bedroom.isHeatingNeeded());
        System.out.println("Bedroom cooling: " + bedroom.isCoolingNeeded());

        TestSensor testSensor = new TestSensor(22);
        Thermostat testRoom = new Thermostat(22, testSensor);
        int[] readings = {21, 22, 23};
        for(int reading: readings)
        {
            testSensor.setReading(reading);
            System.out.println("Test " + reading  + ": " + "heating " + testRoom.isHeatingNeeded() + ", " + "cooling " + testRoom.isCoolingNeeded());
        }

    }
}
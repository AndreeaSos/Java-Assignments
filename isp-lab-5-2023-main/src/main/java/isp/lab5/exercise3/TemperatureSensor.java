package isp.lab5.exercise3;

public class TemperatureSensor extends Sensor{
    private double temperature;

    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
        this.type="tempSensor";
    }

    public double get() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

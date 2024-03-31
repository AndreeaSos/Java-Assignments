package isp.lab5.exercise3;

public class PressureSenzor extends Sensor{
    private double pressure;
    @Override
    public double get() {
        return this.pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public PressureSenzor(double pressure) {
        this.pressure = pressure;
        this.type="pressSensor";
    }
}

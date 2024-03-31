package isp.lab5.exercise3;

public abstract class Sensor {
    private String installLocation;
    private String name;
    public String type;

    public abstract double get();
}

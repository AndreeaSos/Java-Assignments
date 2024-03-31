package aut.isp.lab4.exercise6;

public class Senzor {
    private String manufacturer;
    private String model;
    private String unitOfMeasurement;

    public Senzor(String manufacturer, String model, String unitOfMeasurement) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public String toString() {
        return "Senzor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                '}';
    }
}

package aut.isp.lab4.exercise5;

public class TempretureSenzor extends Senzor{

    private int value;
    public TempretureSenzor(String manufacturer, String model, String unitOfMeasurement) {
        super(manufacturer, model, unitOfMeasurement);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TempretureSenzor{" +
                "value=" + value +
                '}';
    }
}

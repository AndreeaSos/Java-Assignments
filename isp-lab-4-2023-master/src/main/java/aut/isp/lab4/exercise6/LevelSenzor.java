package aut.isp.lab4.exercise6;

public class LevelSenzor extends Senzor {

    private float value;

    public LevelSenzor(String manufacturer, String model, String unitOfMeasurement) {
        super(manufacturer, model, unitOfMeasurement);
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "LevelSenzor{" +
                "value=" + value +
                '}';
    }
}

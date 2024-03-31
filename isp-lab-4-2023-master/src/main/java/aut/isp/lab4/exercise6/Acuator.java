package aut.isp.lab4.exercise6;

public class Acuator {
    private String manufacturer;
    private  String model;
    private boolean isOn;

    public Acuator(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void turnOn(){
        this.isOn=true;
    }
    public void turnOff(){
        this.isOn=false;
    }

    public boolean getIsOn() {
        return isOn;
    }
}

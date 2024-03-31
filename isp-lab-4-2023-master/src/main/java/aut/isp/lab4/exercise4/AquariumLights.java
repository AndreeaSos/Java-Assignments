package aut.isp.lab4.exercise4;

public class AquariumLights {
    private boolean status;

    public AquariumLights() {
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void turnOn(){
        setStatus(true);
    }

    public void turnOff(){
        setStatus(false);
    }
}

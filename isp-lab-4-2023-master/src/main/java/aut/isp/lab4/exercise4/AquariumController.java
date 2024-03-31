package aut.isp.lab4.exercise4;

import aut.isp.lab4.exercise3.FishFeeder;

public class AquariumController {

    //attributs
    //constructors
    //methods
    private String manufacturer;
    private String model;
    private float currentTime;
    private FishFeeder feeder;
    private float feedingTime;
    private AquariumLights lights;

    private float lightsTime;

    private boolean status;

    public AquariumController(String manufacturer, String model) {
        FishFeeder f1=new FishFeeder("Sandru","1");
        AquariumLights l1=new AquariumLights();
        l1.setStatus(true);
        this.status=l1.getStatus();
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public boolean getStatus(){
        return status;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if(this.currentTime==this.feedingTime){
            System.out.println("it's feeding time!");
            feeder.feed();
        }
        if(this.currentTime==8+this.lightsTime){
            System.out.println("it's time to turn off lights");
            lights.turnOff();
        }
    }

    public void setLightsTime(float lightsTime) {
        this.lightsTime = lightsTime;
        lights.turnOn();
    }


    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;
    }

    public float getCurrentTime() {
        return currentTime;
    }

    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                '}';
    }
}

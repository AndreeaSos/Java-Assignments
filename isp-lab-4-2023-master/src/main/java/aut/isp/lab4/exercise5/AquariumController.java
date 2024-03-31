package aut.isp.lab4.exercise5;

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
    private int presentTemperature;
    private float presentLevel;
    private LevelSenzor lvlSenzor;
    private TempretureSenzor tempSensor;
    private Acuator alarm;
    private Acuator heater;

    public AquariumController(String manufacturer, String model) {
        FishFeeder f1=new FishFeeder("sandru","diesel");
        LevelSenzor l1=new LevelSenzor("bbbb","dddd","ml");
        TempretureSenzor t1=new TempretureSenzor("bbbb","dddd","ml");
        Acuator a=new Acuator("dddd","eeee");
        Acuator h=new Acuator("ddddd","eeeee");
        this.manufacturer = manufacturer;
        this.model = model;
        this.feeder=feeder;
    }

    public boolean checkTemperature(){
        if(tempSensor.getValue()<presentTemperature){
            heater.turnOn();
            System.out.println("heater activated");
        } else if (tempSensor.getValue()==presentTemperature) {
            heater.turnOff();
            System.out.println("heater stoped");
        }
        return heater.getIsOn();
    }

    public boolean checkWaterLevel(){
        if(lvlSenzor.getValue()<presentLevel){
            alarm.turnOn();
            System.out.println("alarm is on");
        }
        return alarm.getIsOn();
    }

    public void setPresentLevel(float presentLevel) {
        this.presentLevel = presentLevel;
    }

    public void setPresentTemperature(int presentTemperature) {
        this.presentTemperature = presentTemperature;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if(this.currentTime==this.feedingTime){
            System.out.println("it's feeding time!");
            feeder.feed();
        }
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
                ", feeder=" + feeder +
                ", feedingTime=" + feedingTime +
                ", presentTemperature=" + presentTemperature +
                ", presentLevel=" + presentLevel +
                ", lvlSenzor=" + lvlSenzor +
                ", tempSensor=" + tempSensor +
                ", alarm=" + alarm +
                ", heater=" + heater +
                '}';
    }
}

package aut.isp.lab4.exercise3;

public class AquariumController {

    //attributs
    //constructors
    //methods
    private String manufacturer;
    private String model;
    private float currentTime;
    private FishFeeder feeder;
    private float feedingTime;

    public AquariumController(String manufacturer, String model,FishFeeder feeder) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.feeder=feeder;
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
                '}';
    }
}

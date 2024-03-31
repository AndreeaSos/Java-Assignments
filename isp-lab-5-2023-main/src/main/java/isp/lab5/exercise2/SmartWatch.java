package isp.lab5.exercise2;

public class SmartWatch implements Chargeable{
    private int batteryLevel;

    @Override
    public void charge(int duration) {
        if(duration>20){
            this.batteryLevel+=20;
        }
        if(batteryLevel>100){
            this.batteryLevel=100;
        }
        if(batteryLevel<0){
            this.batteryLevel=0;
        }
    }

    @Override
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public SmartWatch(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}

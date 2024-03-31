package isp.lab5.exercise2;

public class SmartPhone implements Chargeable{
    private int batteryLevel;
    @Override
    public void charge(int duration) {
        if(duration>20&&duration<50){
            batteryLevel+=30;
        }else{
            batteryLevel+=50;
        }
        if(batteryLevel>100){
            batteryLevel=100;
        }
        if(batteryLevel<0){
            batteryLevel=0;
        }
    }

    @Override
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public SmartPhone(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}

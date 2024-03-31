package isp.lab5.exercise2;

public class Laptop implements Chargeable{
    private int batteryLevel;
    public void charge(int duration){
        if(duration<20){
            batteryLevel+=15;
        } else if (duration>20 && duration<35) {
            batteryLevel+=30;
        }else {
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

    public Laptop(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}

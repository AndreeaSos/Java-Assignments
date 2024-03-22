package isp.lab3.exercise3;

import java.util.Objects;

public class Vehicle {

    static int numberOfVehicles;
    private String model;
    private String type;
    private int speed;
    private char fuelType;

    public Vehicle(String model,String type,int speed,char fuelType){
        this.model=model;
        this.type=type;
        this.speed=speed;
        if((fuelType == 'D')||(fuelType=='B')){
            this.fuelType=fuelType;
        }else{
            this.fuelType='B';
        }
    }

    public char getFuelType() {
        return fuelType;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public void setFuelType(char fuelType) {
        if((fuelType == 'D')||(fuelType=='B')){
            this.fuelType=fuelType;
        }else{
            this.fuelType='B';
        }
        numberOfVehicles+=1;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  model +
                " (" + type + ")" +
                " speed " + speed +
                " fuel type " + fuelType ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed && fuelType == vehicle.fuelType && Objects.equals(model, vehicle.model) && Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, speed, fuelType);
    }
}

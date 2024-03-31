package isp.lab5.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MonitoringService {
    private List<Sensor> sensorList=new ArrayList<>(10);
    public double getAvarageTemperatureSensors(){
        double avarage=0;
        double num=0;
        for (Sensor sensor : sensorList) {
            if (sensor.type == "tempSensor") {
                num++;
                TemperatureSensor t;
                avarage += sensor.get();
            }
            avarage = avarage / num;
        }
        return avarage;
    }

    public double getAvarageAllSensors(){
        double avarage=0;
        double num=0;
        for (Sensor sensor : sensorList) {
            num++;
            TemperatureSensor t;
            avarage += sensor.get();
            avarage = avarage / num;
        }
        return avarage;
    }

    public MonitoringService(List<Sensor> sensorList) {
        this.sensorList = sensorList;
    }
}

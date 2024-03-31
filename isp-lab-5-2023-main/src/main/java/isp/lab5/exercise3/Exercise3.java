package isp.lab5.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        TemperatureSensor t1=new TemperatureSensor(25);
        TemperatureSensor t2=new TemperatureSensor(50);
        PressureSenzor p1=new PressureSenzor(55);

        List<Sensor> sensorList=new ArrayList<>(10);
        sensorList.add(t1);sensorList.add(t2);sensorList.add(p1);
        MonitoringService m1=new MonitoringService(sensorList);
        System.out.println("avarage temperature sensors "+m1.getAvarageTemperatureSensors());
        System.out.println("avarage all sensors "+m1.getAvarageAllSensors());

    }
}

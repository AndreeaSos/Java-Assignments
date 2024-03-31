package aut.isp.lab4.exercise6;

import aut.isp.lab4.exercise6.AquariumController;

public class Exercise6 {
    public static void main(String[] args) {
        AquariumController a2 =new AquariumController("s1","qq");
        a2.setFeedingTime(12.32F);
        for (int i = 0; i <10 ; i++) {
            a2.setCurrentTime(10.32F+(float)i);
            System.out.println("current time is "+ a2.getCurrentTime());
        }
        a2.setPresentLevel(15);
        a2.setPresentTemperature(26);
        a2.changePh();
        System.out.println(a2.checkTemperature());
        System.out.println(a2.checkTemperature());
    }
}

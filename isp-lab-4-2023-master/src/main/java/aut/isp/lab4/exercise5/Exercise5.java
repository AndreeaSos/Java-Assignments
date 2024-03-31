package aut.isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        AquariumController a1=new AquariumController("s1","qq");
        a1.setFeedingTime(12.32F);
        for (int i = 0; i <10 ; i++) {
            a1.setCurrentTime(10.32F+(float)i);
            System.out.println("current time is "+a1.getCurrentTime());
        }
        a1.setPresentLevel(15);
        a1.setPresentTemperature(26);
        System.out.println(a1.checkTemperature());
        System.out.println(a1.checkTemperature());

    }
}

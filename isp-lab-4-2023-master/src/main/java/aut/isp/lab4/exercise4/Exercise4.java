package aut.isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        AquariumController c1=new AquariumController("s1","abc");
        c1.setFeedingTime(12.32F);
        c1.setLightsTime(12.32F);
        for (int i = 0; i <10 ; i++) {
            c1.setCurrentTime(10.32F+(float)i);
            System.out.println("current time is "+ c1.getCurrentTime());
            System.out.println("the light in the aquarium is "+c1.getStatus()+"\n");

        }

    }
}

package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        FishFeeder f1=new FishFeeder("Sandru","1");
        AquariumController c1=new AquariumController("s1","abc",f1);
        c1.setFeedingTime(12.32F);
        for (int i = 0; i <10 ; i++) {
            c1.setCurrentTime(10.32F+(float)i);
            System.out.println("current time is "+ c1.getCurrentTime());

        }

    }
}

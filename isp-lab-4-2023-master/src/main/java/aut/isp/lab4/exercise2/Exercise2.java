package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder feeder1=new FishFeeder("Boch","P1");
        for (int i = 0; i < 15; i++) {
            feeder1.feed();
        }
        feeder1.fillUp();

    }
}

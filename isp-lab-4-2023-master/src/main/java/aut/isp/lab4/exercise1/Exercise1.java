package aut.isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        //create an object
        AquariumController c1=new AquariumController("UTCN","A1");
        c1.setCurrentTime(11.25F);
        System.out.println(c1.toString());
    }
}

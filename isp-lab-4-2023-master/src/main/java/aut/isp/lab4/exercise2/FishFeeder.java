package aut.isp.lab4.exercise2;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;

    public FishFeeder(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = 14;
    }

    public void feed(){
        if(this.meals>0){
            this.meals=this.meals-1;
            System.out.println("pestii au primit mancare");
            System.out.println("feederul mai are "+this.meals+" portii de mancare");
        }else {
            System.out.println("nu mai este mancare in feeder, pestii mor de foame");
        }
    }
    public void fillUp(){
        this.meals=14;
        System.out.println("feederul a fost umplut");
    }

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }
}

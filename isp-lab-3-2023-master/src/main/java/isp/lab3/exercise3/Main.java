package isp.lab3.exercise3;

public class Main {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Dacia","Logan",180,'B');
        Vehicle v3=new Vehicle("Dacia","Logan",180,'B');

        Vehicle v2=new Vehicle("Ford","Fiesta",130,'B');

        System.out.println(v1.getModel());
        System.out.println(v2.getModel());

        if(v1.equals(v3)){
            System.out.println("egale");
        }else{
            System.out.println("Dacia si Ford nu sunt egale");
        }

        v3.setSpeed(200);
        if(v1.equals(v3)){
            System.out.println("egale");
        }else{
            System.out.println("Dacia cu 180 si Dacia cu 200  nu sunt egale");
        }

        System.out.println(Vehicle.numberOfVehicles);

    }
}

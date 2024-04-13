package isp.lab6.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Vehicle masina=new Vehicle("1754","MS76SOS","Hyundai","ix35",2014);
        Vehicle motor=new Vehicle("4562","MS777LEL","Kawasaki","Ninja",2023);
        VehicleRegister vehicleRegister=new VehicleRegister();
        vehicleRegister.addVehicle(masina);
        vehicleRegister.addVehicle(masina);
        vehicleRegister.addVehicle(masina);
        vehicleRegister.addVehicle(masina);
        vehicleRegister.addVehicle(masina);
        vehicleRegister.addVehicle(motor);
        vehicleRegister.addVehicle(motor);
        vehicleRegister.addVehicle(motor);
        //vehicleRegister.removeVehicle(masina);
        //vehicleRegister.removeVehicle("1754");
        System.out.println(vehicleRegister.getByVinWithStrems("4562"));
        System.out.println(vehicleRegister.toString());
    }
}

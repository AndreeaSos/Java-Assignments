package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Optional;

public class VehicleRegister {
    private HashSet<Vehicle> vehicles=new HashSet<>();
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }
    public void removeVehicle(String vin){
        vehicles.remove(new Vehicle(vin));
    }
    public boolean searchByVin(String vin){
        return vehicles.contains(new Vehicle(vin));
    }

    public Vehicle getByVin(String vin){
        for(Vehicle v:vehicles){
            if(v.getVin().equals(vin)){
                return v;
            }
        }
        return null;
    }
    public Vehicle getByVinWithStrems(String vin) {
        Optional<Vehicle> result = vehicles.stream()
        .filter(v -> v.getVin().equalsIgnoreCase(vin))
        .findFirst();
        return result.orElse(null);
    }

    public VehicleRegister() {
        this.vehicles = new HashSet<>();
    }

    @Override
    public String toString() {
        return "VehicleRegister{" +
                "vehicles=" + vehicles.toString() +
                '}';
    }
}


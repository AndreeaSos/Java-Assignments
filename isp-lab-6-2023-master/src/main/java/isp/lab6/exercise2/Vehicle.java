package isp.lab6.exercise2;

public class Vehicle {
    private String vin;
    private String licensePlate;
    private String make;
    private String model;
    private int year;

    public Vehicle(String vehicleIdentificationNumber, String licensePlate, String make, String model, int year) {
        this.vin = vehicleIdentificationNumber;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Vehicle(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\nVehicle{" +
                "\n\tvin='" + vin + '\'' +
                "\n\t, licensePlate='" + licensePlate + '\'' +
                "\n\t, make='" + make + '\'' +
                "\n\t, model='" + model + '\'' +
                "\n\t, year=" + year +
                "\n}"+'\n';
    }
}
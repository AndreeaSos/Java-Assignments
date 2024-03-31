package isp.lab5.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Laptop asus = new Laptop(35);
        asus.charge(50);
        System.out.println("Asus battery level is "+asus.getBatteryLevel());

        SmartPhone iPhone=new SmartPhone(55);
        iPhone.charge(80);
        System.out.println("iPhone battery level is "+iPhone.getBatteryLevel());

        SmartWatch apple=new SmartWatch(100);
        apple.charge(25);
        System.out.println("Smartwatch battery level is "+apple.getBatteryLevel());

    }
}

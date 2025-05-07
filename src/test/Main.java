package test;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(1561, "Car1");
        Train t1 = new Train(1654, "Train1");
        AeroCar ac1 = new AeroCar(4648, "AeroCar1");
        CarDealer cd1 = new CarDealer();

        System.out.println(c1.getID());

        System.out.println(t1.getName());

        t1.drive();

        ac1.drive();

        ac1.fly();

        cd1.addVehicles(t1);
        cd1.addVehicles(c1);
        cd1.addVehicles(ac1);

        cd1.printVehicles();
    }
}

package test;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private String name;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();


    public void printVehicles() {
        for (Vehicle vehicle: vehicleList) {
            System.out.println(vehicle.getID() + "  " + vehicle.getName());
        }
    }
    public void addVehicles(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
}
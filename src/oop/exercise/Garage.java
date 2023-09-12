package oop.exercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private int count;

    private final List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public Garage(){
        this.count = 1;
    }
    
    public void addVehicles(Vehicle v) {
        v.setId(count);
        count++;
        vehicles.add(v);
    }

    public void removeVehicleById(int id) {
        Vehicle vehicleToRemove = null;
        for(Vehicle v : vehicles) {
            if (v.getId() == id) {
                vehicleToRemove = v;
            }
        }
        vehicles.remove(vehicleToRemove);
    }

    public void emptyGarage() {
        vehicles.clear();
    }

    public void printGarage(){
        System.out.println("*****Garage***** ");
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle =>> id: " + v.getId() + " / brand: " + v.getBrand() + " / owner: " + v.getOwner());
        }

    }



}

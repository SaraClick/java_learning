package oop.exercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private int count;

    private final List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public Garage() {
        this.count = 1;
    }

    public void addVehicles(Vehicle v) {
        v.setId(count);
        count++;
        vehicles.add(v);
    }

    public void removeVehicleById(int id) {
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                this.vehicles.remove(v);
                return; // we need to stop the loop because we have modified the length of the list by removing an item
            }
        }
    }

    public void removeVehicleByType(String className) {
        // Generates a list with all vehicles to be removed
        List<Vehicle> vehiclesToRemove = new ArrayList<>();

        // iterate though the list of vehicles checking if the type is the same as the given parameter
        // focus.getClass() outputs: class oop.exercise.Car
        // focus.getSimpleName() outputs Car
        for (Vehicle v : vehicles) {
            if (v.getClass().getSimpleName().equals(className)) {
                vehiclesToRemove.add(v);
            }
        }
        vehicles.removeAll(vehiclesToRemove);
    }


    public double getBill(Vehicle v, double hours) {
        // check the type of the object and calculate the bill based on the number of hours spe

        return hours*v.calcBill();
    }

    public void emptyGarage() {
        vehicles.clear();
    }

    public void printGarage() {
        System.out.println("*****Garage***** ");
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle =>> id: " + v.getId() + " / brand: " + v.getBrand() + " / owner: " + v.getOwner());
        }
    }
}

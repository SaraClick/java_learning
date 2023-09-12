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
        Vehicle vehicleToRemove = null;
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                vehicleToRemove = v;
            }
        }
        vehicles.remove(vehicleToRemove);
    }

    public void removeVehicleByType(String className) {
        // Generates a list with all ids of the vehicles to be removed
        List<Integer> vehiclesToRemove = new ArrayList<>();

        // iterate though the list of vehicles checking if the type is the same as the given parameter
        // focus.getClass() outputs: class oop.exercise.Car
        // focus.getSimpleName() outputs Car
        for (Vehicle v : vehicles) {
            if (v.getClass().getSimpleName().equals(className)) {
                vehiclesToRemove.add(v.getId());
            }
        }

        // We iterate through the ids list vehiclesToRemove and use the method removeVehicleById()
        for (Integer id : vehiclesToRemove) {
            removeVehicleById(id);
        }
    }


    public double getBill(Vehicle v, int hours) {
        // check the type of the object and calculate the bill based on the number of hours spent
        if (v instanceof Car) {
            return hours * 52.5;
        } else if (v instanceof Plane) {
            return hours * 350.5;
        } else {
            return hours * 250;
        }
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

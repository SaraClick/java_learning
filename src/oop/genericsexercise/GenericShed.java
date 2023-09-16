package oop.genericsexercise;

import oop.exercise_garage.Vehicle;

import java.util.List;

public class GenericShed<T extends Vehicle> {

    // create list to store vehicles and iterate through
    private List<T> shedList;
    private T vehicle;

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
        shedList.add(vehicle);
    }

    public T getShedItem(int idx) {
        return shedList.get(idx);
    }


}

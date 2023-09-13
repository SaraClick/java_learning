package oop.genericsexercise;

import oop.exercise.Car;
import oop.exercise.Plane;
import oop.exercise.Vehicle;

public class Runner {
    public static void main(String[] args) {


        Plane boeing = new Plane("boeing", "Ryanair", true);
        Plane airbus = new Plane("airbus", "EasyJet", true);
        Car fiat = new Car();

        GenericShed<Plane> shedPlanes = new GenericShed<>();
        // GenericShed shedList = shedPlanes.getShedList();
        shedPlanes.setVehicle(boeing);
        shedPlanes.setVehicle(airbus);
        // shedPlanes.setVehicle(fiat);

//        for (Plane p:shedPlanes) {
//
//        }
    }
}

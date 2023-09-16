package oop.exercise_garage;

import oop.further_animals.Bird;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Car twingo = new Car("renault", "Sara", 4);
        Boat sailingBoat = new Boat("superboat", "Emily",  true);
        Plane boeing = new Plane("boeing", "Ryanair", true );
//        System.out.println(twingo);
//        System.out.println(sailingBoat);
//        System.out.println(boeing);

        Garage garageSara = new Garage();
        Vehicle c3 = new Car("citroen", "Mike", 4);
        Vehicle focus = new Car("ford", "Daisy", 5);
        Vehicle clio = new Car("renault", "James", 4);

        garageSara.addVehicles(focus);
        garageSara.addVehicles(clio);
        garageSara.addVehicles(c3);
        garageSara.addVehicles(sailingBoat);
        garageSara.addVehicles(boeing);

        garageSara.addVehicles(twingo);
        garageSara.printGarage();
        garageSara.removeVehicleById(2);
        System.out.println("Printing garage after removing vehicle with id 2");
        garageSara.printGarage();

        System.out.println(twingo.getClass().getSimpleName());

        System.out.println(garageSara.getBill(focus, 6));
        System.out.println(garageSara.getBill(boeing, 6));
        System.out.println(garageSara.getBill(sailingBoat, 6));

        garageSara.removeVehicleByType("Car");
        garageSara.printGarage();

        List<Flyable> flyable = new ArrayList<>();
        flyable.add(new Bird());
        flyable.add(new Plane());
        flyable.add(boeing);

        for (Flyable f:flyable) {
            System.out.println(f.fly());
        }

        System.out.println("\n****EXCEPTIONS****");
        try {
            Vehicle v_id4 = garageSara.findById(4);
            System.out.println(v_id4.getBrand());
            Vehicle v_id1 = garageSara.findById(1);
            System.out.println(v_id1.getBrand());
//            garageSara.removeVehicleById(4);
//            garageSara.printGarage();
//            garageSara.removeVehicleById(2);
//            garageSara.printGarage();
        } catch (VehicleNotFoundException vnfe) {
            // .getMessage() is from parent class and will return the message string
            System.out.println(vnfe.getMessage());
        }

        Scanner scan = new Scanner(System.in);

    }
}

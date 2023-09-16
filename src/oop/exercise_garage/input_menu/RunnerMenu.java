package oop.exercise_garage.input_menu;

import oop.exercise_garage.Car;
import oop.exercise_garage.Vehicle;
import oop.exercise_garage.VehicleNotFoundException;
import oop.exercise_garage.input_menu.GarageInput;

import java.util.Scanner;

public class RunnerMenu {

    public static void main(String[] args) {
        Vehicle twingo = new Car("renault", "Sara", 4);
        Vehicle c3 = new Car("citroen", "Mike", 4);
        Vehicle focus = new Car("ford", "Daisy", 5);
        GarageInput garage = new GarageInput();
        garage.addVehicles(twingo);
        garage.addVehicles(c3);
        garage.addVehicles(focus);

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your selection: \n" +
                    "A to add a vehicle\n" +
                    "R to remove a vehicle\n" +
                    "B to print your bill\n" +
                    "P to print the vehicles in the garage\n" +
                    "E to extit the menu.\n" +
                    "=>> ");
            String selection = scan.nextLine().toUpperCase();

            while (!selection.equals("E")) {
                garage.operations(selection);
                System.out.println("\nEnter your next selection:");
                selection = scan.nextLine().toUpperCase();
            }

        } catch (VehicleNotFoundException vnfe) {
            System.out.println("Incorrect input, action not performed. Closing program.");
        }
    }
}

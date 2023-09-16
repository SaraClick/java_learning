package oop.exercise_garage.input_menu;

import oop.exercise_garage.Car;
import oop.exercise_garage.Garage;
import oop.exercise_garage.Vehicle;

import java.util.Scanner;

public class GarageInput extends Garage {

    public void operations(String selection) {
        Scanner scan = new Scanner(System.in);

        switch (selection) {
            case "A":
                System.out.println("Confirm brand: ");
                String brand = scan.next();
                System.out.println("Confirm owner: ");
                String owner = scan.next();
                System.out.println("Confirm seats: ");
                int seats = scan.nextInt();
                System.out.println("Adding vehicle...");
                Vehicle vehicle = new Car(brand, owner, seats);
                this.addVehicles(vehicle);
                System.out.println(vehicle.getBrand() + " from " + vehicle.getOwner() + " has been added to the Garage.\n");
                break;
            case "R":
                System.out.println("Confirm ID of the vehicle to be removed:");
                int vehicleIdR = scan.nextInt();
                System.out.println("Removing vehicle...");
                this.removeVehicleById(vehicleIdR);
                System.out.println("Vehicle removed from garage.\n");
                break;
            case "B":
                System.out.println("Confirm ID of the vehicle you need the bill from:");
                int vehicleIdB = scan.nextInt();
                System.out.println("Enter the number of hours to bill: ");
                double hours = scan.nextDouble();
                System.out.println("Generating bill...");
                System.out.println("Bill: £" + this.getBill(this.findById(vehicleIdB), hours) + "\n");
                break;
            case "P":
                System.out.println("Printing Garage vehicles...");
                this.printGarage();
                break;
            case "E":
                System.out.println("Bye!");
                return;
            default:
                System.out.println("Incorrect option select.\nPlease try again.");
        }
    }
}

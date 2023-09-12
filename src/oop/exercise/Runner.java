package oop.exercise;

public class Runner {

    public static void main(String[] args) {
        Car twingo = new Car("renault", "Sara", 4);
//        Boat sailingBoat = new Boat("superboat", "Emily",  true);
//        Plane boeing = new Plane("boeing", "Ryanair", true );

//        System.out.println(twingo);
//        System.out.println(sailingBoat);
//        System.out.println(boeing);

        Garage garageSara = new Garage();
        Vehicle c3 = new Car("citroen", "Mike", 4);
        Vehicle focus = new Car("ford", "Daisy", 5);
        Vehicle clio = new Car("renault", "James", 4);

        garageSara.addVehicles(c3);
        garageSara.addVehicles(focus);
        garageSara.addVehicles(clio);

        Vehicle twingo1 = twingo;
        garageSara.addVehicles(twingo1);
        garageSara.printGarage();
        garageSara.removeVehicleById(3);
        System.out.println("Printing garage after removing vehicle with id 3");
        garageSara.printGarage();
    }
}

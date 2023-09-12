package oop.exercise;

public class Runner {

    public static void main(String[] args) {
        Car twingo = new Car("road", 4, 160, 4);
//        Boat sailingBoat = new Boat("water", 0, 300, true);
//        Plane boeing = new Plane("air", 2, 500, true );

//        System.out.println(twingo);
//        System.out.println(sailingBoat);
//        System.out.println(boeing);

        Garage garageSara = new Garage();
        Vehicle c3 = new Car("road", 4, 160, 4);
        Vehicle ford = new Car("road", 4, 180, 5);
        Vehicle renault = new Car("road", 4, 160, 4);

        garageSara.addVehicles(c3);
        garageSara.addVehicles(ford);
        garageSara.addVehicles(renault);

        Vehicle twingo1 = twingo;
        garageSara.addVehicles(twingo);
        garageSara.printGarage();
        garageSara.removeVehicleById(3);
        System.out.println("Printing garage after removing vehicle with id 3");
        garageSara.printGarage();
    }
}

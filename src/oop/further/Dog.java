package oop.further;

public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(String name, int age, float height, float weight, int noOfLegs) {
        super(name, age, height, weight, noOfLegs);
    }

    public void wag() {
        System.out.println("Wag wag wag");
    }
}
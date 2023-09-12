package oop.further;

public class Cat extends Mammal {

    public Cat() {
    }

    public Cat(String name, int age, float height, float weight, int noOfLegs) {
        super(name, age, height, weight, noOfLegs);
    }

    public void scratch() {
        System.out.println("hiss! AHHHHHHHHHH!");
    }
}
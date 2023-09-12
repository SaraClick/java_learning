package oop.further;

public class Bird extends Animal {

    public Bird() {
        super();
    }

    public Bird(String name, int age, float height, float weight, int noOfLegs) {
        super(name, age, height, weight, noOfLegs);
    }

    @Override
    public void speak() {
        System.out.println("Chirp Chirp");
    }

    @Override
    public double calcBill() {
        return 500;
    }
}
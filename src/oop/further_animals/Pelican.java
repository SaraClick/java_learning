package oop.further_animals;

public class Pelican extends Animal {

    public Pelican() {
        super();
    }

    public Pelican(String name, int age, float height, float weight, int noOfLegs) {
        super(name, age, height, weight, noOfLegs);
    }

    @Override
    public double calcBill() {
        return 10_000;
    }

    @Override
    public void speak() {
        System.out.println("AHHHHHHHHHHHHHHHHHHHH");
    }
}
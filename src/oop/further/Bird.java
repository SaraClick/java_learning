package oop.further;

import oop.exercise.Flyable;

public class Bird extends Animal implements Flyable {

    public Bird() {
        super();
    }

    public Bird(String name, int age, float height, float weight, int noOfLegs) {
        super(name, age, height, weight, noOfLegs);
    }


    public String fly(){
        return "flop flop";
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
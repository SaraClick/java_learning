package oop.further;

public class Cat extends Mammal {

    private int lives;

    public Cat() {
    }

    public Cat(String name, int age, float height, float weight, int noOfLegs) {
        super(name, age, height, weight, noOfLegs);
        // defaulting a value not set by the constructor
        this.setLives(9);
    }

    public Cat(String name, int age, float height, float weight, int noOfLegs, int lives) {
        super(name, age, height, weight, noOfLegs);
        this.lives = lives;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", noOfLegs=" + getNoOfLegs() +
                ", lives=" + lives +
                '}';
    }

    @Override
    public double calcBill() {
        return 10;
    }

    @Override
    public void speak() {
        System.out.println("MEOW");
    }

    public void scratch() {
        System.out.println("hiss! AHHHHHHHHHH!");
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
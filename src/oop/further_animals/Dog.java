package oop.further_animals;

public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(String name, int age, float height, float weight, int noOfLegs) {
        super(name, age, height, weight, noOfLegs);
    }

    @Override // annotation that tells Java there is a speak() method in the super
    public void speak() {
        System.out.println("WOOF!");
    }

    @Override
    public double calcBill() {
        return 15;
    }


    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                "noOfLegs=" + getNoOfLegs() +
                '}';
    }

    public String speak(boolean loud) {
        if (!loud) return "woof";
        else return "WOOF!";
    }
    public void wag() {
        System.out.println("Wag wag wag");
    }
}
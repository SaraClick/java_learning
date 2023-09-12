package oop.further;

public abstract class Animal extends Object{

    private String name;
    private int age;
    private float height;
    private float weight;

    private int noOfLegs;

    public Animal() {
        super();
    }

    public Animal(String name, int age, float height, float weight, int noOfLegs) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.noOfLegs = noOfLegs;
    }

    public abstract void speak();

    public abstract double calcBill();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", noOfLegs=" + noOfLegs +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
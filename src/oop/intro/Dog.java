package oop.intro;

public class Dog {

    private String name;
    private String breed;
    private int age;

    public String getName() {
        return name;
    }

    // Static instance variable
    public static String animalType = "Canine";


    // ***CONSTRUCTOR***
    public Dog() {};

    public Dog(String name) {
        this.name = name;
    }
    public Dog(String name, String breed, int age) {
        this.name =  name;
        this.breed = breed;
        this.age  = age;
    }

    // ***METHODS***
    // Static setter for the static instance variable
    public static void setAnimalType(String animalType) {
        Dog.animalType = animalType;
    }

    // Static getter for the static instance variable
    public static String getAnimalType() {
        return Dog.animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "My name is " + this.name + ", I am a " + this.breed + " and I'm " + this.age + " years old.";
    }

}

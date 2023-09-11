package oop;

public class RunnerDog {
    public static void main(String[] args) {
        Dog rex = new Dog();

        rex.setName("Rex");
        rex.setAge(7);
        rex.setBreed("Labrador");

        System.out.println(rex.getInfo());

        Dog max = new Dog("Max", "Chihuahua", 2);
        Dog kuki = new Dog("Kuki");

        System.out.println(max.getInfo());
        System.out.println(kuki.getInfo());
        System.out.println(Dog.animalType);

        Dog.setAnimalType("Doggos!");
        System.out.println(rex.getInfo());
        System.out.println(max.getInfo());
        System.out.println(kuki.getInfo());
        System.out.println(Dog.animalType);
        Dog.setAnimalType("Canine!");
        System.out.println(Dog.getAnimalType());


    }
}

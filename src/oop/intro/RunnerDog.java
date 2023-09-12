package oop.intro;

public class RunnerDog {
    public static void main(String[] args) {
        Dog rex = new Dog();

        rex.setName("Rex");
        rex.setAge(7);
        rex.setBreed("Labrador");

        System.out.println(rex);

        Dog max = new Dog("Max", "Chihuahua", 2);
        Dog kuki = new Dog("Kuki");

        System.out.println(max);
        System.out.println(kuki);
        System.out.println(Dog.animalType);

        Dog.setAnimalType("Doggos!");
        System.out.println(rex);
        System.out.println(max);
        System.out.println(kuki);
        System.out.println(Dog.animalType);
        Dog.setAnimalType("Canine!");
        System.out.println(Dog.getAnimalType());

    }
}

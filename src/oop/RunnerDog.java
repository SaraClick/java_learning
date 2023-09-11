package oop;

public class RunnerDog {
    public static void main(String[] args) {
        Dog rex = new Dog();

        rex.setName("Rex");
        rex.setAge(7);
        rex.setBreed("Labrador");

        System.out.println(rex.getInfo());
    }
}

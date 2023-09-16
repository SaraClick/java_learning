package oop.generics;

import oop.further_animals.Animal;
import oop.further_animals.Cat;
import oop.further_animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
//        This cage CAN work with any animal but as it uses the Animal type
//        we have to cast our Animals back to their actual type whenever we
//        access them
        Cage kennel = new Cage();
        Dog dog = new Dog();
        kennel.setAnimal(dog);

        Animal myDog = kennel.getAnimal();

        //        myDog.wag(); compile time error
        // checked at run-time
        if (myDog instanceof Dog) ((Dog) myDog).wag(); // major faff

//        With generics I can create a cage that can hold SPECIFIC animals
//        because the cage works with SPECIFIC animals I don't need to cast
//        them when they're being accessed
        GenericCage<Dog> newKennel = new GenericCage<>();

        newKennel.setAnimal(new Dog());
        Dog mySecondDog = newKennel.getAnimal();
        mySecondDog.wag(); // no faffing here


//        We've already seen this behaviour with Lists
//        when accessing an element of a List you don't
//        need to cast it as the return type of E get()
//        is set when you create the List<E>
        // List OF <Animal>
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());

        Animal a = animals.get(0); // no faff
        // List OF <String>
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");

        String s = strings.get(0); // no faff

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(24);

        Integer i = nums.get(0); // no faff

    }
}
package oop.generics;

import oop.further_animals.Animal;

// store any animal
public class Cage {

    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
package oop.generics;

import oop.further.Animal;

// Generics create a placeholder that you can use instead of the actual type
// This lets the user set the type when they instantiate the class
public class GenericCage<T extends Animal> { // cage will work with any type as long as it's an animal

    // works with attribute type
    private T animal;

    // return types
    public T getAnimal() {
        return animal;
    }

    //    and parameter types
    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
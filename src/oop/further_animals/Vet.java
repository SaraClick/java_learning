package oop.further_animals;

import java.util.ArrayList;
import java.util.List;

public class Vet {


    private List<Animal> animals = new ArrayList<>();


//    without subtyping you'd have to write an add____ method for every animal
//    public boolean addDog(Dog d) {
//        return this.animals.add(d);
//    }

    public boolean addAnimal(Animal a) {
        return this.animals.add(a);
    }

    public boolean removeAnimal(Animal a) {
        return this.animals.remove(a);
    }

    public boolean removeAnimals(Class clazz) {
        for (int i = this.animals.size() - 1; i >= 0; i--) {
            Animal a = this.animals.get(i);
            if (a.getClass() == clazz) this.animals.remove(a);
        }
        return false;
    }

    public double calcBill() {
        double bill = 0;

        for (Animal a : this.animals) {
            bill += a.calcBill();
        }

        return bill;
    }

    public boolean empty() {
        this.animals.clear();
        return this.animals.size() == 0;
    }

    public void poke() {
        for (Animal a : this.animals) {
            a.speak();
        }
    }

    @Override
    public String toString() {
        return "Vet{" +
                "animals=" + animals +
                '}';
    }
}
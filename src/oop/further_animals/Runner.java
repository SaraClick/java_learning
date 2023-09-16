package oop.further_animals;

public class Runner {

    public static void main(String[] args) {
        Dog d = new Dog();

        d.setName("Rex");
        d.setAge(8);
        d.setNoOfLegs(4);

        System.out.println(d);
        d.speak();
//        d.speak(false); // can't use the dog method as it isn't available in Animal
        d.wag();
        // limited to just animal members as java only sees your 'label'
        // and your 'label' says it's an animal
        Animal a = d;

//        a.wag();


        Animal c = new Cat("Tiddles", 6, 6, 16, 4);

        System.out.println(c);
        c.speak();

        Vet v = new Vet();

        v.addAnimal(d);
        v.addAnimal(c);
        v.addAnimal(new Pelican());

        System.out.println(v);

        v.poke();

        Dog d2 = new Dog();
        Animal a2 = d2;
        Animal a3 = new Cat();

        if (a2 instanceof Dog) {
            ((Dog) a2).wag();
        } else {
            System.out.println("A2 is not a dog");
        }
        if (a3 instanceof Dog) {
            ((Dog) a3).wag();
        } else {
            System.out.println("A3 is not a dog");
        }

        System.out.println(a2.getClass());
        System.out.println(a3.getClass());

        if (a2.getClass().getSimpleName().equals("Dog")) {
            ((Dog) a2).wag();
        } else {
            System.out.println("A2 is not a dog");
        }
        if (a3.getClass() == Dog.class) {
            ((Dog) a3).wag();
        } else {
            System.out.println("A3 is not a dog");
        }

        System.out.println(new Cat("Fluffy", 10, 8, 12, 4, 9));

        v.addAnimal(new Cat());
        v.addAnimal(new Cat());
        v.addAnimal(new Dog());
        v.addAnimal(new Cat());
        v.addAnimal(new Dog());
        v.addAnimal(new Cat());
        v.addAnimal(new Cat());

//        v.removeAnimals(Cat.class);

        System.out.println(v);

//        new Animal(); cannot instantiate an abstract class

        System.out.println(v.calcBill());
    }
}
package oop.further;

public class Runner {

    public static void main(String[] args) {
        Dog d = new Dog();

        d.setName("Rex");
        d.setAge(8);
        d.setNoOfLegs(4);

        System.out.println(d);

        Cat c = new Cat("Tiddles", 6 , 6, 16, 4);

        System.out.println(c);
    }
}
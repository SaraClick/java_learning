package oop;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Person me = new Person(); // creates an object of type Person
        // dot syntax -> access the members of an objects
        System.out.println(me.introduction());

        me.setName("Jordan");
        me.setAge(-29);
        me.setJob("Trainer");
        me.setHairColour("Black");

        System.out.println(me.introduction());

    }
}
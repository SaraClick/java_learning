package oop.practice;

import oop.practice.Paye;

public class Runner {

    public static void main(String[] args) {
        Paye janeWilson = new Paye("Jane", "1990-04-15", "A1 2BC", "HR", 50000);

        System.out.println(janeWilson.toString());
        System.out.println(janeWilson.getNetSalary());
        System.out.println(janeWilson.getAge());
    }
}

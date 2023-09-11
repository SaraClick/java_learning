package arrays;

import oop.Person;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
//        String[] names = new String[10];
        String[] names = {"Jordan", "Cameron", null, "Aswene"};
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println("I: " + i + " Name: " + names[i]);
        }
        // loops through array backwards
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println("I: " + i + " Name: " + names[i]);
        }

        names[2] = "Barry";

        //  enhanced for-loop, basically just a shortcut for that first loop
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        int[] intArray;
        Integer[] integerArray;
        // Lists can only work with classes
        List<Integer> nums = new ArrayList<>();
        System.out.println(nums.size());

        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);

        System.out.println(nums);

        List<String> nameList = List.of("Jordan", "Aswene", "Cameron", "Morgan");

//        List<String> nameList = new ArrayList<>(List.of("Jordan", "Aswene", "Cameron", "Morgan"));

        for (int i = 0; i < nameList.size(); i++)
            System.out.println("I: " + i + " Name: " + nameList.get(i));
//        Do NOT modify the length of a list as you're looping through it
        for (String name: nameList) System.out.println("Name: " + name);

        List<Person> people = new ArrayList<>();

        people.add(new Person("Jordan", 29, "trainer", "black"));

        for (Person p : people) System.out.println(p);
    }
}
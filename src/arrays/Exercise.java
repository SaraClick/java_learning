package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(10);
        numbers.add(100);
        numbers.add(1000);
        numbers.add(10000);

        System.out.println(numbers);

        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}

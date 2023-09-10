package loops;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("I:" + i);
//        }

//        for (int i = 0; i < 10; ++i) {
//            System.out.println("I:" + i);
//        }

//        for (int i = 0; i< 10; i += 3) System.out.println("I:" + i);

        for (int i = 10; i >= 0; i--){
            if (i % 3 == 0) continue;
            if (i == 1) break;
            System.out.println("I: " + i);
        }

//        creates an input reader that listens to the console
        Scanner scan = new Scanner(System.in);

        // Integers can be null where i isn't
        Integer i = null;

        do {
            System.out.println("Enter a number from 1-20");
            i = scan.nextInt();
        } while (i > 20 || i < 1);

        System.out.println("You picked: " + i);

        System.out.println("END OF MAIN");

    }
}
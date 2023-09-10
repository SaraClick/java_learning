package conditionalsexercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

//        // Prompts the input on the terminal for user input
        Scanner scan = new Scanner(System.in);
//
//        // Declares the variables. Using Integer so we can assign to null
//        Integer num1 = null;
//        Integer num2 = null;
//
//        // ask for first input
//        System.out.println("Enter number 1: ");
//        num1 = scan.nextInt();
//
//        // ask for second input
//        System.out.println("Enter number 2: ");
//        num2 = scan.nextInt();
//
//        // Conditional checking which one is larger and prints it out
//        if (num1 >= num2) {
//            System.out.println(num1);
//        } else {
//            System.out.println(num2);
//        }
//
//        // Asks for a 3rd input and checks if odd/even
//        System.out.println("Enter number 3: ");
//        Integer num3 = null;
//        num3 = scan.nextInt();
//
//        if (num3 % 2 == 0) {
//            System.out.println(num3 + " is even");
//        } else {
//            System.out.println(num3 + " is odd");
//        }
//
//        // Asks for a string colour and returns the action
//        System.out.println("Enter a traffic light colour (green / red): ");
//        String colour = null;
//        colour = scan.next();
//
//        if (colour.equals("green")) {
//            System.out.println("Go");
//        } else if (colour.equals("amber")) {
//            System.out.println("Careful!");
//        } else {
//            System.out.println("Stop");
//        }

        // TASK 2 - Ask the user for a number between 1 and 12
        System.out.println("Enter a number between 1 and 12: ");
        Integer num4 = null;
        num4 = scan.nextInt();

        switch (num4) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Winter");
                break;
        }
    }
}


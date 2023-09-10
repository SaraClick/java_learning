package calculator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // Set the input to open in the terminal
        Scanner scan = new Scanner(System.in);

        // Declare the variables
        Integer num1 = null;
        Integer num2 = null;
        String operator = null;

        // Ask for ser inputs and assign values to value
        System.out.println("Enter number 1: ");
        num1 = scan.nextInt();

        System.out.println("Enter number 2: ");
        num2 = scan.nextInt();

        System.out.println("Enter operator: ");
        operator = scan.next();


        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }

    }
}

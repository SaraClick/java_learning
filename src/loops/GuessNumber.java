package loops;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        // Generate a random number between 0-10
        Random ran = new Random();
        int secretNumber = ran.nextInt(10) + 1;  // generates a random number between 0 and bond

        // Ask for user input at least once and check the num, continue to ask if number does not match the secret number
        Scanner scan = new Scanner(System.in);
        Integer guessNumber = null;

        // Using do because we will always ask the user at least once for their input
        do {
            System.out.println("Enter a number between 1-10: ");
            guessNumber = scan.nextInt();

            if (guessNumber == secretNumber) {
                System.out.println("Correct! The secret number was " + secretNumber);
            } else {
                System.out.println("Nope - Have another try!");
            }

        } while (guessNumber != secretNumber);
    }
}

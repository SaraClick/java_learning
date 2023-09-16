package enumsexercise;

import java.util.Random;

public class RPSgame {

    // Declare the rand object to be used within rpsPlay()
    private Random rand = new Random();

    // Winner is private as it's only to be called within the rpsPlay()
    // Outputs the player and random selections and who's winning
    private String winner(RPSeum userMove, RPSeum javaMove) {
        System.out.println("Java => " + javaMove);
        System.out.println("You => " + userMove);
        if (userMove == javaMove){
            return "Draw\n";
        } else if ((userMove == RPSeum.PAPER && javaMove == RPSeum.ROCK) || (userMove == RPSeum.ROCK && javaMove == RPSeum.SCISSORS) || (userMove == RPSeum.SCISSORS && javaMove == RPSeum.PAPER)) {
            return "You win!\n";
        } else {
            return "Java wins\n";
        }
    }

    public boolean rpsPlay(RPSeum play) {
        int randomNum = this.rand.nextInt(3);  // generates an int between 0-2 both inclusive
        RPSeum actual = null;  // declare actual variable to hold the random hand to be played
        // If statements to assign the random generated int to an RPS hand as declared in the enum
        if (randomNum == 0) {
            actual = RPSeum.ROCK;
        } else if (randomNum == 1) {
            actual = RPSeum.PAPER;
        } else {
            actual = RPSeum.SCISSORS;
        }
        System.out.println(winner(play, actual));  // Calls the function to print plays and winner
        return actual == play;
    }
}

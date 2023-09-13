package enumsexercise;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Random;

public class RPSgame {

    // Declare the rand object to be used within rpsPlay()
    private Random rand = new Random();

    // Winner is private as it's only to be called within the rpsPlay()
    // Outputs the player and random selections and who's winning
    private String winner(RockPaperScissors play, RockPaperScissors actual) {
        System.out.println("Java => " + actual);
        System.out.println("You => " + play);
        if (play == actual){
            return "Draw\n";
        } else if ((play == RockPaperScissors.PAPER && actual == RockPaperScissors.ROCK) || (play == RockPaperScissors.ROCK && actual == RockPaperScissors.SCISSORS) || (play == RockPaperScissors.SCISSORS && actual == RockPaperScissors.PAPER)) {
            return "You win!\n";
        } else {
            return "Java wins\n";
        }
    }

    public boolean rpsPlay(RockPaperScissors play) {
        int randomNum = this.rand.nextInt(3);  // generates an int between 0-2 both inclusive
        RockPaperScissors actual = null;  // declare actual variable to hold the random hand to be played
        // If statements to assign the random generated int to an RPS hand as declared in the enum
        if (randomNum == 0) {
            actual = RockPaperScissors.ROCK;
        } else if (randomNum == 1) {
            actual = RockPaperScissors.PAPER;
        } else {
            actual = RockPaperScissors.SCISSORS;
        }
        System.out.println(winner(play, actual));  // Calls the function to print plays and winner
        return actual == play;
    }
}

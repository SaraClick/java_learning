package enumsexercise;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Random;

public class RPSgame {
    private Random rand = new Random();

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
        int randomNum = this.rand.nextInt(3);
        RockPaperScissors actual = null;
        if (randomNum == 0) {
            actual = RockPaperScissors.ROCK;
        } else if (randomNum == 1) {
            actual = RockPaperScissors.PAPER;
        } else {
            actual = RockPaperScissors.SCISSORS;
        }
        System.out.println(winner(play, actual));
        return actual == play;
    }
}

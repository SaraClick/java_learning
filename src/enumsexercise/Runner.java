package enumsexercise;

public class Runner {

    public static void main(String[] args) {

        RPSgame rpsGame = new RPSgame();

        rpsGame.rpsPlay(RockPaperScissors.PAPER);
        rpsGame.rpsPlay(RockPaperScissors.SCISSORS);
        rpsGame.rpsPlay(RockPaperScissors.ROCK);
        rpsGame.rpsPlay(RockPaperScissors.PAPER);
        rpsGame.rpsPlay(RockPaperScissors.ROCK);
        rpsGame.rpsPlay(RockPaperScissors.SCISSORS);
        }
    }

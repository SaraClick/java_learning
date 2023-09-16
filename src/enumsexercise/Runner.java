package enumsexercise;

public class Runner {

    public static void main(String[] args) {

        RPSgame rpsGame = new RPSgame();

        rpsGame.rpsPlay(RPSeum.PAPER);
        rpsGame.rpsPlay(RPSeum.SCISSORS);
        rpsGame.rpsPlay(RPSeum.ROCK);
        rpsGame.rpsPlay(RPSeum.PAPER);
        rpsGame.rpsPlay(RPSeum.ROCK);
        rpsGame.rpsPlay(RPSeum.SCISSORS);
        }
    }

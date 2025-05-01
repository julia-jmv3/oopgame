package rockpaperscissors;

public class WhoWins {

    public static String getWinner(RockPaperScissorsOptions turn1, RockPaperScissorsOptions turn2){
        if (turn1 == turn2){
            return "Draw";
        }
        switch (turn1){
            case ROCK: return (turn2 == RockPaperScissorsOptions.PAPER) ? "Lose" : "Win";
            case PAPER: return (turn2 == RockPaperScissorsOptions.SCISSORS) ? "Lose" : "Win";
            case SCISSORS: return (turn2 == RockPaperScissorsOptions.ROCK) ? "Lose" : "Win";
            default: return "Draw";
        }
    }
}

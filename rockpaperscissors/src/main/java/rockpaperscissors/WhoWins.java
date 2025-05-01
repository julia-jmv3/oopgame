package rockpaperscissors;

public class WhoWins {

    public static String getWinner(rockpaperscissorsoptions turn1, rockpaperscissorsoptions turn2){
        if (turn1 == turn2){
            return "Draw";
        }
        switch (turn1){
            case ROCK: return (turn2 == rockpaperscissorsoptions.PAPER) ? "Lose" : "Win";
            case PAPER: return (turn2 == rockpaperscissorsoptions.SCISSORS) ? "Lose" : "Win";
            case SCISSORS: return (turn2 == rockpaperscissorsoptions.ROCK) ? "Lose" : "Win";
            default: return "Draw";
        }
    }
}

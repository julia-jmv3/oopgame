package rockpaperscissors;

import java.util.Random;

public class ComputerPlayer extends Player{

    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        random = new Random();
    }

    @Override
    public RockPaperScissorsOptions getTurn() {
        RockPaperScissorsOptions turn[] = RockPaperScissorsOptions.values(); //getting the options
        return turn[random.nextInt(turn.length)];
    }


}

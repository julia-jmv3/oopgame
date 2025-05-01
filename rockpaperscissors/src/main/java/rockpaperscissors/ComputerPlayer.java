package rockpaperscissors;

import java.util.Random;

public class ComputerPlayer extends Player{

    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        random = new Random();
    }

    @Override
    public rockpaperscissorsoptions getTurn() {
        rockpaperscissorsoptions turn[] = rockpaperscissorsoptions.values(); //getting the options
        return turn[random.nextInt(turn.length)];
    }


}

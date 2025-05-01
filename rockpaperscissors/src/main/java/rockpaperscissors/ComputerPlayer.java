package rockpaperscissors;

import java.util.Random;

public class ComputerPlayer extends Player{

    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        random = new Random();
    }


}

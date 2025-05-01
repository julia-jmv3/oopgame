package rockpaperscissors;

import java.util.Scanner;

public class UserPlayer extends Player{

    private Scanner scanner;

    public UserPlayer(String name, Scanner scanner){
        super(name);
        this.scanner = scanner;

    }


    @Override
    public RockPaperScissorsOptions getTurn() {
        System.out.println("Enter rock, paper or scissors"); //tell the user what to do
        String turn = scanner.nextLine().toUpperCase(); //collect input
        //try, catch to stop invalid inputs being accepted
        try{
            return RockPaperScissorsOptions.valueOf(turn);
        }catch(IllegalArgumentException e){
            System.out.println("Invalid move. PLease pick rock, paper or scissors");
            return getTurn();
        }
    }
}

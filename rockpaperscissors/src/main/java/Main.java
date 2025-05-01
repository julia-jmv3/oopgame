import rockpaperscissors.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //set up
        Scanner scanner = new Scanner(System.in);
        UserPlayer user = new UserPlayer("You", scanner);
        ComputerPlayer computer = new ComputerPlayer("Computer");

        //instantiate new game
        Game game = new RockPaperScissorsGame(user, computer);

        //game loop
        Boolean playing = true;
        while (playing){
            game.playGame();
            System.out.println("Do you want to play again? Y/N");
            String playAgain = scanner.nextLine().toLowerCase();
            //try, catch to stop invalid inputs being accepted
            try{
                if (playAgain.equals("y")) {
                    playing = true;
                } else if (playAgain.equals("n")) {
                    playing = false;
                }
            }catch(IllegalArgumentException e){
                System.out.println("Invalid selection. Please enter y to continue playing or n to quit");
            }

        }
        System.out.println("Goodbye...");
    }
}

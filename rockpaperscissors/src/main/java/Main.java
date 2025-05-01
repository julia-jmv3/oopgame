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
        Boolean answer = false;
        while (playing){
            game.playGame();
            answer = false;
            while (!answer) {
                System.out.println("Do you want to play again? Y/N");
                String playAgain = scanner.nextLine().trim().toLowerCase();
                //try, catch to stop invalid inputs being accepted
                try {
                    if (playAgain.equals("y")) {
                        playing = true;
                        answer = true;
                    } else if (playAgain.equals("n")) {
                        playing = false;
                        answer = true;
                    } else {
                        throw new IllegalArgumentException("Invalid selection. Please enter y to continue playing or n to quit");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Goodbye...");
    }
}

package rockpaperscissors;

public class RockPaperScissorsGame implements Game{

    //players
    private UserPlayer user;
    private ComputerPlayer computer;

    //constructor
    public RockPaperScissorsGame(UserPlayer user, ComputerPlayer computer){
        this.user = user;
        this.computer = computer;
    }


    @Override
    public void playGame() {
        rockpaperscissorsoptions turn1 = user.getTurn();
        rockpaperscissorsoptions turn2 = computer.getTurn();

        //output choices made by each player
        System.out.println(user.getName()+ " said " + turn1);
        System.out.println(computer.getName()+ " said " + turn2);

        //game result
        String results = WhoWins.getWinner(turn1, turn2);
        System.out.println(results);
    }
}

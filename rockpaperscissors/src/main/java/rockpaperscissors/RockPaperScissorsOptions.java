package rockpaperscissors;

public enum RockPaperScissorsOptions {
    ROCK("rock"), PAPER("paper"), SCISSORS("scissors");
    private final String word;
    RockPaperScissorsOptions(String word) {this.word = word;}
    public String toString(){
        return word;
    }
}


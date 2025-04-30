package rockpaperscissors;

public enum rockpaperscissorsoptions {
    ROCK("rock"), PAPER("paper"), SCISSORS("scissors");
    private final String word;
    rockpaperscissorsoptions(String word) {this.word = word;}
    public String toString(){
        return word;
    }
}


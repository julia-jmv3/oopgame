package rockpaperscissors;

public abstract class Player {
    protected String name;

    //constructor
    public Player (String name){
        this.name=name;
    }

    //getter for username
    public String getName(){
        return name;
    }

    //setting up a turn
    public abstract rockpaperscissorsoptions getTurn();


}

import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2016.12.09..
 */
public class Player {
    String name;
    ArrayList<Card> played;

    public Player(String name) {
        this.name = name;
        Player User = new Player("User");
        Player Dealer = new Player("Dealer");
        played = new ArrayList<>();
    }

    public void addToPlayed(){
    }
}
import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2016.12.09..
 */
public class Player {
    String name;
    ArrayList<Card> played;

    public Player(String name) {
        this.name = name;
        played = new ArrayList<>();
    }

    public void addToPlayed(Card drawn){
        played.add(drawn);
    }

    int sum;
    public int sumOfPlayed(){
        for(Card drawn : played){
            sum+= drawn.getValue();
        }return sum;
    }

    public String toString() {
        String labelString = name + " played: ";
        for (Card drawn : played) {
            labelString += " " + drawn.toString();
        }
        return labelString;
    }
}
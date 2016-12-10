import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Verőci Ádám on 2016.12.09..
 */
public class Deck {
    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> used = new ArrayList<Card>();

    public Deck() {
        String [] colors = {"kor", "pikk", "karo", "treff"};
        int [] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};

        for(int i= 0; i<colors.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(new Card(colors[i], values[j]));
            }
        }
        Collections.shuffle(cards);
    }

    public Card draw(){
        if(cards.size() > 0) {
            Card drawn=cards.get(0);
            cards.remove(drawn);
            used.add(drawn);
            return drawn;
        } else{
            return null;
        }
    }
}




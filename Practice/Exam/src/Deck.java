import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Verőci Ádám on 2016.12.09..
 */
public class Deck {
    public ArrayList<Card> cards = new ArrayList<Card>();
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
        System.out.println(cards);
        System.out.println(draw());
        addToUsed();
        remove();
        System.out.println(used);
        System.out.println(cards);
    }

    public Card draw(){
        if(cards.size()!=0) {
            return cards.get(0);
        } else{
            return null;
        }
    }

    public void addToUsed(){
        used.add(cards.get(0));
    }

    public void remove(){
        cards.remove(0);
    }
}




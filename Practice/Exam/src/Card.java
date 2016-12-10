import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2016.12.09..
 */
public class Card {
    String color;
    int value;

    public Card(String color, int value) {
        this.color = color;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
       return color + " " + value;
    }
}

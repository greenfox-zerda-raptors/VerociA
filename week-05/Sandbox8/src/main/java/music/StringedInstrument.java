package main.java.music;

/**
 * Created by Verőci Ádám on 2016.11.16..
 */
public abstract class StringedInstrument extends Instrument{

    int numberOfStrings;

    public StringedInstrument(int numberOfStrings){
        this.numberOfStrings=numberOfStrings;
    }

    final String formatForPlay ="%s, a %d-stringed instrument that %s\n";
}

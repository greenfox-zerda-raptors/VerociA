package main.java.music;

/**
 * Created by Verőci Ádám on 2016.11.16..
 */
public class ElectricBassGuitar extends StringedInstrument {

    public ElectricBassGuitar(){
        this(4);
    }

    public ElectricBassGuitar(int numberOfStrings){
        super(numberOfStrings);
    }

    public void play(){
        System.out.printf(formatForPlay, this.name, this.numberOfStrings, "Dumm-dumm-dumm");
    }
}

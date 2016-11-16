package main.java.music;

/**
 * Created by Verőci Ádám on 2016.11.16..
 */
public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        this(6);
    }

    public ElectricGuitar(int numberOfStrings){
        super(numberOfStrings);
    }

    public void play(){
        System.out.printf(formatForPlay, this.name, this.numberOfStrings, "Twangs");
    }
}

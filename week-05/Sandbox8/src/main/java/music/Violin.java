package main.java.music;

/**
 * Created by Verőci Ádám on 2016.11.16..
 */
public class Violin extends StringedInstrument{

    public Violin(){
        this(4);
    }

    public Violin(int numberOfStrings){
        super(numberOfStrings);
    }

    public void play(){
        System.out.printf(formatForPlay, this.name, this.numberOfStrings, "Skeech");
    }

}

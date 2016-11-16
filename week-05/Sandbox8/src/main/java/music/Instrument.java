package main.java.music;

/**
 * Created by Verőci Ádám on 2016.11.16..
 */
abstract public class Instrument {
    protected String name;

    public void play(){
    }

    public Instrument(){
        this.name=getClass().getSimpleName();
    }
}

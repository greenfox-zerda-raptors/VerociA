/**
 * Created by Verőci Ádám on 2016.12.11..
 */
public class Pirate {
    int rumLevel;
    boolean isAlive;
    String name;

    public Pirate(String name){
        this.name = name;
        isAlive = true;
    }

    public int drinkSomeRum(){
        if(isAlive()==true) {
            rumLevel++;
            return rumLevel;
        }else{
            return rumLevel;}
    }

    public String howItGoingMate(){
        if(isAlive()== true && rumLevel<5){
            return "Pour me anudder!";
        }else if(isAlive()== true && rumLevel>=5){
            return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }else {
            return "He is dead";}
    }

    public boolean die(){
        isAlive = false;
        return isAlive;
    }

    int counter;
    public int count(){
        if(isAlive()){
            counter++;
        }return counter;
    }

    public int getRumLevel() {
        return rumLevel;
    }

    public boolean isAlive() {
        return isAlive;
    }
}


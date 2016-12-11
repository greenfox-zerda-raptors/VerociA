import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Verőci Ádám on 2016.12.11..
 */
public class Ship {
    ArrayList<Pirate> pirates = new ArrayList<Pirate>();
    Random random =new Random();
    Pirate captain = new Pirate("Captain");

    public void fillShip() {
        for (int i = 0; i <random.nextInt(100); i++) {
            Pirate randomPirate = new Pirate("Pirate");
            pirates.add(randomPirate);
        }
        pirates.add(captain);
    }

    int alive;
    public int getCrew(){
        for(Pirate crew : pirates){
            if(crew.isAlive()) {
                alive++;
            }
        }return alive;
    }


    public int score(){
        int score= alive - captain.getRumLevel();
        return score;
    }

    public boolean battle (Ship royalShip){
        if (this.score() > royalShip.score()) {
            System.out.println("Hurrraaayyy, we won!");
            return true;
        }
        captain.die();
        System.out.println("The Royal navy won...");
        return false;
    }

}
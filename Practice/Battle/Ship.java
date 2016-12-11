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
        int points= alive - captain.getRumLevel();
        return points;
    }

    public boolean battle (Ship royalShip){
        if (this.score() > royalShip.score()) {
            System.out.println("Hurrraaayyy, we won!");
            return true;
        } else {
            for (int i = 0; i < random.nextInt(pirates.size()); i++) {
                pirates.get(i).die();
            }
            System.out.println("The Royal navy won...");
            return false;
        }
    }

    int rest;
    public int leftoverPirates(){
        for(int i=0; i<pirates.size(); i++) {
            rest += pirates.get(i).count();
        }   return rest;
    }
}
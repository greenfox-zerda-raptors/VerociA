/**
 * Created by Verőci Ádám on 2016.12.11..
 */
public class BattleApp {

    public static void main(String[] args) {
        Ship ship = new Ship();
        Ship royal = new Ship();
        ship.fillShip();
        royal.fillShip();
        ship.getCrew();
        royal.getCrew();
        System.out.println(ship.score());
        System.out.println(royal.score());
        ship.battle(royal);
    }
}

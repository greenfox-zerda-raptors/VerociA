/**
 * Created by Verőci Ádám on 2016.12.10..
 */
public class Main {
    public static void main(String[] args) {
        Pirate pirate= new Pirate("Captain");
        pirate.drinkSomeRum();
        System.out.println(pirate.howItGoingMate());
        pirate.drinkSomeRum();
        pirate.drinkSomeRum();
        pirate.drinkSomeRum();
        System.out.println(pirate.howItGoingMate());
        pirate.drinkSomeRum();
        System.out.println(pirate.howItGoingMate());
        pirate.die();
        pirate.drinkSomeRum();
        System.out.println(pirate.howItGoingMate());

    }
}

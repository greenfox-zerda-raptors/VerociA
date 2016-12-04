
/**
 * Created by Verőci Ádám on 2016.11.24..
 */
public class App {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.add(new Flower("yellow"));
        garden.add(new Flower("blue"));
        garden.add(new Treee("purple"));
        garden.add(new Treee("orange"));
        System.out.println(garden);
        System.out.println(garden.water(40));
        System.out.println(garden);
        System.out.println(garden.water(70));
        System.out.println(garden);
    }
}

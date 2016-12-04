import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2016.11.24..
 */
public class Garden extends ArrayList<Plant> {
//    ArrayList<Plant> plants;

//    public Garden() {
//        plants = new ArrayList<>();
//    }

    int numberOfThirsty = 0;

    public String water(int amount){
        for(Plant p : this){
            if (p.isThirty()){
                numberOfThirsty++;
            }
        }
        int waterPerPlant = (int)((float) amount/numberOfThirsty); //átváltja floatra, osztja, majd vissza intre.
        for(Plant p : this){
            if (p.isThirty()){
            p.water(waterPerPlant);
            }
        }
        return "Watering with " + amount;
    }

    @Override                       //Így írja ki magát a garden
    public String toString() {
        String result = "";
        for(Plant p :this){
            result+=p.toString() + "\n";
        }
        return result;
    }
}

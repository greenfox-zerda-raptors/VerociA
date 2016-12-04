/**
 * Created by Verőci Ádám on 2016.11.24..
 */
public class Treee extends Plant {
    public Treee(String color) {
        super(color,0);
    }

    @Override
    public boolean isThirty() {
        return currentWaterAmount<10;
    }

    @Override
    public void water(int waterPerPlant) {
        currentWaterAmount += (int)((float)waterPerPlant*0.4);
    }
}

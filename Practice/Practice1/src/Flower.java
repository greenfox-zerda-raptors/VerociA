/**
 * Created by Verőci Ádám on 2016.11.24..
 */
public class Flower extends Plant {         //piros volt, implement methods
    public Flower(String color) {
        super(color, 0);
    }

    @Override
    public boolean isThirty() {
        return currentWaterAmount<5;        //ha kisebb mint 5, igazat ad vissza az isThirsty
    }

    @Override
    public void water(int waterPerPlant) {
        currentWaterAmount += (int)((float)waterPerPlant*0.75);
    }
}

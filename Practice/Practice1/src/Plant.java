/**
 * Created by Verőci Ádám on 2016.11.24..
 */
public abstract class Plant {
    String color;
    int currentWaterAmount;

    public Plant(String color, int currentWaterAmount) {
        this.color = color;
        this.currentWaterAmount = currentWaterAmount;
    }

    public abstract boolean isThirty();

    public abstract void water(int waterPerPlant);

    @Override
    public String toString() {
        return "The " + color + " " + getClass().getSimpleName() + (isThirty() ? " needs water" : " doesn't need water");
    }
}
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Verőci Ádám on 2016.11.14..
 */
public class Car {
    // Car.java

    private String color;
    private int engineSize;
    private String typeCar;
    private int kmOdometer;

    public void setColor(String color) {
        this.color = color;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }

    public String getColor() {
        return color;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getKmOdometer() {
        return kmOdometer;
    }

    public Car() {
        //Add somethings here to create a car and some fields
        this.engineSize = 1600;
        this.color = "red";
    }

    void drive(int x) {
        kmOdometer = kmOdometer + x;
        if (x<20){
            System.out.println("Brrrm, "+ getTypeCar() +" just drove around town " + x + " clicks.");
        }else if(x>50) {
            System.out.println("Brrrm, screech, brrrm, screech "+ getTypeCar() + " commuted " + x + " clicks.");
        }else {
            System.out.println("Whee, " + getTypeCar() + " " + x + " clicks.");
        }
    }
}
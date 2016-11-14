/**
 * Created by Verőci Ádám on 2016.11.14..
 */
public class Workshop01 {

    public static void main(String[] args){
        Car myCar = new Car();

        myCar.setTypeCar("Mazda");
        myCar.setKmOdometer(12312);

        Car myCar2 = new Car();

        myCar2.setColor("silver");
        myCar2.setEngineSize(2500);
        myCar2.setTypeCar("Ford");
        myCar2.setKmOdometer(152312);


        Car myCar3 = new Car();

        myCar3.setColor("green");
        myCar3.setEngineSize(2800);
        myCar3.setTypeCar("Beamer");
        myCar3.setKmOdometer(42521);

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
                myCar.getTypeCar(), myCar.getColor(), myCar.getEngineSize(), myCar.getKmOdometer());

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
                myCar2.getTypeCar(), myCar2.getColor(), myCar2.getEngineSize(), myCar2.getKmOdometer());

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
                myCar3.getTypeCar(), myCar3.getColor(), myCar3.getEngineSize(), myCar3.getKmOdometer());

    }
}



/**
 * Created by Verőci Ádám on 2016.11.15..
 */
public class Animal {

    public void sleep(){
        System.out.println("Animal is sleeping.");
    }

    public void eat(){
        System.out.println("Animal is eating.");
    }

    public Animal() {
        System.out.println("An animal is created");
    }

    public Animal(String type){
            System.out.println("A " + type + " animal is created");
    }
}


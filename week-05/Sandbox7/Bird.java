/**
 * Created by Verőci Ádám on 2016.11.15..
 */
public class Bird extends Animal {

        public void fly(){
            System.out.println("The bird can fly.");
        }

        public Bird(){
            super("Bird");
        }
        public void sleep() {
            super.sleep();
            System.out.println("The bird is sleeping.");

        }
        public void eat() {
            super.eat();
            System.out.println("The bird is eating.");

        }
        public void nightyNight() {
            super.eat();
            this.sleep();
        }
}



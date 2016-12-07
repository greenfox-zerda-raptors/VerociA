/**
 * Created by Verőci Ádám on 2016.12.07..
 */
public class Hero extends GameObject {
    public Hero() {
        super("C:\\Users\\Verőci Ádám\\IdeaProjects\\ScrumGame\\src\\pics\\hero-down.png", 0, 0);
    }
    public void move(int xPosition, int yPosition){
        posX += xPosition;
        posY += yPosition;
    }

}

/**
 * Created by Verőci Ádám on 2016.12.07..
 */
public class Hero extends GameObject {
    public Hero() {
        super("C:\\Users\\Verőci Ádám\\IdeaProjects\\ScrumGame\\src\\pics\\hero-down.png", 0, 0);
    }

    public void move(int newX, int newY, int[][] map) {
        int nextX = posX + newX;
        int nextY = posY + newY;
        if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY <  (map.length -1) && map[nextX][nextY] != 1) {
            posX += newX;
            posY += newY;
        }
    }
}


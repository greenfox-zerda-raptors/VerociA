import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import static java.awt.event.KeyEvent.*;

/**
 * Created by Verőci Ádám on 2016.12.05..
 */
public class Board extends JComponent implements KeyListener {
//    String dirPath=System.getProperty("user.dir");
//    File dir = new File(dirPath);
//    String file = dir + "\\Images\\" + "floor.png";



    ArrayList<GameObject> gameObjects;

    public Board() {
        int[][] map = new int[][]{
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 0, 0, 0}
        };

        int velX, velY;

        gameObjects = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 1) {
                    gameObjects.add(new Wall(i, j));
                } else {
                    gameObjects.add(new Floor(i, j));
                }
            }
        }

        // set the si ze of your draw board
        setPreferredSize(new Dimension(720, 792));
        setVisible(true);
    }

    Hero hero = new Hero();

    @Override
    public void paint(Graphics graphics) {
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);

            hero.draw(graphics);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch(key){
            case VK_LEFT:
                hero.move(0,-1);
                break;
            case VK_RIGHT:
                hero.move(0,1);
                break;
            case VK_UP:
                hero.move(-1,0);
                break;
            case VK_DOWN:
                hero.move(1,0);
                break;
        }
        revalidate();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

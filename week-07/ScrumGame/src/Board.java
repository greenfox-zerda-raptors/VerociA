import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static java.awt.event.KeyEvent.*;

/**
 * Created by Verőci Ádám on 2016.12.05..
 */
public class Board extends JComponent implements KeyListener {
//    String dirPath=System.getProperty("user.dir");
//    File dir = new File(dirPath);
//    String file = dir + "\\Images\\" + "floor.png";

    int [][] map;
    BufferedImage upImage;
    BufferedImage downImage;
    BufferedImage leftImage;
    BufferedImage rightImage;

    ArrayList<GameObject> gameObjects;

    public Board() {
        this.map = new int[][]{
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
        setPreferredSize(new Dimension(720, 800));

        try {
            upImage = ImageIO.read(new File("C:\\Users\\Verőci Ádám\\IdeaProjects\\ScrumGame\\src\\pics\\hero-up.png"));
            downImage = ImageIO.read(new File("C:\\Users\\Verőci Ádám\\IdeaProjects\\ScrumGame\\src\\pics\\hero-down.png"));
            leftImage = ImageIO.read(new File("C:\\Users\\Verőci Ádám\\IdeaProjects\\ScrumGame\\src\\pics\\hero-left.png"));
            rightImage = ImageIO.read(new File("C:\\Users\\Verőci Ádám\\IdeaProjects\\ScrumGame\\src\\pics\\hero-right.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    Skeleton skeletonOne = new Skeleton();
    Skeleton skeletonTwo = new Skeleton();
    Boss boss= new Boss();
    Hero hero = new Hero();

    @Override
    public void paint(Graphics graphics) {
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);

            skeletonOne.draw(graphics);
            skeletonTwo.draw(graphics);
            boss.draw(graphics);
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
                hero.imageChanger(leftImage);
                hero.move(-1, 0, map);
                break;
            case VK_RIGHT:
                hero.imageChanger(rightImage);
                hero.move(1, 0, map);
                break;
            case VK_UP:
                hero.imageChanger(upImage);
                hero.move(0, -1, map);
                break;
            case VK_DOWN:
                hero.imageChanger(downImage);
                hero.move(0, 1, map);
                break;
        }
        revalidate();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

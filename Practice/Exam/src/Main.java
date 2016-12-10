import javax.swing.*;
import java.awt.*;

/**
 * Created by Verőci Ádám on 2016.12.09..
 */
public class Main extends JFrame{

    public Main(){
        this.add(new BlackJack());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(600,200));
        this.pack();
        this.setVisible(true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width/2)-(this.getWidth()/2);
        int yPos = (dim.height/2)-(this.getHeight()/2);
        this.setLocation(xPos, yPos);
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
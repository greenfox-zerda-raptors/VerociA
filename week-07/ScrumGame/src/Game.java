import javax.swing.*;
import java.awt.*;

/**
 * Created by Verőci Ádám on 2016.12.08..
 */
public class Game extends JFrame {

    public Game() throws HeadlessException {
        JFrame frame = new JFrame();
        Board board = new Board();
        frame.add(board);
        frame.addKeyListener(board);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

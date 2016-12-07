import javax.swing.*;

/**
 * Created by Verőci Ádám on 2016.12.05..
 */

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Board board = new Board();
        frame.add(board);
        frame.addKeyListener(board);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}

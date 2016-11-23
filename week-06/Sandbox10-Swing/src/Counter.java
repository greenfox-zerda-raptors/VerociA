import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Verőci Ádám on 2016.11.23..
 */


public class Counter extends JFrame{
    //JFrame frame = new JFrame("Counter");


    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;

    private int clicks = 0;

    public Counter(){
        createView();

        setTitle("Press the buttons");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();         //just to fit everything
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        labelCount = new JLabel();
        labelCount.setPreferredSize(
                new Dimension(200,30));
        panel.add(labelCount);
        updateCounter();

        buttonCounter = new JButton("Press me");
        buttonCounter.addActionListener(
                new ButtonCounterActionListener());
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clicks=0;
                        updateCounter();
                    }
                });


        panel.add(buttonReset);
    }

    private void updateCounter() {
        labelCount.setText("Pressed: "+clicks);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Counter();
            }
        });
    }
    private class ButtonCounterActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks++;
            updateCounter();
        }
    }
}


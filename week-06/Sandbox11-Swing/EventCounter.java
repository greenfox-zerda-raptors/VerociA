import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventCounter extends JFrame{
    private JButton buttonCounter, buttonReset;
    private int buttonClicks = 0;
    private int keyPresses = 0;
    private int mouseClicks = 0;
    private int windowUsage = 0;

    private JLabel LabelButtonCount = new JLabel();
    private JLabel LabelKeyCount = new JLabel();
    private JLabel LabelMouseCount = new JLabel();
    private JLabel LabelWindowCount = new JLabel();

    private JTextField textField = new JTextField();

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventCounter();
            }
        });
    }
    private EventCounter(){
        createCounter();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension(400,20);

        JPanel panel = new JPanel();
        setTitle("Event Counter");

        panel.add(Box.createRigidArea(dimension));
        panel.add(textField);
        panel.add(Box.createRigidArea(dimension));
        panel.add(LabelButtonCount);
        panel.add(LabelKeyCount);
        panel.add(LabelMouseCount);
        panel.add(LabelWindowCount);
        panel.add(Box.createRigidArea(dimension));

        textField.setPreferredSize(new Dimension(300, textField.getMinimumSize().height));
        textField.addKeyListener(new listenForKeys());


        buttonCounter = new JButton("Press me");
        panel.add(buttonCounter);
        buttonCounter.addActionListener(new ButtonCounterActionListener());

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(new ButtonResetActionListener());

        this.addMouseListener(new listenForMouse());
        this.addWindowListener(new listenForWindow());
        panel.add(buttonReset);
        add(panel);
        setVisible(true);

        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rembrandt.jpg"));
        setIconImage(image);

        updateButtonCounter();
        updateWindowCounter();
        updateKeyCounter();
        updateMouseCounter();

        setJMenuBar();
    }
    private void createCounter(){

        this.setSize(500,250);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width /2 ) - (this.getWidth()/2);
        int yPos = (dim.height /2 ) - (this.getHeight()/2);
        this.setLocation(xPos, yPos);
        this.setResizable(true);
    }
    private void updateButtonCounter(){
        LabelButtonCount.setText("Button pressed: " + buttonClicks + "   ");
    }
    private void updateKeyCounter(){
        LabelKeyCount.setText("Key presses: " + keyPresses + "   ");
    }
    private void updateMouseCounter(){
        LabelMouseCount.setText("Mouse clicks: " + mouseClicks + "   ");
    }
    private void updateWindowCounter(){
        LabelWindowCount.setText("Window counter: " + windowUsage);
    }


    private class ButtonCounterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buttonClicks++;
            updateButtonCounter();
        }
    }

    private class ButtonResetActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buttonClicks = 0;
            windowUsage = 0;
            mouseClicks = 0;
            keyPresses = 0;
            updateButtonCounter();
            updateWindowCounter();
            updateKeyCounter();
            updateMouseCounter();
        }
    }

    private class listenForMouse implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            mouseClicks++;
            updateMouseCounter();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            windowUsage++;
            updateWindowCounter();
        }

        @Override
        public void mouseExited(MouseEvent e) {
            windowUsage++;
            updateWindowCounter();
        }
    }

    private class listenForWindow implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            windowUsage++;
            updateWindowCounter();
        }

        @Override
        public void windowClosing(WindowEvent e) {
            windowUsage++;
            updateWindowCounter();
        }

        @Override
        public void windowClosed(WindowEvent e) {
            windowUsage++;
            updateWindowCounter();
        }

        @Override
        public void windowIconified(WindowEvent e) {
            windowUsage++;
            updateWindowCounter();
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            windowUsage++;
            updateWindowCounter();
        }

        @Override
        public void windowActivated(WindowEvent e) {
            windowUsage++;
            updateWindowCounter();
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            windowUsage++;
            updateWindowCounter();
        }
    }

    private class listenForKeys implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            keyPresses++;
            updateKeyCounter();
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    private void setJMenuBar() {

        JMenuBar menu = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic('E');
        exitMenuItem.setToolTipText("Exit application");


        exitMenuItem.addActionListener(new EventCounter.Exitaction());
        fileMenu.add(exitMenuItem);

        menu.add(fileMenu);
        setJMenuBar(menu);
    }

    private class Exitaction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
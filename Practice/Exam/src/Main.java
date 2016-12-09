import javax.swing.*;

/**
 * Created by Verőci Ádám on 2016.12.09..
 */
public class Main extends JFrame{

    public Main(){
        this.add(new BlackJack());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        Card card = new Card("karo", 7);
        System.out.println(card.toString());
        Deck deck = new Deck();

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
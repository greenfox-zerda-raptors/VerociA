import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Verőci Ádám on 2016.12.09..
 */
public class BlackJack extends JPanel implements ActionListener {
    public JButton drawButton, resetButton;
    public JLabel userLabel, houseLabel;
    Deck deck;
    Player user;
    Player house;


    public BlackJack() {
        user = new Player("User");
        house = new Player("House");
        userLabel = new JLabel();
        userLabel.setText("User played: ");
        houseLabel = new JLabel();
        houseLabel.setText("House played: ");
        drawButton = new JButton("Draw card");
        resetButton = new JButton("New game");
        this.add(userLabel);
        this.add(houseLabel);
        this.add(drawButton);
        this.add(resetButton);
        resetButton.addActionListener(this);
        drawButton.addActionListener(this);
        deck = new Deck();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            deck = new Deck();
            user = new Player("User");
            house = new Player("House");
        } else if (e.getSource() == drawButton) {
            user.addToPlayed(deck.draw());
            if(house.sumOfPlayed()<17){
                house.addToPlayed(deck.draw());
            }
        }
       userLabel.setText(user.toString());
       houseLabel.setText(house.toString());
    }
}
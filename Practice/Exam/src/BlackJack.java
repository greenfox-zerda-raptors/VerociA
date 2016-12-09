import javax.swing.*;

/**
 * Created by Verőci Ádám on 2016.12.09..
 */
public class BlackJack extends JPanel{
    public JButton draw, reset;
    public JLabel user, house;

    public BlackJack(){
        user = new JLabel();
        user.setText("User played: ");
        house = new JLabel();
        house.setText("House played: ");
        draw = new JButton("Draw card");
        reset= new JButton("New game");
        this.add(user);
        this.add(house);
        this.add(draw);
        this.add(reset);
    }
}

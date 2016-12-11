/**
 * Created by Verőci Ádám on 2016.12.11..
 */
public class MoneyMarketAccount extends Account {
    public MoneyMarketAccount(int id, String accountType, float balance, String[] userInfo) {
        super(id, accountType, balance, userInfo);
        this.accountType ="Savings";
    }

    @Override
    public void audit(int id) {
        if (balance == 0) {
            result = true;
        }
        System.out.println("This is a " + result + " moneymarket account");
    }
}

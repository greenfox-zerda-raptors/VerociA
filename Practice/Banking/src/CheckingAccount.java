/**
 * Created by Verőci Ádám on 2016.12.11..
 */
public class CheckingAccount extends Account {


    public CheckingAccount(int id, String accountType, float balance, String[] userInfo) {
        super(id, accountType, balance, userInfo);
        this.accountType="Checking";
    }

    @Override
    public void audit(int id) {
        if (balance < 0) {
            System.out.println("This is a " + result + " checking account");
        }else{
            System.out.println("This is a " + result + " checking account");
        }
    }
}
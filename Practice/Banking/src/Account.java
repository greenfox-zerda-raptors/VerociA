/**
 * Created by Verőci Ádám on 2016.12.11..
 */
public class Account {
    int id;
    float balance;

    public Account(int id, float balance) {
        this.id = id;
        this.balance = 0;
    }

    public float getBalance(){
        return balance;
    }

    public float deposit(float moneyIn){
        balance += moneyIn;
        return balance;
    }

    public float withdraw(float moneyOut){
        balance -= moneyOut;
        return balance;
    }
}

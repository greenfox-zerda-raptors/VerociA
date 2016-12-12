/**
 * Created by Verőci Ádám on 2016.12.11..
 */
public abstract class Account {
    int id;
    String accountType;
    float balance;
    boolean result;
    String [] userInfo = {"firstname", "lastname", "address"};

    public Account(int id, String accountType, float balance, String[] userInfo) {
        this.id = id;
        this.accountType = accountType;
        this.balance = 0;
        this.userInfo = userInfo;
    }

    public float getBalance(){
        return balance;
    }

    public float deposit(float moneyIn){
        balance += moneyIn;
        return balance;
    }

    public float withdraw(float moneyOut) {
        balance -= moneyOut;
        return balance;
    }

    public abstract void audit(int id);

    public void transfer(float amount, Account To){
        this.balance -= amount;
        To.balance += amount;
    }
}
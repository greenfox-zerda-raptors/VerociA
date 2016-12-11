/**
 * Created by Verőci Ádám on 2016.12.11..
 */
public class BankApp {
    public static void main(String[] args) {
        Account account = new Account(1,0);
        account.deposit(100);
        System.out.println(account.getBalance());
        account.withdraw(20);
        System.out.println(account.getBalance());

    }
}

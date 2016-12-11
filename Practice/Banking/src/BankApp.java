/**
 * Created by Verőci Ádám on 2016.12.11..
 */
public class BankApp {
    public static void main(String[] args) {
        Account account = new CheckingAccount(1,"", 0, new String []{"Adam", "Bela", "cim"});
        account.deposit(100);
        System.out.println(account.getBalance());
        account.withdraw(20);
        System.out.println(account.getBalance());
        account.audit(1);

    }
}

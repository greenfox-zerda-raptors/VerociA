/**
 * Created by Verőci Ádám on 2016.12.11..
 */
public class BankApp {
    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount(1,"", 0, new String []{"Adam", "Bela", "cim"});
        checkingAccount.deposit(100);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(20);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.audit(1);

        Account savingAccount = new SavingsAccount(2,"", 0, new String []{"Krisztina", "Szabo", "cim2"});
        savingAccount.deposit(50);
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getBalance());
        savingAccount.audit(2);

    }
}

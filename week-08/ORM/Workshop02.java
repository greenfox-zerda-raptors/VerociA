/**
 * Created by Verőci Ádám on 2016.12.14..
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Workshop02 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://localhost:3306/workshop02 ? user=root & password=admin & serverTimezone=UTC & useSSL=false";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Captain America", "Iron Man", "Wolverine", "Hulk", "Loki"));
        ArrayList<String> pass = new ArrayList<>(Arrays.asList("uejnsd632**234.", "#kfso.234.", "uejnsd#", "password", "DVSC"));

        for (int i = 0; i < names.size(); i++) {
            Account account = new Account(names.get(i), pass.get(i));
            createAccountIfNotExists(accountDao, account);
            account = accountDao.queryForId(names.get(i));
        }


        for (Account acc : accountDao){
            System.out.println(acc.getName());
        }

        List<Account> accountList = accountDao.queryBuilder()
                .orderBy("name", true)
                .query();

        for(Account a: accountList){
            System.out.println(a.getName());
        }
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}

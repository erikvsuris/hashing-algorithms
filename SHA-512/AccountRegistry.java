import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

public class AccountRegistry {
    private static Set<Account> accountRegistry = new HashSet<>();

    public static boolean registerAccount(Account newAccount) {
        if (newAccount == null) return false;
        accountRegistry.add(newAccount);
        return true;
    }

    public static boolean authenticateAccount(String emailAddress, String password) throws NoSuchAlgorithmException {
        if (emailAddress == null || password == null || accountRegistry.isEmpty())
            return false;

        Account requestedAccount = null;
        for (Account currentAccount : accountRegistry) {
            if (currentAccount.authenticateEmail(emailAddress))
                requestedAccount = currentAccount;
        }

        if (requestedAccount != null) 
            if (requestedAccount.authenticatePassword(password))
                return true;

        return false;
    }
}

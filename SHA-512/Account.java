import java.security.NoSuchAlgorithmException;

public class Account {
    private String emailAddress;
    private String password;

    public Account(String emailAddress, String password) throws NoSuchAlgorithmException {
        this.emailAddress = emailAddress;
        this.password = passwordHashing(password);
    }

    public boolean authenticateEmail(String emailForAuthentication) {
        if (emailAddress.equals(emailForAuthentication)) return true;
        return false;
    }
    
    public boolean authenticatePassword(String passwordForAuthentication) throws NoSuchAlgorithmException {
        if (passwordHashing(passwordForAuthentication).equals(password.toString())) return true;
        return false;
    }
    
    private String passwordHashing(String input) throws NoSuchAlgorithmException {
        return Hash.generateHashDigest(input);
    }
}
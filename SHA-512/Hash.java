import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    public static String generateHashDigest(String input) throws NoSuchAlgorithmException {
        if (input == null) throw new NullPointerException();

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        byte[] hashedBytes = messageDigest.digest(input.getBytes());
        
        String hexString = new String();
        for (byte b : hashedBytes) {
            String hexByte = Integer.toHexString(0xff & b);
            if (hexByte.length() == 1) {
                hexString += '0';
            }
            hexString += hexByte;
        }

        return hexString;
    }
}
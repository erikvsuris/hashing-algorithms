import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        runMenu();
    }

    public static void runMenu() throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        int operation = 0;
        do {
            System.out.println("\n\n-- Pandora's Cipher Vault Authentication --\n");
            System.out.println("1 - Sign up");
            System.out.println("2 - Sign in");
            System.out.println("0 - Exit");
            System.out.print("\nPlease, enter the operation you want to perform: ");
            operation = input.nextInt();
            switch (operation) {
                case 1 -> runSignUpMenu(input);
                case 2 -> runSignInMenu(input);
                case 0 -> System.out.println("\nFinishing program execution...");
                default -> System.out.println("\nInvalid input! Please, try again.");
            }
        } while (operation != 0);
    
        input.close();
    }

    public static void runSignUpMenu(Scanner input) throws NoSuchAlgorithmException {
        String emailAddress;
        String password;
        String passwordValidation;
        do {
            System.out.println("\n\n-- Sign Up Menu --");
                System.out.print("\n>>> Please, enter your email address: " );
                emailAddress = input.next();
                if (emailAddress != null) {
                    System.out.print("\n>>> Please, enter your password: " );
                    password = input.next();
                    if (password != null) {
                        System.out.print("\n>>> Please, enter your password again: " );
                        passwordValidation = input.next();
                        if (passwordIsValid(password, passwordValidation)) {
                            if (AccountRegistry.registerAccount(new Account(emailAddress, password)))
                                System.out.println("\nAccount registered successfully!");
                                break;
                        }
                    }
                }
        } while (true);
    }
    
    public static boolean passwordIsValid(String password, String passwordValidation) {
        if (password.equals(passwordValidation)) return true;
        return false;
    }

    public static void runSignInMenu(Scanner input) throws NoSuchAlgorithmException {
        String emailAddress;
        String password;
        do {
            System.out.println("\n\n-- Sign In Menu --");
            System.out.print("\n>>> Please, enter your email address: " );
            emailAddress = input.next();
            if (emailAddress != null) {
                System.out.print("\n>>> Please, enter your password: " );
                password = input.next();
                if (AccountRegistry.authenticateAccount(emailAddress, password))
                    System.out.println("Account successfully authenticated!");
                    else System.out.println("Incorrect email or password! Try again.");
                break;
            }
        } while (true);
    }
    
}

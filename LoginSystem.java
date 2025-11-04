class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class LoginSystem {
    public static void validate(String user, String pass) throws InvalidCredentialsException {
        String validUser = "admin";
        String validPass = "1234";

        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
    }

    public static void main(String[] args) {
        try {
            validate("admin", "0000");
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}

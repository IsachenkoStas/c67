package HomeTask13;

public class AccountSignIn {
    public static boolean signIn(String login, String password, String confirmPassword) {
        if (login.matches("^.{20,}$") || login.matches(".*\\s+.*")) {
            try {
                throw new WrongLoginException(login);
            } catch (WrongLoginException exception) {
                exception.printStackTrace();
            }
        } else if (password.matches("^.{20,}$") || password.matches(".*\\s+.*") || password.matches("[^\\d]*")) {
            try {
                throw new WrongPasswordException(password);
            } catch (WrongPasswordException e) {
                e.printStackTrace();
            }
        } else if (!confirmPassword.equals(password)) {
            try {
                throw new WrongPasswordException(password);
            } catch (WrongPasswordException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Welcome to your account");
            return true;
        }
        return false;
    }
}


package HomeTask13;

public class WrongPasswordException extends Exception {
    private String password;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Wrong password: " + " ' " + password + " ' ";
    }
}

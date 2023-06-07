package HomeTask13;

public class WrongLoginException extends Exception {
    private String login;

    public WrongLoginException() {
    }

    public WrongLoginException(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Login: " + " ' " + login + " ' " + " is incorrect. Probably too many symbols. One more try. ";
    }
}

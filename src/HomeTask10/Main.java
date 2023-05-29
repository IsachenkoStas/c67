package HomeTask10;

public class Main {
    public static void main(String[] args) {
        SystemUser s1 = new SystemUser("James Bond", "qwerty");
        SystemUser s2 = new SystemUser("James Bond", "qwerty");
        SystemUser s3 = new SystemUser("Jason Born", "qwerty");
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));
    }
}

public class MainPerson {
    public static void main(String[] args) {
        ClassPerson classPerson1 = new ClassPerson();
        ClassPerson classPerson2 = new ClassPerson("Stas", 24);

        classPerson1.movePerson();
        classPerson1.talkPerson("go home");

        classPerson2.movePerson();
        classPerson2.talkPerson("bye");
    }
}

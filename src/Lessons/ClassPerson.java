package Lessons;

public class ClassPerson {
    String fullName;
    int age;

    public ClassPerson(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public ClassPerson(){

    }

    void talkPerson(String text){
        System.out.println(fullName + " talk " + text);
    }
    void movePerson(){
        System.out.println(fullName + " walk ");

    }

}

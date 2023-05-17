package OOP;

public class Chelovek {
/*    String name;
    int age;
    double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void showInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
    }*/

/*    public String name = "Stas";
    int age = 24;
    private String gender = "Man";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }*/

    public final static String name;

    static {
        name  = "Stas";
    }

    public final static void sayMyName() {
        System.out.println(name);
    }
}

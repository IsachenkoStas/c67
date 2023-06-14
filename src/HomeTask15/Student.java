package HomeTask15;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int group;
    private int course;
    private int grades;

    public Student(String name, int group, int course, int grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", group = " + group +
                ", course = " + course +
                ", grades = " + grades +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        if (group > 0) {
            this.group = group;
        } else {
            System.out.println("wrong number");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0) {
            this.course = course;
        } else {
            System.out.println("wrong number");
        }
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        if (grades > 0) {
            this.grades = grades;
        } else {
            System.out.println("wrong number");
        }
    }
}

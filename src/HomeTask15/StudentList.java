package HomeTask15;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public static void checkGrades(ArrayList<Student> studentList) {
        studentList.removeIf(s -> s.getGrades() < 3);
        for (Student s : studentList) {
            if (s.getGrades() >= 3) {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> studentList, int course) {
        for (Student s : studentList) {
            if (s.getCourse() == course) {
                System.out.println(s);
            }
        }
    }
}

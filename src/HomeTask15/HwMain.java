package HomeTask15;

import java.util.ArrayList;
import java.util.LinkedList;

public class HwMain {
    public static void main(String[] args) {

        // Task 1
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        String[] arr = line.split(" ");
//        HashSet<String> list = new HashSet<>(Arrays.asList(arr));
//        System.out.println(list);
//
//        Task 2
//        Animals a = new Animals(new LinkedList<String>());
//        a.getAnimals().add("tiger");
//        a.getAnimals().add("snake");
//        a.getAnimals().add("lion");
//        System.out.println(a.getAnimals());
//        a.getAnimals().remove();
//        System.out.println(a.getAnimals());
//        a.getAnimals().add("fish");
//        System.out.println(a.getAnimals());

//        // Task 3
//        Student student1 = new Student("stas", 1, 1, 5);
//        Student student2 = new Student("vasya", 2, 2, 3);
//        Student student3 = new Student("kolya", 3, 3, 2);
//        Student student4 = new Student("roma", 1, 2, 1);
//
//        ArrayList<Student> studentList = new ArrayList<>();
//
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//
//        StudentList.checkGrades(studentList);
//        StudentList.printStudents(studentList, 2);

        // task 4
        MyOwnList<Integer> list = new MyOwnList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
//        System.out.println(list);
//        list.remove(3);
//        System.out.println(list);
//        System.out.println(list.getElem(2));
//        System.out.println(list.contains(10));
//        list.clear();
        System.out.println(list);
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1,"rajiv",100));
        students.add(new Student(7,"abhi", 400));
        students.add(new Student(5,"mohan",300));
        System.out.println(students);
        Collections.sort(students,new IdCompare());
        System.out.println(students);

        Collections.sort(students,new NameCompare());
        System.out.println(students);
    }
}
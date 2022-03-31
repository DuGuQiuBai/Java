package day12.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student("a", 12);
        Student s2 = new Student("b", 12);
        Student s3 = new Student("c", 12);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s2);

        Iterator<Student> s = list.iterator();
        while (s.hasNext()) {
            Student test = s.next();
            System.out.println(test.getName() + ", " + test.getAge());
        }
        System.out.println("-------------");
        for (int i = 0; i < list.size(); i++) {
            Student demo = list.get(i);
            System.out.println(demo.getName() + ", " + demo.getAge());
        }
        System.out.println("-------------");
        for (Student student : list) {
            System.out.println(student.getName() + ", " + student.getAge());
        }
    }
}

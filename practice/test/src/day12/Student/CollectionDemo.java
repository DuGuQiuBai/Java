package day12.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> s = new ArrayList<Student>();
        Student s1 = new Student("abc", 14);
        Student s2 = new Student("def", 16);
        Student s3 = new Student("ghi", 18);

        s.add(s1);
        s.add(s2);
        s.add(s3);

        Iterator<Student> it = s.iterator();
        while (it.hasNext()) {
            Student sss = it.next();
            System.out.println(sss.getName() + ", " + sss.getAge());
        }

    }
}

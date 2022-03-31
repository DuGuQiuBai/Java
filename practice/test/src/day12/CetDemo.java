package day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CetDemo {
    public static void main(String[] args) {
        Set<String> ss = new HashSet<String>();
        ss.add("hello");
        ss.add("world");
        ss.add("java");

        for (String test : ss) {
            System.out.println(test);
        }

        Iterator<String> itr = ss.iterator();
        while (itr.hasNext()) {
            System.out.println(ss.getClass().hashCode());
        }
    }
}

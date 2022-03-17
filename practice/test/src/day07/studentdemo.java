package day07;

public class studentdemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("linqing");
        s1.setAge(10);
        s1.show();

        Student s2 = new Student("lingqing", 29);
        s2.show();
    }
}

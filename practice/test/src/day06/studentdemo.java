package day06;

public class studentdemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 30;
        s.name = "daqing";
        s.study();
        s.doHomework();
        System.out.println(s.age);
        System.out.println(s.name);
    }
}

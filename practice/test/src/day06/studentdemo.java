package day06;

public class studentdemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(30);
        s.name = "daqing";
        s.show();
        s.study();
        s.doHomework();
        System.out.println(s.getAge() + "-----" + s.name);
        // System.out.println(s.age);
        // System.out.println(s.name);
    }
}

package day09;

public class Teacher extends Human {
    public Teacher() {

    }

    public Teacher(String name, String age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("TEACHER");
    }
}

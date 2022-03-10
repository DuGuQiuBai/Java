package day06;

public class Student {
    String name;
    int age;
    public void setAge(int a) {
        if (a < 0 || a > 120) {
            System.out.println("数据有误");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + ", " + age);
    }

    public void study() {
        System.out.println("好好学习");
    }

    public void doHomework() {
        System.out.println("作用青山不付出");
    }
}

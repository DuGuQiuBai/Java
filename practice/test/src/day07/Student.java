package day07;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        if (age < 120 && age > 0) {
            this.age = age;
        } else {
            System.out.println("输入的年龄有误");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 120 && age > 0) {
            this.age = age;
        } else {
            System.out.println("输入的年龄有误");
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}

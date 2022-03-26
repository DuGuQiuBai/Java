package day10.jiekou;

public class Cat extends Animal implements Jumping {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void jumping() {
        System.out.println("cat jump");
    }
}

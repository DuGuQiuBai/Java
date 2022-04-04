package day10.jiekou;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("biubiu");
        cat.setAge(1);
        System.out.println(cat.getName() + ", " + cat.getAge());
        cat.eat();
        cat.jumping();
    }
}

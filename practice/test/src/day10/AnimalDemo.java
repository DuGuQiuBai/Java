package day10;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.setAge(4);
        cat.setName("biubiu");
        System.out.println(cat.getName() + ", " + cat.getAge());
        cat.eat();

        Animal cat1 = new Cat("nana", 22);
        System.out.println(cat1.getName() + ", " + cat1.getAge());
        cat1.eat();
    }
}

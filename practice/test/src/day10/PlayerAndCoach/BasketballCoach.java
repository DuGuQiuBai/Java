package day10.PlayerAndCoach;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃牛肉");
    }

    @Override
    public void Teach() {
        System.out.println("篮球教练教篮球");
    }
}

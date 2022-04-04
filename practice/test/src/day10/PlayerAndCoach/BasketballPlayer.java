package day10.PlayerAndCoach;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃猪肉");
    }

    @Override
    public void Study() {
        System.out.println("篮球运动员学篮球");
    }
}

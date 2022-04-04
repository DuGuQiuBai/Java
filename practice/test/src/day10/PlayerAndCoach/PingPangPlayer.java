package day10.PlayerAndCoach;

public class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer() {

    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃鸭肉");
    }

    @Override
    public void Study() {
        System.out.println("乒乓球运动员学乒乓球");
    }

    @Override
    public void Speak() {
        System.out.println("乒乓球运动员学习英语");
    }
}

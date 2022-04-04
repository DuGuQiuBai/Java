package day10.PlayerAndCoach;

public class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃羊肉");
    }

    @Override
    public void Teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void Speak() {
        System.out.println("乒乓球教练学英语");
    }
}

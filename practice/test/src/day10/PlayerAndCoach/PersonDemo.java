package day10.PlayerAndCoach;

public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("zhanghao");
        ppp.setAge(22);
        System.out.println(ppp.getName() + ", " + ppp.getAge());
        ppp.eat();
        ppp.Study();
        ppp.Speak();

        PingPangCoach ppc = new PingPangCoach();
        ppc.setName("niuyan");
        ppc.setAge(32);
        System.out.println(ppc.getName() + ", " + ppc.getAge());
        ppc.eat();
        ppc.Teach();
        ppc.Speak();

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("paoyan");
        bp.setAge(20);
        System.out.println(bp.getName() + ", " + bp.getAge());
        bp.eat();
        bp.Study();

        BasketballCoach bc = new BasketballCoach("zhangwang", 34);
        System.out.println(bc.getName() + ", " + bc.getAge());
        bc.eat();
        bc.Teach();
    }
}

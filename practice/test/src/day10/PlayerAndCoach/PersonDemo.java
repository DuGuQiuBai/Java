package day10.PlayerAndCoach;
/*
①定义说英语接口                         成员方法:说英语();
②定义抽象人类                           成员变量:姓名，年龄;构造方法:无参，带参;成员方法:get/set方法，吃饭(;
③定义抽象教练类，继承人类                构造方法:无参，带参;成员方法:教();
④定义抽象运动员类，继承人类              构造方法:无参，带参;成员方法:学习);
⑤定义具体篮球教练类，继承教练类          构造方法:无参，带参;成员方法:重写吃饭(){...}，重写教(){..}
⑥定义具体乒乓球教练类，继承教练类，实现说英语接口   
        构造方法:无参，带参;成员方法:重写吃饭(){...}，重写教(){...}，重写说英语(){.….}
⑦定义具体篮球运动员类，继承运动员类     构造方法:无参，带参;成员方法:重写吃饭(){.....}，重写学习(){…}
⑧定义具体乒乓球运动员类，继承运动员类，实现说英语接口
        构造方法:无参，带参;成员方法:重写吃饭(){...}，重写学习(){...}，重写说英语(){..}
⑨定义测试类，写代码测试

*/
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

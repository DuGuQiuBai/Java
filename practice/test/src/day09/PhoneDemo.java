package day09;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        String name = "zyc";
        p.call(name);
        System.out.println("------------");
        NewPhone pp = new NewPhone();
        pp.call(name);
    }
}

package day09;

public class HumanDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("lqx");
        t1.setAge("15");
        System.out.println(t1.getName() + ", " + t1.getAge());
        t1.teach();
        System.out.println("---------");
        Teacher t2 = new Teacher("lsp", "24");
        System.out.println(t2.getName() + ", " + t2.getAge());
        t2.teach();
    }
}

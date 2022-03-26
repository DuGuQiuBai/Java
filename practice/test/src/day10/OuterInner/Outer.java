package day10.OuterInner;

public class Outer {

    private int age = 10;

    public class Inner {
        public void show() {
            System.out.println(age);
        }
    }
}

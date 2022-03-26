package day09;

public class NewPhone extends Phone {
    @Override
    public void call(String name) {
        System.out.println("OPen the portal");
        super.call(name);
    }
}

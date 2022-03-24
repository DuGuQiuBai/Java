package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;


public class manager {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        //Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------Welcome to the StudentManager System------");
            System.out.println("1 Add Students");
            System.out.println("2 Delete Students");
            System.out.println("3 Change Info");
            System.out.println("4 Check All");
            System.out.println("5 Quit");
            System.out.println("Please insert your choice: ");


            switch (sc.nextLine()) {
                case "1":
                addStudent(array);
                break;
                case "2":
                System.out.println("Delete Students");
                break;
                case "3":
                System.out.println("Change Info");
                break;
                case "4":
                System.out.println("Check All");
                break;
                case "5":
                System.out.println("Thanks for Using");
                sc.close();
                System.exit(0);
                default:
                System.out.println("Please choose the right one");
                break;
            }
        }
    }
    
    // 添加学生
    public static void addStudent(ArrayList<Student> array) {
        //Scanner sc1 = new Scanner(System.in);

        System.out.print("Please input id:");
        String sid = sc.nextLine();
        System.out.print("Please input name:");
        String name = sc.nextLine();
        System.out.print("Please input age:");
        String age = sc.nextLine();
        System.out.print("Please input address:");
        String address = sc.nextLine();

        // 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 添加学生到集合里
        array.add(s);
        System.out.println("Add Succeed!");
    }
}

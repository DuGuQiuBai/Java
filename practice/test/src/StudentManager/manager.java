package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class manager {
    static Scanner sc = new Scanner(System.in);

    public void close() {
        sc.close();
    }

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        // Scanner sc = new Scanner(System.in);
        while (true) {
            PrintTable();

            switch (sc.nextLine()) {
                case "1":
                    AddStudent(array);
                    break;
                case "2":
                    DeleteStudent(array);
                    ;
                    break;
                case "3":
                    System.out.println("Change Info");
                    break;
                case "4":
                    CheckAll(array);
                    break;
                case "5":
                    System.out.println("Thanks for Using");
                    sc.close();
                    return;
                default:
                    System.out.println("Please choose the right one");
                    break;
            }
        }

    }
    // 打印表头
    public static void PrintTable() {
        System.out.println("------Welcome to the StudentManager System------");
        System.out.println("1 Add Students");
        System.out.println("2 Delete Students");
        System.out.println("3 Change Info");
        System.out.println("4 Check All");
        System.out.println("5 Quit");
        System.out.println("Please input your choice: ");
    }

    // 添加学生
    public static void AddStudent(ArrayList<Student> array) {
        // Scanner sc1 = new Scanner(System.in);

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

    // 删除学生
    public static void DeleteStudent(ArrayList<Student> array) {
        System.out.print("Please input student's id:");
        String sid = sc.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
        }
        System.out.println("Delete Succeed!");
    }

    // 查看学生
    public static void CheckAll(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("No data, please input students' info!");
            return;
        }

        // 表头信息
        System.out.println("id\t\tname\t\tage\taddress");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }
}